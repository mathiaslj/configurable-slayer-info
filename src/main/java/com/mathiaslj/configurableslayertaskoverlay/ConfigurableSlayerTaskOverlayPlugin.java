/*
 * Copyright (c) 2022, BrastaSauce
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.mathiaslj.configurableslayertaskoverlay;

import javax.inject.Inject;

import com.mathiaslj.configurableslayertaskoverlay.models.SlayerTask;
import com.mathiaslj.configurableslayertaskoverlay.utils.SlayerTaskOverlay;
import com.mathiaslj.configurableslayertaskoverlay.utils.SlayerTaskWorldMapPoint;
import com.google.inject.Provides;


import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.WorldView;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.gameval.InterfaceID;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.npcoverlay.NpcOverlayService;
import net.runelite.client.events.PluginMessage;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.worldmap.WorldMapPointManager;
import net.runelite.client.util.Text;
import net.runelite.api.widgets.ComponentID;
import net.runelite.api.RenderOverview;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@PluginDescriptor(
        name = "Configurable Slayer Task Overlay",
        description = "Configure overlay info to display when receiving slayer task",
        tags = {"slayer", "overlay", "task", "configurable"}
)
public class ConfigurableSlayerTaskOverlayPlugin extends Plugin {
    private static final Pattern SLAYER_ASSIGN_MESSAGE = Pattern.compile("Your new task is to kill \\d+ (?<name>.+?)s?\\.");
    private static final Pattern SLAYER_CURRENT_MESSAGE = Pattern.compile("You're still hunting (?<name>.+?)s?[,;] you have \\d+ to go\\.");
    private static final Pattern SLAYER_CURRENT_CHAT_MESSAGE = Pattern.compile("You're assigned to kill (?<name>.+?)s?[,;] only \\d+ more to go\\.");

    private static final Pattern KONAR_CHAT_PATTERN = Pattern.compile(".+ bring(?:ing)? balance to (?:\\d+ )?(?<name>.+?)s?(?:,|;|in).+");

    private final Set<NPC> targets = new HashSet<>();

    private final String DEBUG_MENU_WORLD_POINT_ONE = "Set WorldPoint1 (Turael Skipping)";
    private final String DEBUG_MENU_WORLD_POINT_TWO = "Set WorldPoint2 (Turael Skipping)";
    private final String DEBUG_MENU_RESET_WORLD_POINTS = "Reset WorldPoints (Turael Skipping)";
    private final String DEBUG_MENU_COPY_TO_CLIPBOARD = "Copy WorldPoints to clipboard (Turael Skipping)";

    private WorldPoint debugWorldPointOne;
    private WorldPoint debugWorldPointTwo;
    private SlayerTaskRegistry slayerTaskRegistry;

    @Inject
    private Client client;

    @Inject
    private ConfigurableSlayerTaskOverlayConfig config;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private NpcOverlayService npcOverlayService;

    @Inject
    private WorldMapPointManager worldMapPointManager;

    @Inject
    private SlayerTaskOverlay slayerTaskOverlay;

    @Inject
    private EventBus eventBus;

    @Getter
    private SlayerTask currentSlayerTask;

    @Override
    protected void startUp() {
        overlayManager.add(slayerTaskOverlay);

        slayerTaskRegistry = new SlayerTaskRegistry(config);
    }

    @Override
    protected void shutDown() {
        overlayManager.remove(slayerTaskOverlay);
        worldMapPointManager.removeIf(SlayerTaskWorldMapPoint.class::isInstance);

        completeTask();
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Widget chatBoxNpcName = client.getWidget(InterfaceID.ChatLeft.NAME);
        Widget chatBoxNpcText = client.getWidget(InterfaceID.ChatLeft.TEXT);

        // Check if current widget is a slayer master
        if (chatBoxNpcName != null && chatBoxNpcText != null &&
                (chatBoxNpcName.getText().equalsIgnoreCase("turael") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("aya") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("spria") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("krystilia") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("mazchna") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("achtryn") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("vannaka") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("chaeldar") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("konar quo maten") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("nieve") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("steve") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("duradel") ||
                        chatBoxNpcName.getText().equalsIgnoreCase("kuradel")
                )
        ) {
            String npcText = Text.sanitizeMultilineText(chatBoxNpcText.getText());
            String taskName = getTaskName(npcText);

            if (taskName != null) {
                startTask(taskName);
            }
        }
    }

    @Subscribe
    public void onChatMessage(ChatMessage event) {
        if (event.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }

        String chatMessage = Text.removeTags(event.getMessage());

        if (currentSlayerTask == null) {
            String taskName = getTaskName(chatMessage);

            if (taskName != null) {
                startTask(taskName);
            }
        } else {
            if (chatMessage.startsWith("You've completed") && chatMessage.toLowerCase().contains("slayer master")) {
                completeTask();
            }
        }
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged event) {
        // Ignore changes from other plugins
        if (!event.getGroup().equals(ConfigurableSlayerTaskOverlayConfig.CONFIG_GROUP_NAME)) {
            return;
        }

        slayerTaskRegistry.rebuildTasks();

        // Set a dummy task
        if (event.getKey().equals("debugTask")) {
            if (event.getNewValue() == null) {
                return;
            }

            // Always clear task to reset area outline/tagged NPC's
            this.completeTask();

            if (!event.getNewValue().equals("None")) {
                this.startTask(event.getNewValue().toLowerCase().replace("_", " ").replaceFirst("s$", ""));
            }
        }
    }

    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded menuEntryAdded) {
        /*
        if (!config.enableWorldPointSelector()) {
            return;
        }

        // Only add the menu entry when you can walk, so it doesn't get added when you are right-clicking in the bank
        if (menuEntryAdded.getOption().equals("Walk here")) {
            // Add options in reverse, so it shows up correctly in the right click menu
            client.getMenu()
                    .createMenuEntry(-1)
                    .setOption(DEBUG_MENU_RESET_WORLD_POINTS)
                    .setTarget(menuEntryAdded.getTarget())
                    .setType(MenuAction.RUNELITE)
                    .onClick(menuEntry -> {
                        debugWorldPointOne = null;
                        debugWorldPointTwo = null;
                    });

            client.getMenu()
                    .createMenuEntry(-1)
                    .setOption(DEBUG_MENU_COPY_TO_CLIPBOARD)
                    .setTarget(menuEntryAdded.getTarget())
                    .setType(MenuAction.RUNELITE)
                    .onClick(menuEntry -> {
                        if (debugWorldPointOne != null && debugWorldPointTwo != null) {
                            String copyString = "new WorldPoint(" + debugWorldPointOne.getX() + ", " + debugWorldPointOne.getY() + ", " + debugWorldPointOne.getPlane() + "), " +
                                    "new WorldPoint(" + debugWorldPointTwo.getX() + ", " + debugWorldPointTwo.getY() + ", " + debugWorldPointTwo.getPlane() + ")";

                            StringSelection selection = new StringSelection(copyString);
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                            clipboard.setContents(selection, null);

                            client.addChatMessage(ChatMessageType.GAMEMESSAGE, "Turael Skipping", "Copied the WorldPoints to your clipboard.", "Turael Skipping");
                        }
                    });

            client.getMenu()
                    .createMenuEntry(-1)
                    .setOption(DEBUG_MENU_WORLD_POINT_TWO)
                    .setTarget(menuEntryAdded.getTarget())
                    .setType(MenuAction.RUNELITE)
                    .setIdentifier(menuEntryAdded.getIdentifier());

            client.getMenu()
                    .createMenuEntry(-1)
                    .setOption(DEBUG_MENU_WORLD_POINT_ONE)
                    .setTarget(menuEntryAdded.getTarget())
                    .setType(MenuAction.RUNELITE)
                    .setIdentifier(menuEntryAdded.getIdentifier());
        }
        */

        // Check if the menu is for the world map
        final Widget map = client.getWidget(ComponentID.WORLD_MAP_MAPVIEW);
        if (map == null)
        {
            return;
        }

        if (menuEntryAdded.getOption().equals("Cancel") ||
                menuEntryAdded.getOption().equals("Walk here"))
        {
            // Adding right-click menu on map
            // Add your custom menu entry
            client.getMenu()
                    .createMenuEntry(1)
                    .setOption("Set")
                    .setTarget("<col=ff9040>Slayer Location</col>")
                    .setType(MenuAction.RUNELITE)
                    .onClick(e -> onMapClick());
        }
    }

    @Subscribe
    public void onMenuOptionClicked(MenuOptionClicked event) {
        if (!event.getMenuOption().equals(DEBUG_MENU_WORLD_POINT_ONE) && !event.getMenuOption().equals(DEBUG_MENU_WORLD_POINT_TWO)) {
            return;
        }

        WorldView worldView = client.getLocalPlayer().getWorldView();
        Tile selectedSceneTile = worldView.getSelectedSceneTile();

        if (selectedSceneTile == null) {
            return;
        }

        if (event.getMenuOption().equals(DEBUG_MENU_WORLD_POINT_ONE)) {
            this.debugWorldPointOne = selectedSceneTile.getWorldLocation();

            client.addChatMessage(ChatMessageType.GAMEMESSAGE, "Turael Skipping", "First WorldPoint has been selected.", "Turael Skipping");
        } else if (event.getMenuOption().equals(DEBUG_MENU_WORLD_POINT_TWO)) {
            this.debugWorldPointTwo = selectedSceneTile.getWorldLocation();

            client.addChatMessage(ChatMessageType.GAMEMESSAGE, "Turael Skipping", "Second WorldPoint has been selected.", "Turael Skipping");
        }
    }

    @Provides
    ConfigurableSlayerTaskOverlayConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(ConfigurableSlayerTaskOverlayConfig.class);
    }

    private void startTask(String taskName) {
        SlayerTask lookupSlayerTask = slayerTaskRegistry.getSlayerTaskByNpcName(taskName);

        if (lookupSlayerTask != null) {
            this.currentSlayerTask = lookupSlayerTask;

            if (config.enableWorldMapIcon()) {
                for (WorldPoint worldPoint : currentSlayerTask.getWorldMapLocations()) {
                    worldMapPointManager.add(new SlayerTaskWorldMapPoint(worldPoint));
                }
            }

            if (config.useShortestPath()) {
                WorldPoint location = currentSlayerTask.getShortestPathWorldPoint();
                setShortestPath(location);
            }

            // Target NPC's visible to the player in case they are already at the location
            Player player = client.getLocalPlayer();

            // Player is null when you select a task from the debug menu whe not logged in
            if (player != null) {
                WorldView worldView = player.getWorldView();

                for (NPC npc : worldView.npcs()) {
                    for (int targetNpcId : currentSlayerTask.getNpcIds()) {
                        if (npc.getId() == targetNpcId) {
                            targets.add(npc);
                        }
                    }
                }
            }
        }
    }

    private void completeTask() {
        currentSlayerTask = null;
        targets.clear();

        worldMapPointManager.removeIf(SlayerTaskWorldMapPoint.class::isInstance);
    }

    private String getTaskName(String npcText) {
        Pattern[] patterns = {SLAYER_ASSIGN_MESSAGE, SLAYER_CURRENT_MESSAGE, SLAYER_CURRENT_CHAT_MESSAGE,
                KONAR_CHAT_PATTERN};

        for (Pattern pattern : patterns) {
            Matcher matcher = pattern.matcher(npcText);

            if (matcher.find()) {
                return matcher.group("name");
            }
        }

        return null;
    }

    private void setShortestPath(WorldPoint target) {
        if (target == null) {
            return;
        }

        Map<String, Object> data = new HashMap<>();
        data.put("target", target);
        eventBus.post(new PluginMessage("shortestpath", "path", data));
    }

    private void onMapClick() {
        // Get the world point from the map click
        final WorldPoint worldPoint = calculateMapPoint();

        if (worldPoint != null) {
            handleLocationSelected(worldPoint);
        }
    }

    private WorldPoint calculateMapPoint() {
        Widget map = client.getWidget(ComponentID.WORLD_MAP_MAPVIEW);
        if (map == null) {
            return null;
        }

        RenderOverview renderOverview = client.getRenderOverview();
        if (renderOverview == null) {
            return null;
        }

        float zoom = renderOverview.getWorldMapZoom();
        net.runelite.api.Point mapPosition = renderOverview.getWorldMapPosition();

        // Convert to WorldPoint
        WorldPoint worldMapPosition = new WorldPoint(mapPosition.getX(), mapPosition.getY(), client.getPlane());

        // Get mouse position as AWT Point
        net.runelite.api.Point mouseCanvas = client.getMouseCanvasPosition();
        java.awt.Point mousePoint = new java.awt.Point(mouseCanvas.getX(), mouseCanvas.getY());

        // Calculate the world point from mouse position
        int widgetX = mousePoint.x - map.getCanvasLocation().getX();
        int widgetY = mousePoint.y - map.getCanvasLocation().getY();

        int dx = (int) ((widgetX - map.getWidth() / 2) / zoom);
        int dy = (int) ((widgetY - map.getHeight() / 2) / zoom);

        return new WorldPoint(
                worldMapPosition.getX() + dx,
                worldMapPosition.getY() - dy,
                worldMapPosition.getPlane()
        );
    }

    private void handleLocationSelected(WorldPoint location) {
        // Your logic here - store the location, update UI, etc.
        log.info("Selected location: {}", location);
    }
}