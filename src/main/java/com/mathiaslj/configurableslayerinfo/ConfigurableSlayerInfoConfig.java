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

@ConfigGroup(ConfigurableSlayerInfoConfig.CONFIG_GROUP_NAME)
public interface ConfigurableSlayerInfoConfig extends Config {
    String CONFIG_GROUP_NAME = "Configurable Slayer Info";

    String FREMENNIK_SLAYER_CAVE = "Fremennik slayer cave (slayer ring OR fairy ring AJR)";
    String SLAYER_TOWER = "Slayer tower: Slayer ring - alternatively fairy ring (CKS)";
    String STRONGHOLD_SLAYER_CAVE = "Stronghold slayer cave (slayer ring OR spirit tree(2))";
    String MOUNT_KARUULM = "BRING: Boots of stone\nRada's blessing (Mount Karuulm)";
    String MOS_LE_HARMLESS = "Minigame teleport (Trouble brewing)\nEctophial -> Run East to Bill Teach";
    String CHASM_OF_FIRE = "Fairy ring (DJR) -> Run North to Chasm of fire";
    String DORGESHKAAN_DUNGEON = "BRING: Light source\nFairy ring (AJQ)";
    String ASGARNIAN_DUNGEON = "Fairy ring (AIQ) -> Run North to Asgarnian Ice Dungeon";
    String GOD_WARS_DUNGEON = "GWD: Ghommal's hilt or Trollheim teleport";
    String ALICES_FARM = "Ectophial\nRun West to Alice's farm";

    public static final int BASE = 100;

    // Position constants
    public static final int POSITION_ABERRANT_SPECTRES = BASE;
    public static final int POSITION_ABYSSAL_DEMONS = BASE + 1;
    public static final int POSITION_ANKOUS = BASE + 2;
    public static final int POSITION_AQUANITES = BASE + 3;
    public static final int POSITION_ARAXYTES = BASE + 4;
    public static final int POSITION_AVIANSIE = BASE + 5;
    public static final int POSITION_BANDITS = BASE + 6;
    public static final int POSITION_BANSHEES = BASE + 7;
    public static final int POSITION_BASILISKS = BASE + 8;
    public static final int POSITION_BATS = BASE + 9;
    public static final int POSITION_BEARS = BASE + 10;
    public static final int POSITION_BIRDS = BASE + 11;
    public static final int POSITION_BLACK_DEMONS = BASE + 12;
    public static final int POSITION_BLACK_DRAGONS = BASE + 13;
    public static final int POSITION_BLACK_KNIGHTS = BASE + 14;
    public static final int POSITION_BLOODVELDS = BASE + 15;
    public static final int POSITION_BLUE_DRAGONS = BASE + 16;
    public static final int POSITION_BRINE_RATS = BASE + 17;
    public static final int POSITION_CATABLEPON = BASE + 18;
    public static final int POSITION_CAVE_BUGS = BASE + 19;
    public static final int POSITION_CAVE_CRAWLERS = BASE + 20;
    public static final int POSITION_CAVE_HORRORS = BASE + 21;
    public static final int POSITION_CAVE_SLIMES = BASE + 22;
    public static final int POSITION_CAVE_KRAKEN = BASE + 23;
    public static final int POSITION_CHAOS_DRUIDS = BASE + 24;
    public static final int POSITION_COCKATRICES = BASE + 25;
    public static final int POSITION_COWS = BASE + 26;
    public static final int POSITION_CRABS = BASE + 27;
    public static final int POSITION_CRAWLING_HANDS = BASE + 28;
    public static final int POSITION_CROCODILES = BASE + 29;
    public static final int POSITION_CUSTODIAN_STALKERS = BASE + 30;
    public static final int POSITION_DAGANNOTHS = BASE + 31;
    public static final int POSITION_DARK_BEASTS = BASE + 32;
    public static final int POSITION_DARK_WARRIORS = BASE + 33;
    public static final int POSITION_DOGS = BASE + 34;
    public static final int POSITION_DRAKES = BASE + 35;
    public static final int POSITION_DUST_DEVILS = BASE + 36;
    public static final int POSITION_DWARVES = BASE + 37;
    public static final int POSITION_EARTH_WARRIORS = BASE + 38;
    public static final int POSITION_ELVES = BASE + 39;
    public static final int POSITION_ENT = BASE + 40;
    public static final int POSITION_FEVER_SPIDERS = BASE + 41;
    public static final int POSITION_FIRE_GIANTS = BASE + 42;
    public static final int POSITION_FLESH_CRAWLERS = BASE + 43;
    public static final int POSITION_FOSSIL_ISLAND_WYVERN = BASE + 44;
    public static final int POSITION_FROST_DRAGONS = BASE + 45;
    public static final int POSITION_GARGOYLES = BASE + 46;
    public static final int POSITION_GHOSTS = BASE + 47;
    public static final int POSITION_GHOULS = BASE + 48;
    public static final int POSITION_GOBLINS = BASE + 49;
    public static final int POSITION_GREATER_DEMONS = BASE + 50;
    public static final int POSITION_GREEN_DRAGONS = BASE + 51;
    public static final int POSITION_GRYPHONS = BASE + 52;
    public static final int POSITION_HARPIE_BUG_SWARMS = BASE + 53;
    public static final int POSITION_HELLHOUNDS = BASE + 54;
    public static final int POSITION_HILL_GIANTS = BASE + 55;
    public static final int POSITION_HOBGOBLINS = BASE + 56;
    public static final int POSITION_HYDRAS = BASE + 57;
    public static final int POSITION_ICEFIENDS = BASE + 58;
    public static final int POSITION_ICE_GIANTS = BASE + 59;
    public static final int POSITION_ICE_WARRIORS = BASE + 60;
    public static final int POSITION_INFERNAL_MAGES = BASE + 61;
    public static final int POSITION_JELLIES = BASE + 62;
    public static final int POSITION_JUNGLE_HORRORS = BASE + 63;
    public static final int POSITION_KALPHITE = BASE + 64;
    public static final int POSITION_KILLERWATTS = BASE + 65;
    public static final int POSITION_KURASKS = BASE + 66;
    public static final int POSITION_LAVA_DRAGONS = BASE + 67;
    public static final int POSITION_LESSER_DEMONS = BASE + 68;
    public static final int POSITION_LESSER_NAGUA = BASE + 69;
    public static final int POSITION_LIZARDMEN = BASE + 70;
    public static final int POSITION_LIZARDS = BASE + 71;
    public static final int POSITION_MAGIC_AXES = BASE + 72;
    public static final int POSITION_MAMMOTH = BASE + 73;
    public static final int POSITION_METAL_DRAGONS = BASE + 74;
    public static final int POSITION_MINOTAURS = BASE + 75;
    public static final int POSITION_MOGRES = BASE + 76;
    public static final int POSITION_MOLANISKS = BASE + 77;
    public static final int POSITION_MONKEYS = BASE + 78;
    public static final int POSITION_MOSS_GIANTS = BASE + 79;
    public static final int POSITION_NECHRYAEL = BASE + 80;
    public static final int POSITION_OGRES = BASE + 81;
    public static final int POSITION_OTHERWORLDLY_BEINGS = BASE + 82;
    public static final int POSITION_PIRATES = BASE + 83;
    public static final int POSITION_PYREFIENDS = BASE + 84;
    public static final int POSITION_RATS = BASE + 85;
    public static final int POSITION_RED_DRAGONS = BASE + 86;
    public static final int POSITION_REVENANTS = BASE + 87;
    public static final int POSITION_ROCKSLUGS = BASE + 88;
    public static final int POSITION_ROGUES = BASE + 89;
    public static final int POSITION_SCABARITES = BASE + 90;
    public static final int POSITION_SCORPIONS = BASE + 91;
    public static final int POSITION_SEA_SNAKES = BASE + 92;
    public static final int POSITION_SHADES = BASE + 93;
    public static final int POSITION_SHADOW_WARRIORS = BASE + 94;
    public static final int POSITION_SKELETAL_WYVERNS = BASE + 95;
    public static final int POSITION_SKELETONS = BASE + 96;
    public static final int POSITION_SMOKE_DEVILS = BASE + 97;
    public static final int POSITION_SOURHOGS = BASE + 98;
    public static final int POSITION_SPIDERS = BASE + 99;
    public static final int POSITION_SPIRITUAL_CREATURES = BASE + 100;
    public static final int POSITION_SUQAHS = BASE + 101;
    public static final int POSITION_TERROR_DOGS = BASE + 102;
    public static final int POSITION_TROLLS = BASE + 103;
    public static final int POSITION_TUROTH = BASE + 104;
    public static final int POSITION_TZHAAR = BASE + 105;
    public static final int POSITION_VAMPYRES = BASE + 106;
    public static final int POSITION_WALL_BEASTS = BASE + 107;
    public static final int POSITION_WARPED_CREATURES = BASE + 108;
    public static final int POSITION_WATERFIENDS = BASE + 109;
    public static final int POSITION_WEREWOLVES = BASE + 110;
    public static final int POSITION_WOLVES = BASE + 111;
    public static final int POSITION_WYRMS = BASE + 112;
    public static final int POSITION_ZOMBIES = BASE + 113;
    public static final int POSITION_ZYGOMITES = BASE + 114;

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
            section = generalSettings,
            hidden = true
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

