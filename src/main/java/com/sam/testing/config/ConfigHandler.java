package com.sam.testing.config;


import com.sam.testing.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigHandler {
    public static void init(File configFile) {

        //Create config object
        Configuration configuration = new Configuration(configFile);

        try
        {
            LogHelper.info("Attempting config load");
            configuration.load();

            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "An example").getBoolean();
        }
        catch (Exception e)
        {
            //Log exception
            LogHelper.error("Something broke... Config load failed");

        }
        finally
        {
            if (configuration.hasChanged())
            {
                configuration.save();
            }
        }
    }
}
