package com.drstealth.soulcraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by DrStealth on 8/10/2016.
 */
public class ConfigurationHandler
{
    public static void init(File ConfigFile)
    {
        //Create the configuration object from the configutation file
        Configuration configuration = new Configuration(ConfigFile);

        try
        {
            //Load the configuration file.
            configuration.load();

            //Read in properties from the configuration file.
            boolean configValue = configuration.get(configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }

        catch (Exception e)
        {
            //Log the exception
        }

        finally
        {
            //Save the configuration file.
            configuration.save();
        }
    }
}
