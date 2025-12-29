package com.mathiaslj.configurableslayertaskoverlay;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ConfigurableSlayerTaskOverlayTest {
    public static void main(String[] args) throws Exception {
        ExternalPluginManager.loadBuiltin(ConfigurableSlayerTaskOverlayPlugin.class);
        RuneLite.main(args);
    }
}