    /*
    // Highlight settings
    @ConfigSection(
            position = 10000,
            name = "NPC Highlight settings",
            description = "Customize NPC highlight settings"
    )
    String npcHighlightSettings = "npcHighlightSettings";

    @ConfigItem(
            position = 0,
            keyName = "enableNpcHighlight",
            name = "Enable NPC highlight",
            description = "Whether you want to highlight the NPC's from your current slayer task.",
            section = npcHighlightSettings,
            hidden = true
    )
    default boolean enableNpcHighlight() {
        return false;
    }

    @ConfigItem(
            position = 1,
            keyName = "npcHighlightMode",
            name = "NPC highlight mode",
            description = "Select how to highlight the NPC's.",
            section = npcHighlightSettings,
            hidden = true
    )
    default NpcHighlightMode getNpcHighlightMode() {
        return NpcHighlightMode.Tile;
    }

    @ConfigItem(
            position = 2,
            keyName = "npcColour",
            name = "NPC highlight colour",
            description = "Select the colour of the highlighted NPC's.",
            section = npcHighlightSettings,
            hidden = true
    )
    default Color getNpcColour() {
        return Color.decode("#DDFF00");
    }
    */

    // Debug settings
    @ConfigSection(
            position = 3,
            name = "Debugging",
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
    @ConfigSection(position = POSITION_ABERRANT_SPECTRES, name = "Aberrant Spectres", closedByDefault = true, description = "Information to display for slayer task")
    String aberrantSpectresSettings = "aberrantSpectres";

    @ConfigItem(keyName = "Aberrant Spectres", name = "Aberrant Spectres information", description = "Create individual bullet points in overlay, one per line", section = aberrantSpectresSettings, position = 0)
    default String aberrantSpectresInfo() { return "BRING: Slayer helm (or nose peg)\n" + STRONGHOLD_SLAYER_CAVE; }

    // Abyssal Demons
    @ConfigSection(position = POSITION_ABYSSAL_DEMONS, name = "Abyssal Demons", closedByDefault = true, description = "Information to display for slayer task")
    String abyssalDemonsSettings = "abyssalDemons";

    @ConfigItem(keyName = "Abyssal Demons", name = "Abyssal Demons information", description = "Create individual bullet points in overlay, one per line", section = abyssalDemonsSettings, position = 0)
    default String abyssalDemonsInfo() { return "Catacombs of Kourend\n" + "Run North"; }

    // Ankous
    @ConfigSection(position = POSITION_ANKOUS, name = "Ankous", closedByDefault = true, description = "Information to display for slayer task")
    String ankousSettings = "ankous";

    @ConfigItem(keyName = "Ankous", name = "Ankous information", description = "Create individual bullet points in overlay, one per line", section = ankousSettings, position = 0)
    default String ankousInfo() { return "Skull sceptre\n" + "4th floor\n" + "Run north"; }

    // Aquanites
    @ConfigSection(position = POSITION_AQUANITES, name = "Aquanites", closedByDefault = true, description = "Information to display for slayer task")
    String aquanitesSettings = "aquanites";

    @ConfigItem(keyName = "Aquanites", name = "Aquanites information", description = "Create individual bullet points in overlay, one per line", section = aquanitesSettings, position = 0)
    default String aquanitesInfo() { return "Teleport to Prifddinas\n" + "Run North" + "Take rowboat to Ynysdail"; }

    // Araxytes
    @ConfigSection(position = POSITION_ARAXYTES, name = "Araxytes", closedByDefault = true, description = "Information to display for slayer task")
    String araxytesSettings = "araxytes";

    @ConfigItem(keyName = "Araxytes", name = "Araxytes information", description = "Create individual bullet points in overlay, one per line", section = araxytesSettings, position = 0)
    default String araxytesInfo() { return "Spider cave teleport\n" + "Hallowed crystal shard -> Run East and take shortcut (63 agility + 2 long ropes)\n" + "Ectophial or fairy ring (ALQ) -> Run South"; }

    // Aviansie
    @ConfigSection(position = POSITION_AVIANSIE, name = "Aviansie", closedByDefault = true, description = "Information to display for slayer task")
    String aviansieSettings = "aviansie";

    @ConfigItem(keyName = "Aviansie", name = "Aviansie information", description = "Create individual bullet points in overlay, one per line", section = aviansieSettings, position = 0)
    default String aviansieInfo() { return GOD_WARS_DUNGEON; }

    // Bandits
    @ConfigSection(position = POSITION_BANDITS, name = "Bandits", closedByDefault = true, description = "Information to display for slayer task")
    String banditsSettings = "bandits";

    @ConfigItem(keyName = "Bandits", name = "Bandits information", description = "Create individual bullet points in overlay, one per line", section = banditsSettings, position = 0)
    default String banditsInfo() { return "Burning amulet (Bandit camp)\n" + "Run west from Ferox Enclave"; }

    // Banshees
    @ConfigSection(position = POSITION_BANSHEES, name = "Banshees", closedByDefault = true, description = "Information to display for slayer task")
    String bansheesSettings = "banshees";

    @ConfigItem(keyName = "Banshees", name = "Banshees information", description = "Create individual bullet points in overlay, one per line", section = bansheesSettings, position = 0)
    default String bansheesInfo() { return SLAYER_TOWER + "\n" + "Take shortcut outside on SE wall"; }

    // Basilisks
    @ConfigSection(position = POSITION_BASILISKS, name = "Basilisks", closedByDefault = true, description = "Information to display for slayer task")
    String basilisksSettings = "basilisks";

    @ConfigItem(keyName = "Basilisks", name = "Basilisks information", description = "Create individual bullet points in overlay, one per line", section = basilisksSettings, position = 0)
    default String basilisksInfo() { return "Fremennik slayer dungeon: Slayer ring or fairy ring (AJR)\n" + "Jormungand's Prison: Teleport to Rellekka -> Run West and talk to Haskell"; }

    // Bats
    @ConfigSection(position = POSITION_BATS, name = "Bats", closedByDefault = true, description = "Information to display for slayer task")
    String batsSettings = "bats";

    @ConfigItem(keyName = "Bats", name = "Bats information", description = "Create individual bullet points in overlay, one per line", section = batsSettings, position = 0)
    default String batsInfo() { return "Digsite pendent (Digsite)\n" + "Run North"; }

    // Bears
    @ConfigSection(position = POSITION_BEARS, name = "Bears", closedByDefault = true, description = "Information to display for slayer task")
    String bearsSettings = "bears";

    @ConfigItem(keyName = "Bears", name = "Bears information", description = "Create individual bullet points in overlay, one per line", section = bearsSettings, position = 0)
    default String bearsInfo() { return "Fairy ring (BLS)\n" + "Run SW"; }

    // Birds
    @ConfigSection(position = POSITION_BIRDS, name = "Birds", closedByDefault = true, description = "Information to display for slayer task")
    String birdsSettings = "birds";

    @ConfigItem(keyName = "Birds", name = "Birds information", description = "Create individual bullet points in overlay, one per line", section = birdsSettings, position = 0)
    default String birdsInfo() { return ALICES_FARM; }

    // Black Demons
    @ConfigSection(position = POSITION_BLACK_DEMONS, name = "Black Demons", closedByDefault = true, description = "Information to display for slayer task")
    String blackDemonsSettings = "blackDemons";

    @ConfigItem(keyName = "Black Demons", name = "Black Demons information", description = "Create individual bullet points in overlay, one per line", section = blackDemonsSettings, position = 0)
    default String blackDemonsInfo() { return "Demonics: Royal seed pod -> Run NW followed by North to crash site\n" + "Black demons: Falador teleport -> Take agility shortcut West -> Run North to Taverly dungeon"; }

    // Black Dragons
    @ConfigSection(position = POSITION_BLACK_DRAGONS, name = "Black Dragons", closedByDefault = true, description = "Information to display for slayer task")
    String blackDragonsSettings = "blackDragons";

    @ConfigItem(keyName = "Black Dragons", name = "Black Dragons information", description = "Create individual bullet points in overlay, one per line", section = blackDragonsSettings, position = 0)
    default String blackDragonsInfo() { return "Baby black dragons: Task-only area in Taverly dungeon\n" + "Regular: Bring raw chicken to Zanaris -> Enter lair NE -> Run South to safespot" + "King black dragon: Burning amulet (Lava maze)"; }

    // Black Knights
    @ConfigSection(position = POSITION_BLACK_KNIGHTS, name = "Black Knights", closedByDefault = true, description = "Information to display for slayer task")
    String blackKnightsSettings = "blackKnights";

    @ConfigItem(keyName = "Black Knights", name = "Black Knights information", description = "Create individual bullet points in overlay, one per line", section = blackKnightsSettings, position = 0)
    default String blackKnightsInfo() { return "Combat bracelet (Monastery) -> Run West\n" + "Falador teleport -> Run North"; }

    // Bloodvelds
    @ConfigSection(position = POSITION_BLOODVELDS, name = "Bloodvelds", closedByDefault = true, description = "Information to display for slayer task")
    String bloodveldsSettings = "bloodvelds";

    @ConfigItem(keyName = "Bloodvelds", name = "Bloodvelds information", description = "Create individual bullet points in overlay, one per line", section = bloodveldsSettings, position = 0)
    default String bloodveldsInfo() { return STRONGHOLD_SLAYER_CAVE + "\n" + "Placeholder for preferred locations (Catacombs, meiyerditch, buccaneers, iorwerth)"; }

    // Blue Dragons
    @ConfigSection(position = POSITION_BLUE_DRAGONS, name = "Blue Dragons", closedByDefault = true, description = "Information to display for slayer task")
    String blueDragonsSettings = "blueDragons";

    @ConfigItem(keyName = "Blue Dragons", name = "Blue Dragons information", description = "Create individual bullet points in overlay, one per line", section = blueDragonsSettings, position = 0)
    default String blueDragonsInfo() { return "Taverly dungeon"; }

    // Brine Rats
    @ConfigSection(position = POSITION_BRINE_RATS, name = "Brine Rats", closedByDefault = true, description = "Information to display for slayer task")
    String brineRatsSettings = "brineRats";

    @ConfigItem(keyName = "Brine Rats", name = "Brine Rats information", description = "Create individual bullet points in overlay, one per line", section = brineRatsSettings, position = 0)
    default String brineRatsInfo() { return "Fairy ring (DKS)"; }

    // Catablepon
    @ConfigSection(position = POSITION_CATABLEPON, name = "Catablepon", closedByDefault = true, description = "Information to display for slayer task")
    String catableponSettings = "catablepon";

    @ConfigItem(keyName = "Catablepon", name = "Catablepon information", description = "Create individual bullet points in overlay, one per line", section = catableponSettings, position = 0)
    default String catableponInfo() { return "Skull sceptre\n" + "3rd floor\n" + "Run NE"; }

    // Cave Bugs
    @ConfigSection(position = POSITION_CAVE_BUGS, name = "Cave Bugs", closedByDefault = true, description = "Information to display for slayer task")
    String caveBugsSettings = "caveBugs";

    @ConfigItem(keyName = "Cave Bugs", name = "Cave Bugs information", description = "Create individual bullet points in overlay, one per line", section = caveBugsSettings, position = 0)
    default String caveBugsInfo() { return DORGESHKAAN_DUNGEON; }

    // Cave Crawlers
    @ConfigSection(position = POSITION_CAVE_CRAWLERS, name = "Cave Crawlers", closedByDefault = true, description = "Information to display for slayer task")
    String caveCrawlersSettings = "caveCrawlers";

    @ConfigItem(keyName = "Cave Crawlers", name = "Cave Crawlers information", description = "Create individual bullet points in overlay, one per line", section = caveCrawlersSettings, position = 0)
    default String caveCrawlersInfo() { return FREMENNIK_SLAYER_CAVE; }

    // Cave Horrors
    @ConfigSection(position = POSITION_CAVE_HORRORS, name = "Cave Horrors", closedByDefault = true, description = "Information to display for slayer task")
    String caveHorrorsSettings = "caveHorrors";

    @ConfigItem(keyName = "Cave Horrors", name = "Cave Horrors information", description = "Create individual bullet points in overlay, one per line", section = caveHorrorsSettings, position = 0)
    default String caveHorrorsInfo() { return "BRING: Witchwood icon\n" + MOS_LE_HARMLESS; }

    // Cave Slimes
    @ConfigSection(position = POSITION_CAVE_SLIMES, name = "Cave Slimes", closedByDefault = true, description = "Information to display for slayer task")
    String caveSlimesSettings = "caveSlimes";

    @ConfigItem(keyName = "Cave Slimes", name = "Cave Slimes information", description = "Create individual bullet points in overlay, one per line", section = caveSlimesSettings, position = 0)
    default String caveSlimesInfo() { return DORGESHKAAN_DUNGEON; }

    // Cave Kraken
    @ConfigSection(position = POSITION_CAVE_KRAKEN, name = "Cave Kraken", closedByDefault = true, description = "Information to display for slayer task")
    String caveKrakenSettings = "caveKraken";

    @ConfigItem(keyName = "Cave Kraken", name = "Cave Kraken information", description = "Create individual bullet points in overlay, one per line", section = caveKrakenSettings, position = 0)
    default String caveKrakenInfo() { return "Fairy ring (AKQ)"; }

    // Chaos Druids
    @ConfigSection(position = POSITION_CHAOS_DRUIDS, name = "Chaos Druids", closedByDefault = true, description = "Information to display for slayer task")
    String chaosDruidsSettings = "chaosDruids";

    @ConfigItem(keyName = "Chaos Druids", name = "Chaos Druids information", description = "Create individual bullet points in overlay, one per line", section = chaosDruidsSettings, position = 0)
    default String chaosDruidsInfo() { return "Edgeville dungeon (Wilderness)\n" + "Chaos druid tower (North of Ardougne)"; }

    // Cockatrices
    @ConfigSection(position = POSITION_COCKATRICES, name = "Cockatrices", closedByDefault = true, description = "Information to display for slayer task")
    String cockatricesSettings = "cockatrices";

    @ConfigItem(keyName = "Cockatrices", name = "Cockatrices information", description = "Create individual bullet points in overlay, one per line", section = cockatricesSettings, position = 0)
    default String cockatricesInfo() { return "BRING: Mirror shield\n" + FREMENNIK_SLAYER_CAVE; }

    // Cows
    @ConfigSection(position = POSITION_COWS, name = "Cows", closedByDefault = true, description = "Information to display for slayer task")
    String cowsSettings = "cows";

    @ConfigItem(keyName = "Cows", name = "Cows information", description = "Create individual bullet points in overlay, one per line", section = cowsSettings, position = 0)
    default String cowsInfo() { return "Skill's necklace (crafting guild)"; }

    // Crabs
    @ConfigSection(position = POSITION_CRABS, name = "Crabs", closedByDefault = true, description = "Information to display for slayer task")
    String crabsSettings = "crabs";

    @ConfigItem(keyName = "Crabs", name = "Crabs information", description = "Create individual bullet points in overlay, one per line", section = crabsSettings, position = 0)
    default String crabsInfo() { return "Ammonite crab: Shores of fossil island\n" + "Sand crab: Minigame teleport (tithe farm) -> Run South to shore"; }

    // Crawling Hands
    @ConfigSection(position = POSITION_CRAWLING_HANDS, name = "Crawling Hands", closedByDefault = true, description = "Information to display for slayer task")
    String crawlingHandsSettings = "crawlingHands";

    @ConfigItem(keyName = "Crawling Hands", name = "Crawling Hands information", description = "Create individual bullet points in overlay, one per line", section = crawlingHandsSettings, position = 0)
    default String crawlingHandsInfo() { return SLAYER_TOWER + "\n" + "Bottom floor"; }

    // Crocodiles
    @ConfigSection(position = POSITION_CROCODILES, name = "Crocodiles", closedByDefault = true, description = "Information to display for slayer task")
    String crocodilesSettings = "crocodiles";

    @ConfigItem(keyName = "Crocodiles", name = "Crocodiles information", description = "Create individual bullet points in overlay, one per line", section = crocodilesSettings, position = 0)
    default String crocodilesInfo() { return "BRING: Waterskins\n" + "Desert amulet\n" + "Run West"; }

    // Custodian Stalkers
    @ConfigSection(position = POSITION_CUSTODIAN_STALKERS, name = "Custodian Stalkers", closedByDefault = true, description = "Information to display for slayer task")
    String custodianStalkersSettings = "custodianStalkers";

    @ConfigItem(keyName = "Custodian Stalkers", name = "Custodian Stalkers information", description = "Create individual bullet points in overlay, one per line", section = custodianStalkersSettings, position = 0)
    default String custodianStalkersInfo() { return "Fairy ring (BLS)\n" + "Run South to Stalker Den"; }

    // Dagannoths
    @ConfigSection(position = POSITION_DAGANNOTHS, name = "Dagannoths", closedByDefault = true, description = "Information to display for slayer task")
    String dagannothsSettings = "dagannoths";

    @ConfigItem(keyName = "Dagannoths", name = "Dagannoths information", description = "Create individual bullet points in overlay, one per line", section = dagannothsSettings, position = 0)
    default String dagannothsInfo() { return "Lighthouse: Fairy ring (ALP)\n" + "Catacombs of Kourend: Run South"; }

    // Dark Beasts
    @ConfigSection(position = POSITION_DARK_BEASTS, name = "Dark Beasts", closedByDefault = true, description = "Information to display for slayer task")
    String darkBeastsSettings = "darkBeasts";

    @ConfigItem(keyName = "Dark Beasts", name = "Dark Beasts information", description = "Create individual bullet points in overlay, one per line", section = darkBeastsSettings, position = 0)
    default String darkBeastsInfo() { return "Slayer ring (dark beasts)"; }

    // Dark Warriors
    @ConfigSection(position = POSITION_DARK_WARRIORS, name = "Dark Warriors", closedByDefault = true, description = "Information to display for slayer task")
    String darkWarriorsSettings = "darkWarriors";

    @ConfigItem(keyName = "Dark Warriors", name = "Dark Warriors information", description = "Create individual bullet points in overlay, one per line", section = darkWarriorsSettings, position = 0)
    default String darkWarriorsInfo() { return "Burning amulet (Bandit camp) -> Run West, then South\n" + "Run west from Ferox Enclave"; }

    // Dogs
    @ConfigSection(position = POSITION_DOGS, name = "Dogs", closedByDefault = true, description = "Information to display for slayer task")
    String dogsSettings = "dogs";

    @ConfigItem(keyName = "Dogs", name = "Dogs information", description = "Create individual bullet points in overlay, one per line", section = dogsSettings, position = 0)
    default String dogsInfo() { return "Pharaoh's sceptre (2 - Jaleustrophos) -> Run South\n" + "Desert amulet -> Run West or South\n" + "Fairy ring (AKP) -> Run NE\n" + "Fairy ring (DLQ) -> Run South"; }

    // Drakes
    @ConfigSection(position = POSITION_DRAKES, name = "Drakes", closedByDefault = true, description = "Information to display for slayer task")
    String drakesSettings = "drakes";

    @ConfigItem(keyName = "Drakes", name = "Drakes information", description = "Create individual bullet points in overlay, one per line", section = drakesSettings, position = 0)
    default String drakesInfo() { return MOUNT_KARUULM; }

    // Dust Devils
    @ConfigSection(position = POSITION_DUST_DEVILS, name = "Dust Devils", closedByDefault = true, description = "Information to display for slayer task")
    String dustDevilsSettings = "dustDevils";

    @ConfigItem(keyName = "Dust Devils", name = "Dust Devils information", description = "Create individual bullet points in overlay, one per line", section = dustDevilsSettings, position = 0)
    default String dustDevilsInfo() { return "Catacombs of Kourend\n" + "Run East, then South"; }

    // Dwarves
    @ConfigSection(position = POSITION_DWARVES, name = "Dwarves", closedByDefault = true, description = "Information to display for slayer task")
    String dwarvesSettings = "dwarves";

    @ConfigItem(keyName = "Dwarves", name = "Dwarves information", description = "Create individual bullet points in overlay, one per line", section = dwarvesSettings, position = 0)
    default String dwarvesInfo() { return "Combat bracelet (Monastery) -> Run West\n" + "Falador teleport -> Run NE"; }

    // Earth Warriors
    @ConfigSection(position = POSITION_EARTH_WARRIORS, name = "Earth Warriors", closedByDefault = true, description = "Information to display for slayer task")
    String earthWarriorsSettings = "earthWarriors";

    @ConfigItem(keyName = "Earth Warriors", name = "Earth Warriors information", description = "Create individual bullet points in overlay, one per line", section = earthWarriorsSettings, position = 0)
    default String earthWarriorsInfo() { return "Edgeville dungeon"; }

    // Elves
    @ConfigSection(position = POSITION_ELVES, name = "Elves", closedByDefault = true, description = "Information to display for slayer task")
    String elvesSettings = "elves";

    @ConfigItem(keyName = "Elves", name = "Elves information", description = "Create individual bullet points in overlay, one per line", section = elvesSettings, position = 0)
    default String elvesInfo() { return "Mourner HQ: Slayer ring (dark beasts)\n" + "Iorwerth dungeon: Teleport to Prifddinas"; }

    // Ent
    @ConfigSection(position = POSITION_ENT, name = "Ent", closedByDefault = true, description = "Information to display for slayer task")
    String entSettings = "ent";

    @ConfigItem(keyName = "Ent", name = "Ent information", description = "Create individual bullet points in overlay, one per line", section = entSettings, position = 0)
    default String entInfo() { return "Wilderness: Ferox enclave -> Run NE\n" + "Skill' necklace (WC guild) -> Enter dungeon"; }

    // Fever Spiders
    @ConfigSection(position = POSITION_FEVER_SPIDERS, name = "Fever Spiders", closedByDefault = true, description = "Information to display for slayer task")
    String feverSpidersSettings = "feverSpiders";

    @ConfigItem(keyName = "Fever Spiders", name = "Fever Spiders information", description = "Create individual bullet points in overlay, one per line", section = feverSpidersSettings, position = 0)
    default String feverSpidersInfo() { return "Ectophial\n" + "Run North and talk to Pirate Pete to Braindeath island"; }

    // Fire Giants
    @ConfigSection(position = POSITION_FIRE_GIANTS, name = "Fire Giants", closedByDefault = true, description = "Information to display for slayer task")
    String fireGiantsSettings = "fireGiants";

    @ConfigItem(keyName = "Fire Giants", name = "Fire Giants information", description = "Create individual bullet points in overlay, one per line", section = fireGiantsSettings, position = 0)
    default String fireGiantsInfo() { return "Catacombs of Kourend: Run West\n" + STRONGHOLD_SLAYER_CAVE; }

    // Flesh Crawlers
    @ConfigSection(position = POSITION_FLESH_CRAWLERS, name = "Flesh Crawlers", closedByDefault = true, description = "Information to display for slayer task")
    String fleshCrawlersSettings = "fleshCrawlers";

    @ConfigItem(keyName = "Flesh Crawlers", name = "Flesh Crawlers information", description = "Create individual bullet points in overlay, one per line", section = fleshCrawlersSettings, position = 0)
    default String fleshCrawlersInfo() { return "Skull sceptre\n" + "2nd floor\n" + "Run SE"; }

    // Fossil Island Wyvern
    @ConfigSection(position = POSITION_FOSSIL_ISLAND_WYVERN, name = "Fossil Island Wyvern", closedByDefault = true, description = "Information to display for slayer task")
    String fossilIslandWyvernSettings = "fossilIslandWyvern";

    @ConfigItem(keyName = "Fossil Island Wyvern", name = "Fossil Island Wyvern information", description = "Create individual bullet points in overlay, one per line", section = fossilIslandWyvernSettings, position = 0)
    default String fossilIslandWyvernInfo() { return "BRING: Elemental/ancient wyvern/dragonfire shield\n" + "Digsite pendent (Fossil island) -> Magic mushtree (4) -> Run South to cave"; }

    // Frost Dragons
    @ConfigSection(position = POSITION_FROST_DRAGONS, name = "Frost Dragons", closedByDefault = true, description = "Information to display for slayer task")
    String frostDragonsSettings = "frostDragons";

    @ConfigItem(keyName = "Frost Dragons", name = "Frost Dragons information", description = "Create individual bullet points in overlay, one per line", section = frostDragonsSettings, position = 0)
    default String frostDragonsInfo() { return "Fairy ring (DLP)"; }

    // Gargoyles
    @ConfigSection(position = POSITION_GARGOYLES, name = "Gargoyles", closedByDefault = true, description = "Information to display for slayer task")
    String gargoylesSettings = "gargoyles";

    @ConfigItem(keyName = "Gargoyles", name = "Gargoyles information", description = "Create individual bullet points in overlay, one per line", section = gargoylesSettings, position = 0)
    default String gargoylesInfo() { return SLAYER_TOWER + "\n" + "Top floor or basement"; }

    // Ghosts
    @ConfigSection(position = POSITION_GHOSTS, name = "Ghosts", closedByDefault = true, description = "Information to display for slayer task")
    String ghostsSettings = "ghosts";

    @ConfigItem(keyName = "Ghosts", name = "Ghosts information", description = "Create individual bullet points in overlay, one per line", section = ghostsSettings, position = 0)
    default String ghostsInfo() { return "Catacombs of Kourend\n" + "Run East, then North"; }

    // Ghouls
    @ConfigSection(position = POSITION_GHOULS, name = "Ghouls", closedByDefault = true, description = "Information to display for slayer task")
    String ghoulsSettings = "ghouls";

    @ConfigItem(keyName = "Ghouls", name = "Ghouls information", description = "Create individual bullet points in overlay, one per line", section = ghoulsSettings, position = 0)
    default String ghoulsInfo() { return "Salve graveyard teleport\n" + "Fairy ring (CKS)"; }

    // Goblins
    @ConfigSection(position = POSITION_GOBLINS, name = "Goblins", closedByDefault = true, description = "Information to display for slayer task")
    String goblinsSettings = "goblins";

    @ConfigItem(keyName = "Goblins", name = "Goblins information", description = "Create individual bullet points in overlay, one per line", section = goblinsSettings, position = 0)
    default String goblinsInfo() { return "Lumbridge teleport\n" + "Run East across river"; }

    // Greater Demons
    @ConfigSection(position = POSITION_GREATER_DEMONS, name = "Greater Demons", closedByDefault = true, description = "Information to display for slayer task")
    String greaterDemonsSettings = "greaterDemons";

    @ConfigItem(keyName = "Greater Demons", name = "Greater Demons information", description = "Create individual bullet points in overlay, one per line", section = greaterDemonsSettings, position = 0)
    default String greaterDemonsInfo() { return "Tormented demons: Guthixian temple teleport - alternatively (Remember sapphire lantern) Games necklace (Tears of Guthix)" + CHASM_OF_FIRE; }

    // Green Dragons
    @ConfigSection(position = POSITION_GREEN_DRAGONS, name = "Green Dragons", closedByDefault = true, description = "Information to display for slayer task")
    String greenDragonsSettings = "greenDragons";

    @ConfigItem(keyName = "Green Dragons", name = "Green Dragons information", description = "Create individual bullet points in overlay, one per line", section = greenDragonsSettings, position = 0)
    default String greenDragonsInfo() { return "Ferox enclave -> run North\n" + "Wilderness slayer cave"; }

    // Gryphons
    @ConfigSection(position = POSITION_GRYPHONS, name = "Gryphons", closedByDefault = true, description = "Information to display for slayer task")
    String gryphonsSettings = "gryphons";

    @ConfigItem(keyName = "Gryphons", name = "Gryphons information", description = "Create individual bullet points in overlay, one per line", section = gryphonsSettings, position = 0)
    default String gryphonsInfo() { return "Fairy ring (CJQ)\n" + "Run North"; }

    // Harpie Bug Swarms
    @ConfigSection(position = POSITION_HARPIE_BUG_SWARMS, name = "Harpie Bug Swarms", closedByDefault = true, description = "Information to display for slayer task")
    String harpieBugSwarmsSettings = "harpieBugSwarms";

    @ConfigItem(keyName = "Harpie Bug Swarms", name = "Harpie Bug Swarms information", description = "Create individual bullet points in overlay, one per line", section = harpieBugSwarmsSettings, position = 0)
    default String harpieBugSwarmsInfo() { return "Colossal worm quetzal site -> Run SE\n" + "Fairy ring (AJP) -> Run SE"; }

    // Hellhounds
    @ConfigSection(position = POSITION_HELLHOUNDS, name = "Hellhounds", closedByDefault = true, description = "Information to display for slayer task")
    String hellhoundsSettings = "hellhounds";

    @ConfigItem(keyName = "Hellhounds", name = "Hellhounds information", description = "Create individual bullet points in overlay, one per line", section = hellhoundsSettings, position = 0)
    default String hellhoundsInfo() { return STRONGHOLD_SLAYER_CAVE + "Run South"; }

    // Hill Giants
    @ConfigSection(position = POSITION_HILL_GIANTS, name = "Hill Giants", closedByDefault = true, description = "Information to display for slayer task")
    String hillGiantsSettings = "hillGiants";

    @ConfigItem(keyName = "Hill Giants", name = "Hill Giants information", description = "Create individual bullet points in overlay, one per line", section = hillGiantsSettings, position = 0)
    default String hillGiantsInfo() { return "Catacombs of Kourend: Run North"; }

    // Hobgoblins
    @ConfigSection(position = POSITION_HOBGOBLINS, name = "Hobgoblins", closedByDefault = true, description = "Information to display for slayer task")
    String hobgoblinsSettings = "hobgoblins";

    @ConfigItem(keyName = "Hobgoblins", name = "Hobgoblins information", description = "Create individual bullet points in overlay, one per line", section = hobgoblinsSettings, position = 0)
    default String hobgoblinsInfo() { return "Fairy ring (AKR)\n" + "Run North"; }

    // Hydras
    @ConfigSection(position = POSITION_HYDRAS, name = "Hydras", closedByDefault = true, description = "Information to display for slayer task")
    String hydrasSettings = "hydras";

    @ConfigItem(keyName = "Hydras", name = "Hydras information", description = "Create individual bullet points in overlay, one per line", section = hydrasSettings, position = 0)
    default String hydrasInfo() { return MOUNT_KARUULM; }

    // Icefiends
    @ConfigSection(position = POSITION_ICEFIENDS, name = "Icefiends", closedByDefault = true, description = "Information to display for slayer task")
    String icefiendsSettings = "icefiends";

    @ConfigItem(keyName = "Icefiends", name = "Icefiends information", description = "Create individual bullet points in overlay, one per line", section = icefiendsSettings, position = 0)
    default String icefiendsInfo() { return "Combat bracelet (Monastery)"; }

    // Ice Giants
    @ConfigSection(position = POSITION_ICE_GIANTS, name = "Ice Giants", closedByDefault = true, description = "Information to display for slayer task")
    String iceGiantsSettings = "iceGiants";

    @ConfigItem(keyName = "Ice Giants", name = "Ice Giants information", description = "Create individual bullet points in overlay, one per line", section = iceGiantsSettings, position = 0)
    default String iceGiantsInfo() { return "Giantsoul amulet\n" + ASGARNIAN_DUNGEON + " -> Take shortcut West or run North, then East"; }

    // Ice Warriors
    @ConfigSection(position = POSITION_ICE_WARRIORS, name = "Ice Warriors", closedByDefault = true, description = "Information to display for slayer task")
    String iceWarriorsSettings = "iceWarriors";

    @ConfigItem(keyName = "Ice Warriors", name = "Ice Warriors information", description = "Create individual bullet points in overlay, one per line", section = iceWarriorsSettings, position = 0)
    default String iceWarriorsInfo() { return "Giantsoul amulet\n" + ASGARNIAN_DUNGEON + " -> Run North, then East"; }

    // Infernal Mages
    @ConfigSection(position = POSITION_INFERNAL_MAGES, name = "Infernal Mages", closedByDefault = true, description = "Information to display for slayer task")
    String infernalMagesSettings = "infernalMages";

    @ConfigItem(keyName = "Infernal Mages", name = "Infernal Mages information", description = "Create individual bullet points in overlay, one per line", section = infernalMagesSettings, position = 0)
    default String infernalMagesInfo() { return SLAYER_TOWER + "\n" + "1st floor"; }

    // Jellies
    @ConfigSection(position = POSITION_JELLIES, name = "Jellies", closedByDefault = true, description = "Information to display for slayer task")
    String jelliesSettings = "jellies";

    @ConfigItem(keyName = "Jellies", name = "Jellies information", description = "Create individual bullet points in overlay, one per line", section = jelliesSettings, position = 0)
    default String jelliesInfo() { return "Catacombs of Kourend: Run East, then South (continue or then East and then North)"; }

    // Jungle Horrors
    @ConfigSection(position = POSITION_JUNGLE_HORRORS, name = "Jungle Horrors", closedByDefault = true, description = "Information to display for slayer task")
    String jungleHorrorsSettings = "jungleHorrors";

    @ConfigItem(keyName = "Jungle Horrors", name = "Jungle Horrors information", description = "Create individual bullet points in overlay, one per line", section = jungleHorrorsSettings, position = 0)
    default String jungleHorrorsInfo() { return MOS_LE_HARMLESS; }

    // Kalphite
    @ConfigSection(position = POSITION_KALPHITE, name = "Kalphite", closedByDefault = true, description = "Information to display for slayer task")
    String kalphiteSettings = "kalphite";

    @ConfigItem(keyName = "Kalphite", name = "Kalphite information", description = "Create individual bullet points in overlay, one per line", section = kalphiteSettings, position = 0)
    default String kalphiteInfo() { return "Desert amulet 4\n" + "Fairy ring (BIQ)"; }

    // Killerwatts
    @ConfigSection(position = POSITION_KILLERWATTS, name = "Killerwatts", closedByDefault = true, description = "Information to display for slayer task")
    String killerwattsSettings = "killerwatts";

    @ConfigItem(keyName = "Killerwatts", name = "Killerwatts information", description = "Create individual bullet points in overlay, one per line", section = killerwattsSettings, position = 0)
    default String killerwattsInfo() { return "Top of Draynor manor (portal machine)"; }

    // Kurasks
    @ConfigSection(position = POSITION_KURASKS, name = "Kurasks", closedByDefault = true, description = "Information to display for slayer task")
    String kurasksSettings = "kurasks";

    @ConfigItem(keyName = "Kurasks", name = "Kurasks information", description = "Create individual bullet points in overlay, one per line", section = kurasksSettings, position = 0)
    default String kurasksInfo() { return "BRING: Leaf-bladed weapons or broad ammunition\n" + "Iorwerth dungeon\n" + FREMENNIK_SLAYER_CAVE; }

    // Lava Dragons
    @ConfigSection(position = POSITION_LAVA_DRAGONS, name = "Lava Dragons", closedByDefault = true, description = "Information to display for slayer task")
    String lavaDragonsSettings = "lavaDragons";

    @ConfigItem(keyName = "Lava Dragons", name = "Lava Dragons information", description = "Create individual bullet points in overlay, one per line", section = lavaDragonsSettings, position = 0)
    default String lavaDragonsInfo() { return "Revenant cave teleport -> Run East\n" + "Annakarl teleport -> Run SW"; }

    // Lesser Demons
    @ConfigSection(position = POSITION_LESSER_DEMONS, name = "Lesser Demons", closedByDefault = true, description = "Information to display for slayer task")
    String lesserDemonsSettings = "lesserDemons";

    @ConfigItem(keyName = "Lesser Demons", name = "Lesser Demons information", description = "Create individual bullet points in overlay, one per line", section = lesserDemonsSettings, position = 0)
    default String lesserDemonsInfo() { return CHASM_OF_FIRE; }

    // Lesser Nagua
    @ConfigSection(position = POSITION_LESSER_NAGUA, name = "Lesser Nagua", closedByDefault = true, description = "Information to display for slayer task")
    String lesserNaguaSettings = "lesserNagua";

    @ConfigItem(keyName = "Lesser Nagua", name = "Lesser Nagua information", description = "Create individual bullet points in overlay, one per line", section = lesserNaguaSettings, position = 0)
    default String lesserNaguaInfo() { return "Cam Torum teleport (calcified moth or quetzal)\n" + "Run North to Moons\n" + "Run through SW"; }

    // Lizardmen
    @ConfigSection(position = POSITION_LIZARDMEN, name = "Lizardmen Shamans", closedByDefault = true, description = "Information to display for slayer task")
    String lizardmenSettings = "lizardmen";

    @ConfigItem(keyName = "Lizardmen", name = "Lizardmen information", description = "Create individual bullet points in overlay, one per line", section = lizardmenSettings, position = 0)
    default String lizardmenInfo() { return "Skills necklace (farming guild) OR fairy ring (CLR)\n" + "Run South to Lizardman Temple"; }

    // Lizards
    @ConfigSection(position = POSITION_LIZARDS, name = "Lizards", closedByDefault = true, description = "Information to display for slayer task")
    String lizardsSettings = "lizards";

    @ConfigItem(keyName = "Lizards", name = "Lizards information", description = "Create individual bullet points in overlay, one per line", section = lizardsSettings, position = 0)
    default String lizardsInfo() { return MOUNT_KARUULM + "\n" + "Run East up the stairs,then South"; }

    // Magic Axes
    @ConfigSection(position = POSITION_MAGIC_AXES, name = "Magic Axes", closedByDefault = true, description = "Information to display for slayer task")
    String magicAxesSettings = "magicAxes";

    @ConfigItem(keyName = "Magic Axes", name = "Magic Axes information", description = "Create individual bullet points in overlay, one per line", section = magicAxesSettings, position = 0)
    default String magicAxesInfo() { return "Taverly dungeon"; }

    // Mammoth
    @ConfigSection(position = POSITION_MAMMOTH, name = "Mammoth", closedByDefault = true, description = "Information to display for slayer task")
    String mammothSettings = "mammoth";

    @ConfigItem(keyName = "Mammoth", name = "Mammoth information", description = "Create individual bullet points in overlay, one per line", section = mammothSettings, position = 0)
    default String mammothInfo() { return "Teleport to Ferox enclave\n" + "Run SE"; }

    // Metal Dragons
    @ConfigSection(position = POSITION_METAL_DRAGONS, name = "Metal Dragons", closedByDefault = true, description = "Information to display for slayer task")
    String metalDragonsSettings = "metalDragons";

    @ConfigItem(keyName = "Metal Dragons", name = "Metal Dragons information", description = "Create individual bullet points in overlay, one per line", section = metalDragonsSettings, position = 0)
    default String metalDragonsInfo() { return "Placeholder"; }

    // Minotaurs
    @ConfigSection(position = POSITION_MINOTAURS, name = "Minotaurs", closedByDefault = true, description = "Information to display for slayer task")
    String minotaursSettings = "minotaurs";

    @ConfigItem(keyName = "Minotaurs", name = "Minotaurs information", description = "Create individual bullet points in overlay, one per line", section = minotaursSettings, position = 0)
    default String minotaursInfo() { return "Skull sceptre\n" + "1st floor"; }

    // Mogres
    @ConfigSection(position = POSITION_MOGRES, name = "Mogres", closedByDefault = true, description = "Information to display for slayer task")
    String mogresSettings = "mogres";

    @ConfigItem(keyName = "Mogres", name = "Mogres information", description = "Create individual bullet points in overlay, one per line", section = mogresSettings, position = 0)
    default String mogresInfo() { return "BRING: Fishing explosives\n" + "Fairy ring (AIQ)"; }

    // Molanisks
    @ConfigSection(position = POSITION_MOLANISKS, name = "Molanisks", closedByDefault = true, description = "Information to display for slayer task")
    String molanisksSettings = "molanisks";

    @ConfigItem(keyName = "Molanisks", name = "Molanisks information", description = "Create individual bullet points in overlay, one per line", section = molanisksSettings, position = 0)
    default String molanisksInfo() { return DORGESHKAAN_DUNGEON; }

    // Monkeys
    @ConfigSection(position = POSITION_MONKEYS, name = "Monkeys", closedByDefault = true, description = "Information to display for slayer task")
    String monkeysSettings = "monkeys";

    @ConfigItem(keyName = "Monkeys", name = "Monkeys information", description = "Create individual bullet points in overlay, one per line", section = monkeysSettings, position = 0)
    default String monkeysInfo() { return "Fairy ring (CKR)"; }

    // Moss Giants
    @ConfigSection(position = POSITION_MOSS_GIANTS, name = "Moss Giants", closedByDefault = true, description = "Information to display for slayer task")
    String mossGiantsSettings = "mossGiants";

    @ConfigItem(keyName = "Moss Giants", name = "Moss Giants information", description = "Create individual bullet points in overlay, one per line", section = mossGiantsSettings, position = 0)
    default String mossGiantsInfo() { return "Catacombs of Kourend: Run East"; }

    // Nechryael
    @ConfigSection(position = POSITION_NECHRYAEL, name = "Nechryael", closedByDefault = true, description = "Information to display for slayer task")
    String nechryaelSettings = "nechryael";

    @ConfigItem(keyName = "Nechryael", name = "Nechryael information", description = "Create individual bullet points in overlay, one per line", section = nechryaelSettings, position = 0)
    default String nechryaelInfo() { return "Catacombs of Kourend: Run North, then East"; }

    // Ogres
    @ConfigSection(position = POSITION_OGRES, name = "Ogres", closedByDefault = true, description = "Information to display for slayer task")
    String ogresSettings = "ogres";

    @ConfigItem(keyName = "Ogres", name = "Ogres information", description = "Create individual bullet points in overlay, one per line", section = ogresSettings, position = 0)
    default String ogresInfo() { return "Ring of duelling (Castle wars)\n" + "Run East"; }

    // Otherworldly Beings
    @ConfigSection(position = POSITION_OTHERWORLDLY_BEINGS, name = "Otherworldly Beings", closedByDefault = true, description = "Information to display for slayer task")
    String otherworldlyBeingsSettings = "otherworldlyBeings";

    @ConfigItem(keyName = "Otherworldly Beings", name = "Otherworldly Beings information", description = "Create individual bullet points in overlay, one per line", section = otherworldlyBeingsSettings, position = 0)
    default String otherworldlyBeingsInfo() { return "Teleport to Zanaris\n" + "Run North, then SW"; }

    // Pirates
    @ConfigSection(position = POSITION_PIRATES, name = "Pirates", closedByDefault = true, description = "Information to display for slayer task")
    String piratesSettings = "pirates";

    @ConfigItem(keyName = "Pirates", name = "Pirates information", description = "Create individual bullet points in overlay, one per line", section = piratesSettings, position = 0)
    default String piratesInfo() { return ASGARNIAN_DUNGEON + " -> Run North"; }

    // Pyrefiends
    @ConfigSection(position = POSITION_PYREFIENDS, name = "Pyrefiends", closedByDefault = true, description = "Information to display for slayer task")
    String pyrefiendsSettings = "pyrefiends";

    @ConfigItem(keyName = "Pyrefiends", name = "Pyrefiends information", description = "Create individual bullet points in overlay, one per line", section = pyrefiendsSettings, position = 0)
    default String pyrefiendsInfo() { return "Fairy ring (BJP)\n" + "Run South"; }

    // Rats
    @ConfigSection(position = POSITION_RATS, name = "Rats", closedByDefault = true, description = "Information to display for slayer task")
    String ratsSettings = "rats";

    @ConfigItem(keyName = "Rats", name = "Rats information", description = "Create individual bullet points in overlay, one per line", section = ratsSettings, position = 0)
    default String ratsInfo() { return "Scurrius: Teleport to Varrock -> Run NE and enter sewers -> Run East\n" + "Normal rats: Fairy ring (BLS) -> Run West"; }

    // Red Dragons
    @ConfigSection(position = POSITION_RED_DRAGONS, name = "Red Dragons", closedByDefault = true, description = "Information to display for slayer task")
    String redDragonsSettings = "redDragons";

    @ConfigItem(keyName = "Red Dragons", name = "Red Dragons information", description = "Create individual bullet points in overlay, one per line", section = redDragonsSettings, position = 0)
    default String redDragonsInfo() { return "Placeholder"; }

    // Revenants
    @ConfigSection(position = POSITION_REVENANTS, name = "Revenants", closedByDefault = true, description = "Information to display for slayer task")
    String revenantsSettings = "revenants";

    @ConfigItem(keyName = "Revenants", name = "Revenants information", description = "Create individual bullet points in overlay, one per line", section = revenantsSettings, position = 0)
    default String revenantsInfo() { return "Revenant cave teleport"; }

    // Rockslugs
    @ConfigSection(position = POSITION_ROCKSLUGS, name = "Rockslugs", closedByDefault = true, description = "Information to display for slayer task")
    String rockslugsSettings = "rockslugs";

    @ConfigItem(keyName = "Rockslugs", name = "Rockslugs information", description = "Create individual bullet points in overlay, one per line", section = rockslugsSettings, position = 0)
    default String rockslugsInfo() { return FREMENNIK_SLAYER_CAVE; }

    // Rogues
    @ConfigSection(position = POSITION_ROGUES, name = "Rogues", closedByDefault = true, description = "Information to display for slayer task")
    String roguesSettings = "rogues";

    @ConfigItem(keyName = "Rogues", name = "Rogues information", description = "Create individual bullet points in overlay, one per line", section = roguesSettings, position = 0)
    default String roguesInfo() { return "Obelisk or Annakarl teleport to Rogue's castle"; }

    // Scabarites
    @ConfigSection(position = POSITION_SCABARITES, name = "Scabarites", closedByDefault = true, description = "Information to display for slayer task")
    String scabaritesSettings = "scabarites";

    @ConfigItem(keyName = "Scabarites", name = "Scabarites information", description = "Create individual bullet points in overlay, one per line", section = scabaritesSettings, position = 0)
    default String scabaritesInfo() { return "Pharaoh's sceptre (1 - Jalsavrah)\n" + "Fairy ring (AKP) -> Run North to Sophanem"; }

    // Scorpions
    @ConfigSection(position = POSITION_SCORPIONS, name = "Scorpions", closedByDefault = true, description = "Information to display for slayer task")
    String scorpionsSettings = "scorpions";

    @ConfigItem(keyName = "Scorpions", name = "Scorpions information", description = "Create individual bullet points in overlay, one per line", section = scorpionsSettings, position = 0)
    default String scorpionsInfo() { return "Skills necklace (mining guild)"; }

    // Sea Snakes
    @ConfigSection(position = POSITION_SEA_SNAKES, name = "Sea Snakes", closedByDefault = true, description = "Information to display for slayer task")
    String seaSnakesSettings = "seaSnakes";

    @ConfigItem(keyName = "Sea Snakes", name = "Sea Snakes information", description = "Create individual bullet points in overlay, one per line", section = seaSnakesSettings, position = 0)
    default String seaSnakesInfo() { return "Fairy ring (CIP)\n" + "Run South to cave"; }

    // Shades
    @ConfigSection(position = POSITION_SHADES, name = "Shades", closedByDefault = true, description = "Information to display for slayer task")
    String shadesSettings = "shades";

    @ConfigItem(keyName = "Shades", name = "Shades information", description = "Create individual bullet points in overlay, one per line", section = shadesSettings, position = 0)
    default String shadesInfo() { return "Catacombs of Kourend: Run all the way West"; }

    // Shadow Warriors
    @ConfigSection(position = POSITION_SHADOW_WARRIORS, name = "Shadow Warriors", closedByDefault = true, description = "Information to display for slayer task")
    String shadowWarriorsSettings = "shadowWarriors";

    @ConfigItem(keyName = "Shadow Warriors", name = "Shadow Warriors information", description = "Create individual bullet points in overlay, one per line", section = shadowWarriorsSettings, position = 0)
    default String shadowWarriorsInfo() { return "Fairy ring (BLR)\n" + "Run into Legend's Guild and enter dungeon"; }

    // Skeletal Wyverns
    @ConfigSection(position = POSITION_SKELETAL_WYVERNS, name = "Skeletal Wyverns", closedByDefault = true, description = "Information to display for slayer task")
    String skeletalWyvernsSettings = "skeletalWyverns";

    @ConfigItem(keyName = "Skeletal Wyverns", name = "Skeletal Wyverns information", description = "Create individual bullet points in overlay, one per line", section = skeletalWyvernsSettings, position = 0)
    default String skeletalWyvernsInfo() { return ASGARNIAN_DUNGEON + " -> Run North, then East, then South\n" + "(optional) go upstairs to safespot"; }

    // Skeletons
    @ConfigSection(position = POSITION_SKELETONS, name = "Skeletons", closedByDefault = true, description = "Information to display for slayer task")
    String skeletonsSettings = "skeletons";

    @ConfigItem(keyName = "Skeletons", name = "Skeletons information", description = "Create individual bullet points in overlay, one per line", section = skeletonsSettings, position = 0)
    default String skeletonsInfo() { return "Catacombs of Kourend: Run West\n" + "Digsite pendent (digsite) -> Run South and use rope on winch"; }

    // Smoke Devils
    @ConfigSection(position = POSITION_SMOKE_DEVILS, name = "Smoke Devils", closedByDefault = true, description = "Information to display for slayer task")
    String smokeDevilsSettings = "smokeDevils";

    @ConfigItem(keyName = "Smoke Devils", name = "Smoke Devils information", description = "Create individual bullet points in overlay, one per line", section = smokeDevilsSettings, position = 0)
    default String smokeDevilsInfo() { return "Fairy ring (BKP)\n" + "Run NE"; }

    // Sourhogs
    @ConfigSection(position = POSITION_SOURHOGS, name = "Sourhogs", closedByDefault = true, description = "Information to display for slayer task")
    String sourhogsSettings = "sourhogs";

    @ConfigItem(keyName = "Sourhogs", name = "Sourhogs information", description = "Create individual bullet points in overlay, one per line", section = sourhogsSettings, position = 0)
    default String sourhogsInfo() { return "Sourhog cave (East of Draynor Manor)"; }

    // Spiders
    @ConfigSection(position = POSITION_SPIDERS, name = "Spiders", closedByDefault = true, description = "Information to display for slayer task")
    String spidersSettings = "spiders";

    @ConfigItem(keyName = "Spiders", name = "Spiders information", description = "Create individual bullet points in overlay, one per line", section = spidersSettings, position = 0)
    default String spidersInfo() { return "Placeholder (fit to your needs araxytes/red spiders/bosses/..."; }

    // Spiritual Creatures
    @ConfigSection(position = POSITION_SPIRITUAL_CREATURES, name = "Spiritual Creatures", closedByDefault = true, description = "Information to display for slayer task")
    String spiritualCreaturesSettings = "spiritualCreatures";

    @ConfigItem(keyName = "Spiritual Creatures", name = "Spiritual Creatures information", description = "Create individual bullet points in overlay, one per line", section = spiritualCreaturesSettings, position = 0)
    default String spiritualCreaturesInfo() { return GOD_WARS_DUNGEON; }

    // Suqahs
    @ConfigSection(position = POSITION_SUQAHS, name = "Suqahs", closedByDefault = true, description = "Information to display for slayer task")
    String suqahsSettings = "suqahs";

    @ConfigItem(keyName = "Suqahs", name = "Suqahs information", description = "Create individual bullet points in overlay, one per line", section = suqahsSettings, position = 0)
    default String suqahsInfo() { return "Moonclan teleport"; }

    // Terror Dogs
    @ConfigSection(position = POSITION_TERROR_DOGS, name = "Terror Dogs", closedByDefault = true, description = "Information to display for slayer task")
    String terrorDogsSettings = "terrorDogs";

    @ConfigItem(keyName = "Terror Dogs", name = "Terror Dogs information", description = "Create individual bullet points in overlay, one per line", section = terrorDogsSettings, position = 0)
    default String terrorDogsInfo() { return "Slayer ring (Tairn's Lair)"; }

    // Trolls
    @ConfigSection(position = POSITION_TROLLS, name = "Trolls", closedByDefault = true, description = "Information to display for slayer task")
    String trollsSettings = "trolls";

    @ConfigItem(keyName = "Trolls", name = "Trolls information", description = "Create individual bullet points in overlay, one per line", section = trollsSettings, position = 0)
    default String trollsInfo() { return "Fairy ring (BLS)\n" + "Run West, then North"; }

    // Turoth
    @ConfigSection(position = POSITION_TUROTH, name = "Turoth", closedByDefault = true, description = "Information to display for slayer task")
    String turothSettings = "turoth";

    @ConfigItem(keyName = "Turoth", name = "Turoth information", description = "Create individual bullet points in overlay, one per line", section = turothSettings, position = 0)
    default String turothInfo() { return "BRING: Leaf-bladed weapons or broad ammunition\n" + FREMENNIK_SLAYER_CAVE; }

    // TzHaar
    @ConfigSection(position = POSITION_TZHAAR, name = "TzHaar", closedByDefault = true, description = "Information to display for slayer task")
    String tzHaarSettings = "tzHaar";

    @ConfigItem(keyName = "TzHaar", name = "TzHaar information", description = "Create individual bullet points in overlay, one per line", section = tzHaarSettings, position = 0)
    default String tzHaarInfo() { return "Fairy ring (BLP)\n" + "Minigame teleport (TzHaar Fight Pit)"; }

    // Vampyres
    @ConfigSection(position = POSITION_VAMPYRES, name = "Vampyres", closedByDefault = true, description = "Information to display for slayer task")
    String vampyresSettings = "vampyres";

    @ConfigItem(keyName = "Vampyres", name = "Vampyres information", description = "Create individual bullet points in overlay, one per line", section = vampyresSettings, position = 0)
    default String vampyresInfo() { return "Feral vampyres: Morytania legs 3 (Burgh) -> Run West\n" + "Vyrewatch sentinel: Drakan's medallion (Darkmeyer)"; }

    // Wall Beasts
    @ConfigSection(position = POSITION_WALL_BEASTS, name = "Wall Beasts", closedByDefault = true, description = "Information to display for slayer task")
    String wallBeastsSettings = "wallBeasts";

    @ConfigItem(keyName = "Wall Beasts", name = "Wall Beasts information", description = "Create individual bullet points in overlay, one per line", section = wallBeastsSettings, position = 0)
    default String wallBeastsInfo() { return DORGESHKAAN_DUNGEON; }

    // Warped Creatures
    @ConfigSection(position = POSITION_WARPED_CREATURES, name = "Warped Creatures", closedByDefault = true, description = "Information to display for slayer task")
    String warpedCreaturesSettings = "warpedCreatures";

    @ConfigItem(keyName = "Warped Creatures", name = "Warped Creatures information", description = "Create individual bullet points in overlay, one per line", section = warpedCreaturesSettings, position = 0)
    default String warpedCreaturesInfo() { return "Spirit tree (6)"; }

    // Waterfiends
    @ConfigSection(position = POSITION_WATERFIENDS, name = "Waterfiends", closedByDefault = true, description = "Information to display for slayer task")
    String waterfiendsSettings = "waterfiends";

    @ConfigItem(keyName = "Waterfiends", name = "Waterfiends information", description = "Create individual bullet points in overlay, one per line", section = waterfiendsSettings, position = 0)
    default String waterfiendsInfo() { return "Ancient cavern: Games necklace (Barbarian outpost) -> Run South\n" + "Iorwerth dungeon: Run NW"; }

    // Werewolves
    @ConfigSection(position = POSITION_WEREWOLVES, name = "Werewolves", closedByDefault = true, description = "Information to display for slayer task")
    String werewolvesSettings = "werewolves";

    @ConfigItem(keyName = "Werewolves", name = "Werewolves information", description = "Create individual bullet points in overlay, one per line", section = werewolvesSettings, position = 0)
    default String werewolvesInfo() { return GOD_WARS_DUNGEON; }

    // Wolves
    @ConfigSection(position = POSITION_WOLVES, name = "Wolves", closedByDefault = true, description = "Information to display for slayer task")
    String wolvesSettings = "wolves";

    @ConfigItem(keyName = "Wolves", name = "Wolves information", description = "Create individual bullet points in overlay, one per line", section = wolvesSettings, position = 0)
    default String wolvesInfo() { return "Royal seed pod OR Ring of duelling (Emir's arena) OR Amulet of Glory (Al kharid)\n" + "Glider to sindarpos"; }

    // Wyrms
    @ConfigSection(position = POSITION_WYRMS, name = "Wyrms", closedByDefault = true, description = "Information to display for slayer task")
    String wyrmsSettings = "wyrms";

    @ConfigItem(keyName = "Wyrms", name = "Wyrms information", description = "Create individual bullet points in overlay, one per line", section = wyrmsSettings, position = 0)
    default String wyrmsInfo() { return MOUNT_KARUULM + "\n" + "Run West"; }

    // Zombies
    @ConfigSection(position = POSITION_ZOMBIES, name = "Zombies", closedByDefault = true, description = "Information to display for slayer task")
    String zombiesSettings = "zombies";

    @ConfigItem(keyName = "Zombies", name = "Zombies information", description = "Create individual bullet points in overlay, one per line", section = zombiesSettings, position = 0)
    default String zombiesInfo() { return ALICES_FARM; }

    // Zygomites
    @ConfigSection(position = POSITION_ZYGOMITES, name = "Zygomites", closedByDefault = true, description = "Information to display for slayer task")
    String zygomitesSettings = "zygomites";

    @ConfigItem(keyName = "Zygomites", name = "Zygomites information", description = "Create individual bullet points in overlay, one per line", section = zygomitesSettings, position = 0)
    default String zygomitesInfo() { return "BRING: Fungicide spray\n" + "Digsite pendent (Fossil island) -> Magic mushtree (4)"; }
}

