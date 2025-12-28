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
package com.mathiaslj.configurableslayerinfo;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

import java.awt.Color;

@ConfigGroup(ConfigurableSlayerInfoConfig.CONFIG_GROUP_NAME)
public interface ConfigurableSlayerInfoConfig extends Config {
    String CONFIG_GROUP_NAME = "Configurable Slayer Info";

    public static final int BASE = 100;

    public static final int POSITION_ABERRANT_SPECTRES = BASE;
    public static final int POSITION_BATS = BASE + 1;
    public static final int POSITION_SKELETONS = BASE + 2;

    // General settings
    @ConfigSection(
            position = 0,
            name = "General settings",
            description = "General settings"
    )
    String generalSettings = "generalSettings";

    @ConfigItem(
            position = 0,
            keyName = "displayInfo",
            name = "Enable information box",
            description = "Whether to show an information box with information about the current task.",
            section = generalSettings
    )
    default boolean enableInformationBox() {
        return true;
    }

    @ConfigItem(
            position = 1,
            keyName = "automaticallyHideInformationBox",
            name = "Automatically hide information box",
            description = "Whether to automatically hide the information box when you are at your current task.",
            section = generalSettings
    )
    default boolean automaticallyHideInformationBox() {
        return true;
    }

    @ConfigItem(
            position = 2,
            keyName = "displayMapIcon",
            name = "Enable world map icon",
            description = "Displays an icon on the world map where the current task is located.",
            section = generalSettings,
            hidden = true
    )
    default boolean enableWorldMapIcon() {
        return false;
    }

    @ConfigItem(
            position = 3,
            keyName = "useShortestPath",
            name = "Use 'Shortest Path' plugin",
            description = "Draws the shortest path to the assigned task.<br/>" +
                    "The 'Shortest Path' plugin needs to be installed and enabled for this to work.",
            section = generalSettings,
            hidden = true
    )
    default boolean useShortestPath() {
        return false;
    }

    // Highlight settings
    @ConfigSection(
            position = 1,
            name = "NPC Highlight settings",
            description = "Customize NPC highlight settings"
    )
    String npcHighlightSettings = "npcHighlightSettings";

    @ConfigItem(
            position = 0,
            keyName = "enableNpcHighlight",
            name = "Enable NPC highlight",
            description = "Whether you want to highlight the NPC's from your current slayer task.",
            section = npcHighlightSettings
    )
    default boolean enableNpcHighlight() {
        return true;
    }

    @ConfigItem(
            position = 1,
            keyName = "npcHighlightMode",
            name = "NPC highlight mode",
            description = "Select how to highlight the NPC's.",
            section = npcHighlightSettings
    )
    default NpcHighlightMode getNpcHighlightMode() {
        return NpcHighlightMode.Tile;
    }

    @ConfigItem(
            position = 2,
            keyName = "npcColour",
            name = "NPC highlight colour",
            description = "Select the colour of the highlighted NPC's.",
            section = npcHighlightSettings
    )
    default Color getNpcColour() {
        return Color.decode("#DDFF00");
    }

    // Debug settings
    @ConfigSection(
            position = 3,
            name = "Debugging",
            closedByDefault = true,
            description = "Various debug settings"
    )
    String debugSettings = "debugSettings";

    @ConfigItem(
            position = 0,
            keyName = "debugTask",
            name = "Select a task",
            description = "Select a task to set as the current active task.",
            section = debugSettings
    )
    default DebugSlayerTask getDebugTask() {
        return DebugSlayerTask.None;
    }

    @ConfigItem(
            position = 1,
            keyName = "enableWorldPointSelector",
            name = "Enable WorldPoint selector",
            description = "Enables WorldPoint selector in the right click menu.",
            section = debugSettings,
            hidden = true
    )
    default boolean enableWorldPointSelector() {
        return false;
    }

    // Aberrant Spectres
    @ConfigSection(
            position = POSITION_ABERRANT_SPECTRES,
            name = "Aberrant Spectres",
            closedByDefault = true,
            description = "Information to display for slayer task"
    )
    String aberrantSpectresSettings = "aberrantSpectres";

    @ConfigItem(
            keyName = "Aberrant Spectres",
            name = "Aberrant Spectres information",
            description = "Create individual bullet points in overlay, one per line",
            section = aberrantSpectresSettings,
            position = 0
    )
    default String aberrantSpectresInfo() {
        return "Spirit tree (2) -> Run South West to Stronghold slayer cave -> Run South";
    }

    // Bats
    @ConfigSection(
            position = POSITION_BATS,
            name = "Bats",
            closedByDefault = true,
            description = "Information to display for slayer task"
    )
    String batsSettings = "batsSettings";

    @ConfigItem(
            keyName = "Bats",
            name = "Bats information",
            description = "Create individual bullet points in overlay, one per line",
            section = batsSettings,
            position = 0
    )
    default String batsInfo() {
        return "Digsite pendent -> run North";
    }

    // Skeletons
    @ConfigSection(
            position = POSITION_SKELETONS,
            name = "Skeletons",
            closedByDefault = true,
            description = "Information to display for slayer task"
    )
    String skeletonsSettings = "skeletonsSettings";

    @ConfigItem(
            keyName = "Skeletons",
            name = "Skeletons information",
            description = "Create individual bullet points in overlay, one per line",
            section = skeletonsSettings,
            position = 0
    )
    default String skeletonsInfo() {
        return "Catacombs of Kourend -> Run West";
    }
}

