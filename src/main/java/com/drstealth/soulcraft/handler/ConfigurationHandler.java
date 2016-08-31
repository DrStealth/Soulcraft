package com.drstealth.soulcraft.handler;

import com.drstealth.soulcraft.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by DrStealth on 8/10/2016.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File ConfigFile)
    {
        //Create the configuration object from the configuration file
        if(configuration == null)
        {
            configuration = new Configuration(ConfigFile);
            LoadConfiguration();
        }


    }

    @SubscribeEvent
    public void OnConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs.
            LoadConfiguration();
        }
    }

    private static void LoadConfiguration()
    {

        //Read in properties from the configuration file.
        testValue = configuration.get("configValue", configuration.CATEGORY_GENERAL,  true,
                "This is an example config value").getBoolean(true);

        //Save the configuration file.
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
