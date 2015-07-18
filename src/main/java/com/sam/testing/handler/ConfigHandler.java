package com.sam.testing.handler;


import com.sam.testing.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration configuration;
    public static boolean DumpItemsToConsole = false;
    public static boolean RegenConfig = false;
    public static void init(File configFile) {

        //Create config object
        if(configuration == null )
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
            loadConfiguration();

        }
    }

    private static void loadConfiguration()
    {
        RegenConfig = configuration.getBoolean("RegenConfig", Configuration.CATEGORY_GENERAL, false, "Set this to true to regen configuration files");

        DumpItemsToConsole = configuration.getBoolean("DoOreDump", Configuration.CATEGORY_GENERAL, false, "This is a test function to print all ore to the console");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
