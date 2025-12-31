/*
 * Copyright (c) 2025, wesley-221
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

import com.mathiaslj.configurableslayertaskoverlay.models.NpcLocation;
import com.mathiaslj.configurableslayertaskoverlay.models.SlayerTask;
import com.mathiaslj.configurableslayertaskoverlay.utils.WorldAreaUtils;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.gameval.NpcID;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SlayerTaskRegistry {

    private final ConfigurableSlayerTaskOverlayConfig config;

    // Map is built at runtime in the constructor, not static
    private Map<String, SlayerTask> tasks = new HashMap<>();

    public SlayerTaskRegistry(ConfigurableSlayerTaskOverlayConfig config) {
        this.config = config;
        rebuildTasks();
    }

    public void rebuildTasks()
    {
        tasks = Map.ofEntries(
                Map.entry("aberrant spectres", new SlayerTask("Aberrant spectres", List.of(NpcID.SLAYER_ABBERANT_SPECTRE_1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Aberrant spectres", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.aberrantSpectresInfo().split("\n"))
                ))),

                Map.entry("abyssal demons", new SlayerTask("Abyssal demons", List.of(NpcID.SLAYER_ABYSSAL), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Abyssal demons", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.abyssalDemonsInfo().split("\n"))
                ))),

                Map.entry("ankous", new SlayerTask("Ankous", List.of(NpcID.SOS_DEATH_ANKOU), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Ankous", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.ankousInfo().split("\n"))
                ))),

                Map.entry("aquanites", new SlayerTask("Aquanites", List.of(NpcID.SLAYER_AQUANITE), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Aquanites", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.aquanitesInfo().split("\n"))
                ))),

                Map.entry("araxytes", new SlayerTask("Araxytes", List.of(NpcID.ARAXYTE_BABY, NpcID.ARAXYTE_NORMAL, NpcID.ARAXYTE_LARGE), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Araxytes", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.araxytesInfo().split("\n"))
                ))),

                Map.entry("aviansie", new SlayerTask("Aviansie", List.of(NpcID.GODWARS_ARMADYL_MALE_ARMOR01_BLUE), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Aviansie", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.aviansieInfo().split("\n"))
                ))),

                Map.entry("bandits", new SlayerTask("Bandits", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Bandits", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.banditsInfo().split("\n"))
                ))),

                Map.entry("banshees", new SlayerTask("Banshees", List.of(1), List.of(
                        new WorldPoint(3442, 3542, 0)
                ), List.of(
                        new NpcLocation("Morytania Slayer Tower", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(3431, 3530, 0),
                                        new WorldPoint(3452, 3567, 0)
                                )
                        ), config.bansheesInfo().split("\n"))
                ))),

                Map.entry("basilisks", new SlayerTask("Basilisks", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Basilisks", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.basilisksInfo().split("\n"))
                ))),

                Map.entry("bats", new SlayerTask("Bats", List.of(NpcID.BAT), List.of(
                        new WorldPoint(3351, 3490, 0)
                ), List.of(
                        new NpcLocation("Bats", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(3327, 3475, 0),
                                        new WorldPoint(3398, 3507, 0)
                                )
                        ), config.batsInfo().split("\n"))
                ))),

                Map.entry("bears", new SlayerTask("Bears", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Bears", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.bearsInfo().split("\n"))
                ))),

                Map.entry("birds", new SlayerTask("Birds", List.of(NpcID.CHICKEN, NpcID.ROOSTER, NpcID.SEAGULL, NpcID.TERRORBIRD), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Birds", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.birdsInfo().split("\n"))
                ))),

                Map.entry("black demons", new SlayerTask("Black demons", List.of(NpcID.BLACK_DEMON), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Black demons", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.blackDemonsInfo().split("\n"))
                ))),

                Map.entry("black dragons", new SlayerTask("Black dragons", List.of(NpcID.BLACK_DRAGON), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Black dragons", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.blackDragonsInfo().split("\n"))
                ))),

                Map.entry("black knights", new SlayerTask("Black knights", List.of(NpcID.BLACK_KNIGHT), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Black knights", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.blackKnightsInfo().split("\n"))
                ))),

                Map.entry("bloodvelds", new SlayerTask("Bloodvelds", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Bloodvelds", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.bloodveldsInfo().split("\n"))
                ))),

                Map.entry("blue dragons", new SlayerTask("Blue dragons", List.of(NpcID.BLUE_DRAGON, NpcID.VORKATH), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Blue dragons", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.blueDragonsInfo().split("\n"))
                ))),

                Map.entry("brine rats", new SlayerTask("Brine rats", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Brine rats", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.brineRatsInfo().split("\n"))
                ))),

                Map.entry("catablepon", new SlayerTask("Catablepon", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Catablepon", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.catableponInfo().split("\n"))
                ))),

                Map.entry("cave bugs", new SlayerTask("Cave bugs", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Cave bugs", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.caveBugsInfo().split("\n"))
                ))),

                Map.entry("cave crawlers", new SlayerTask("Cave crawlers", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Cave crawlers", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.caveCrawlersInfo().split("\n"))
                ))),

                Map.entry("cave horrors", new SlayerTask("Cave horrors", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Cave horrors", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.caveHorrorsInfo().split("\n"))
                ))),

                Map.entry("cave slimes", new SlayerTask("Cave slimes", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Cave slimes", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.caveSlimesInfo().split("\n"))
                ))),

                Map.entry("cave kraken", new SlayerTask("Cave kraken", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Cave kraken", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.caveKrakenInfo().split("\n"))
                ))),

                Map.entry("chaos druids", new SlayerTask("Chaos druids", List.of(NpcID.CHAOS_DRUID), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Chaos druids", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.chaosDruidsInfo().split("\n"))
                ))),

                Map.entry("cockatrice", new SlayerTask("cockatrice", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("cockatrice", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.cockatriceInfo().split("\n"))
                ))),

                Map.entry("cows", new SlayerTask("Cows", List.of(NpcID.COW), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Cows", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.cowsInfo().split("\n"))
                ))),

                Map.entry("crabs", new SlayerTask("Crabs", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Crabs", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.crabsInfo().split("\n"))
                ))),

                Map.entry("crawling hands", new SlayerTask("Crawling hands", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Crawling hands", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.crawlingHandsInfo().split("\n"))
                ))),

                Map.entry("crocodiles", new SlayerTask("Crocodiles", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Crocodiles", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.crocodilesInfo().split("\n"))
                ))),

                Map.entry("custodian stalkers", new SlayerTask("Custodian stalkers", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Custodian stalkers", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.custodianStalkersInfo().split("\n"))
                ))),

                Map.entry("dagannoths", new SlayerTask("Dagannoths", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Dagannoths", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.dagannothsInfo().split("\n"))
                ))),

                Map.entry("dark beasts", new SlayerTask("Dark beasts", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Dark beasts", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.darkBeastsInfo().split("\n"))
                ))),

                Map.entry("dark warriors", new SlayerTask("Dark warriors", List.of(NpcID.DARK_WARRIOR), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Dark warriors", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.darkWarriorsInfo().split("\n"))
                ))),

                Map.entry("dogs", new SlayerTask("Dogs", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Dogs", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.dogsInfo().split("\n"))
                ))),

                Map.entry("drakes", new SlayerTask("Drakes", List.of(NpcID.DRAKE), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Drakes", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.drakesInfo().split("\n"))
                ))),

                Map.entry("dust devils", new SlayerTask("Dust devils", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Dust devils", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.dustDevilsInfo().split("\n"))
                ))),

                Map.entry("dwarves", new SlayerTask("Dwarves", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Dwarves", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.dwarvesInfo().split("\n"))
                ))),

                Map.entry("earth warriors", new SlayerTask("Earth warriors", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Earth warriors", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.earthWarriorsInfo().split("\n"))
                ))),

                Map.entry("elves", new SlayerTask("Elves", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Elves", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.elvesInfo().split("\n"))
                ))),

                Map.entry("ent", new SlayerTask("Ent", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Ent", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.entInfo().split("\n"))
                ))),

                Map.entry("fever spiders", new SlayerTask("Fever spiders", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Fever spiders", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.feverSpidersInfo().split("\n"))
                ))),

                Map.entry("fire giants", new SlayerTask("Fire giants", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Fire giants", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.fireGiantsInfo().split("\n"))
                ))),

                Map.entry("flesh crawlers", new SlayerTask("Flesh crawlers", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Flesh crawlers", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.fleshCrawlersInfo().split("\n"))
                ))),

                Map.entry("fossil island wyvern", new SlayerTask("Fossil island wyvern", List.of(NpcID.ANCIENT_WYVERN), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Fossil island wyvern", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.fossilIslandWyvernInfo().split("\n"))
                ))),

                Map.entry("frost dragons", new SlayerTask("Frost dragons", List.of(NpcID.FROST_DRAGON), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Frost dragons", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.frostDragonsInfo().split("\n"))
                ))),

                Map.entry("gargoyles", new SlayerTask("Gargoyles",
                        List.of(NpcID.SLAYER_GARGOYLE_1, NpcID.SLAYER_CAVE_GARGOYLE, NpcID.SUPERIOR_GARGOYLE),
                        List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Gargoyles", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.gargoylesInfo().split("\n"))
                ))),

                Map.entry("ghosts", new SlayerTask("Ghosts", List.of(NpcID.GHOST), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Ghosts", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.ghostsInfo().split("\n"))
                ))),

                Map.entry("ghouls", new SlayerTask("Ghouls", List.of(NpcID.GHOUL), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Ghouls", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.ghoulsInfo().split("\n"))
                ))),

                Map.entry("goblins", new SlayerTask("Goblins", List.of(NpcID.GOBLIN, NpcID.CAVE_GOBLIN), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Goblins", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.goblinsInfo().split("\n"))
                ))),

                Map.entry("greater demons", new SlayerTask("Greater demons", List.of(NpcID.GREATER_DEMON), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Greater demons", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.greaterDemonsInfo().split("\n"))
                ))),

                Map.entry("green dragons", new SlayerTask("Green dragons", List.of(NpcID.GREEN_DRAGON), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Green dragons", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.greenDragonsInfo().split("\n"))
                ))),

                Map.entry("gryphons", new SlayerTask("Gryphons", List.of(1), List.of(
                        new WorldPoint(0, 0, 0)
                ), List.of(
                        new NpcLocation("Gryphons", List.of(
                                WorldAreaUtils.fromCorners(
                                        new WorldPoint(0, 0, 0),
                                        new WorldPoint(0, 0, 0)
                                )
                        ), config.gryphonsInfo().split("\n"))
                ))),

                Map.entry("harpie bug swarms", new SlayerTask("Harpie bug swarms", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Harpie bug swarms", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.harpieBugSwarmsInfo().split("\n"))))),

                Map.entry("hellhounds", new SlayerTask("Hellhounds", List.of(NpcID.HELLHOUND, 1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Hellhounds", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.hellhoundsInfo().split("\n"))))),

                Map.entry("hill giants", new SlayerTask("Hill giants", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Hill giants", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.hillGiantsInfo().split("\n"))))),

                Map.entry("hobgoblins", new SlayerTask("Hobgoblins", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Hobgoblins", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.hobgoblinsInfo().split("\n"))))),

                Map.entry("hydras", new SlayerTask("Hydras", List.of(NpcID.HYDRA), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Hydras", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.hydrasInfo().split("\n"))))),

                Map.entry("icefiends", new SlayerTask("Icefiends", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Icefiends", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.icefiendsInfo().split("\n"))))),

                Map.entry("ice giants", new SlayerTask("Ice giants", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Ice giants", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.iceGiantsInfo().split("\n"))))),

                Map.entry("ice warriors", new SlayerTask("Ice warriors", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Ice warriors", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.iceWarriorsInfo().split("\n"))))),

                Map.entry("infernal mages", new SlayerTask("Infernal mages", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Infernal mages", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.infernalMagesInfo().split("\n"))))),

                Map.entry("jellies", new SlayerTask("Jellies", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Jellies", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.jelliesInfo().split("\n"))))),

                Map.entry("jungle horrors", new SlayerTask("Jungle horrors", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Jungle horrors", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.jungleHorrorsInfo().split("\n"))))),

                Map.entry("kalphite", new SlayerTask("Kalphite", List.of(NpcID.KALPHITE_WORKER, NpcID.KALPHITE_SOLDIER, NpcID.KALPHITE_QUEEN), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Kalphite", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.kalphiteInfo().split("\n"))))),

                Map.entry("killerwatts", new SlayerTask("Killerwatts", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Killerwatts", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.killerwattsInfo().split("\n"))))),

                Map.entry("kurasks", new SlayerTask("Kurasks", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Kurasks", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.kurasksInfo().split("\n"))))),

                Map.entry("lava dragons", new SlayerTask("Lava dragons", List.of(NpcID.LAVA_DRAGON), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Lava dragons", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.lavaDragonsInfo().split("\n"))))),

                Map.entry("lesser demons", new SlayerTask("Lesser demons", List.of(NpcID.LESSER_DEMON), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Lesser demons", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.lesserDemonsInfo().split("\n"))))),

                Map.entry("lesser nagua", new SlayerTask("Lesser nagua", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Lesser nagua", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.lesserNaguaInfo().split("\n"))))),

                Map.entry("lizardmen", new SlayerTask("Lizardmen", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Lizardmen", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.lizardmenInfo().split("\n"))))),

                Map.entry("lizards", new SlayerTask("Lizards", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Lizards", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.lizardsInfo().split("\n"))))),

                Map.entry("magic axes", new SlayerTask("Magic axes", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Magic axes", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.magicAxesInfo().split("\n"))))),

                Map.entry("mammoth", new SlayerTask("Mammoth", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Mammoth", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.mammothInfo().split("\n"))))),

                Map.entry("metal dragons", new SlayerTask("Metal dragons", List.of(NpcID.BRONZE_DRAGON, NpcID.IRON_DRAGON, NpcID.STEEL_DRAGON, NpcID.ADAMANT_DRAGON, NpcID.RUNE_DRAGON), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Metal dragons", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.metalDragonsInfo().split("\n"))))),

                Map.entry("minotaurs", new SlayerTask("Minotaurs", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Minotaurs", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.minotaursInfo().split("\n"))))),

                Map.entry("mogres", new SlayerTask("Mogres", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Mogres", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.mogresInfo().split("\n"))))),

                Map.entry("molanisks", new SlayerTask("Molanisks", List.of(NpcID.MOLANISK), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Molanisks", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.molanisksInfo().split("\n"))))),

                Map.entry("monkeys", new SlayerTask("Monkeys", List.of(NpcID.MONKEY), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Monkeys", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.monkeysInfo().split("\n"))))),

                Map.entry("moss giants", new SlayerTask("Moss giants", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Moss giants", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.mossGiantsInfo().split("\n"))))),

                Map.entry("nechryael", new SlayerTask("Nechryael", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Nechryael", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.nechryaelInfo().split("\n"))))),

                Map.entry("ogres", new SlayerTask("Ogres", List.of(NpcID.OGRE), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Ogres", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.ogresInfo().split("\n"))))),

                Map.entry("otherworldly beings", new SlayerTask("Otherworldly beings", List.of(NpcID.OTHERWORLDLY_BEING), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Otherworldly beings", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.otherworldlyBeingsInfo().split("\n"))))),

                Map.entry("pirates", new SlayerTask("Pirates", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Pirates", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.piratesInfo().split("\n"))))),

                Map.entry("pyrefiends", new SlayerTask("Pyrefiends", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Pyrefiends", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.pyrefiendsInfo().split("\n"))))),

                Map.entry("rats", new SlayerTask("Rats", List.of(NpcID.RAT), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Rats", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.ratsInfo().split("\n"))))),

                Map.entry("red dragons", new SlayerTask("Red dragons", List.of(NpcID.RED_DRAGON), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Red dragons", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.redDragonsInfo().split("\n"))))),

                Map.entry("revenants", new SlayerTask("Revenants", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Revenants", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.revenantsInfo().split("\n"))))),

                Map.entry("rockslugs", new SlayerTask("Rockslugs", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Rockslugs", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.rockslugsInfo().split("\n"))))),

                Map.entry("rogues", new SlayerTask("Rogues", List.of(NpcID.ROGUE), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Rogues", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.roguesInfo().split("\n"))))),

                Map.entry("scabarites", new SlayerTask("Scabarites", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Scabarites", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.scabaritesInfo().split("\n"))))),

                Map.entry("scorpions", new SlayerTask("Scorpions", List.of(NpcID.SCORPION, NpcID.SCORPIA), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Scorpions", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.scorpionsInfo().split("\n"))))),

                Map.entry("sea snakes", new SlayerTask("Sea snakes", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Sea snakes", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.seaSnakesInfo().split("\n"))))),

                Map.entry("shades", new SlayerTask("Shades", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Shades", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.shadesInfo().split("\n"))))),

                Map.entry("shadow warriors", new SlayerTask("Shadow warriors", List.of(NpcID.SHADOW_WARRIOR), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Shadow warriors", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.shadowWarriorsInfo().split("\n"))))),

                Map.entry("skeletal wyverns", new SlayerTask("Skeletal wyverns", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Skeletal wyverns", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.skeletalWyvernsInfo().split("\n"))))),

                Map.entry("skeletons", new SlayerTask("Skeletons", List.of(NpcID.VETION), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Skeletons", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.skeletonsInfo().split("\n"))))),

                Map.entry("smoke devils", new SlayerTask("Smoke devils", List.of(NpcID.SMOKE_DEVIL), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Smoke devils", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.smokeDevilsInfo().split("\n"))))),

                Map.entry("sourhogs", new SlayerTask("Sourhogs", List.of(NpcID.SOURHOG), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Sourhogs", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.sourhogsInfo().split("\n"))))),

                Map.entry("spiders", new SlayerTask("Spiders", List.of(NpcID.SPIDER, NpcID.SARACHNIS, NpcID.VENENATIS), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Spiders", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.spidersInfo().split("\n"))))),

                Map.entry("spiritual creatures", new SlayerTask("Spiritual creatures", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Spiritual creatures", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.spiritualCreaturesInfo().split("\n"))))),

                Map.entry("suqahs", new SlayerTask("Suqahs", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Suqahs", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.suqahsInfo().split("\n"))))),

                Map.entry("terror dogs", new SlayerTask("Terror dogs", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Terror dogs", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.terrorDogsInfo().split("\n"))))),

                Map.entry("trolls", new SlayerTask("Trolls", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Trolls", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.trollsInfo().split("\n"))))),

                Map.entry("turoth", new SlayerTask("Turoth", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Turoth", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.turothInfo().split("\n"))))),

                Map.entry("tzhaar", new SlayerTask("TzHaar", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("TzHaar", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.tzHaarInfo().split("\n"))))),

                Map.entry("vampyres", new SlayerTask("Vampyres", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Vampyres", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.vampyresInfo().split("\n"))))),

                Map.entry("wall beasts", new SlayerTask("Wall beasts", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Wall beasts", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.wallBeastsInfo().split("\n"))))),

                Map.entry("warped creatures", new SlayerTask("Warped creatures", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Warped creatures", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.warpedCreaturesInfo().split("\n"))))),

                Map.entry("waterfiends", new SlayerTask("Waterfiends", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Waterfiends", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.waterfiendsInfo().split("\n"))))),

                Map.entry("werewolves", new SlayerTask("Werewolves", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Werewolves", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.werewolvesInfo().split("\n"))))),

                Map.entry("wolves", new SlayerTask("Wolves", List.of(NpcID.WOLF), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Wolves", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.wolvesInfo().split("\n"))))),

                Map.entry("wyrms", new SlayerTask("Wyrms", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Wyrms", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.wyrmsInfo().split("\n"))))),

                Map.entry("zombies", new SlayerTask("Zombies", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Zombies", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.zombiesInfo().split("\n"))))),

                Map.entry("zygomites", new SlayerTask("Zygomites", List.of(1), List.of(new WorldPoint(0, 0, 0)), List.of(new NpcLocation("Zygomites", List.of(WorldAreaUtils.fromCorners(new WorldPoint(0, 0, 0), new WorldPoint(0, 0, 0))), config.zygomitesInfo().split("\n")))))
                );
    }

    public SlayerTask getSlayerTaskByNpcName(String npcName)
    {
        return tasks.get(npcName.toLowerCase());
    }

    /**
     * Creates a Goblin slayer task
     *
     * @param name the name of the task, for goblins in specific this should be "goblin" and "goblins"
     * @return the goblin slayer task
     */
    private static SlayerTask createGoblinTask(String name) {
        return new SlayerTask(name, List.of(
                NpcID.GOBLIN_UNARMED_MELEE_1,
                NpcID.GOBLIN_UNARMED_MELEE_2,
                NpcID.GOBLIN_UNARMED_MELEE_3,
                NpcID.GOBLIN_UNARMED_MELEE_5,
                NpcID.GOBLIN_UNARMED_MELEE_6,
                NpcID.GOBLIN_UNARMED_MELEE_7,
                NpcID.GOBLIN_UNARMED_MELEE_8
        ), List.of(
                new WorldPoint(3145, 3301, 0)
        ), List.of(
                new NpcLocation("South-East of Draynor Manor", List.of(
                        WorldAreaUtils.fromCorners(
                                new WorldPoint(3132, 3291, 0),
                                new WorldPoint(3156, 3312, 0)
                        )
                ), new String[]{"Draynor manor teleport", "Ornate Jewellery Box: Draynor Village (Option Q)", "Glory amulet: Draynor Village (Option 3)"})
        ), "South of the Sourhog Cave");
    }
}
