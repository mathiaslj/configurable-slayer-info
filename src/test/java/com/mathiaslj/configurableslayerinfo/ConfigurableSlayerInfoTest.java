package com.mathiaslj.configurableslayerinfo;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ConfigurableSlayerInfoTest {
    public static void main(String[] args) throws Exception {
        ExternalPluginManager.loadBuiltin(ConfigurableSlayerInfoPlugin.class);
        RuneLite.main(args);
    }
}