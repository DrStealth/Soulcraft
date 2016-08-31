package com.drstealth.soulcraft.client.gui;

import com.drstealth.soulcraft.handler.ConfigurationHandler;
import com.drstealth.soulcraft.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.List;

import static com.drstealth.soulcraft.handler.ConfigurationHandler.configuration;

/**
 * Created by DrStealth on 8/11/2016.
 */
public class ModGUIConfig extends GuiConfig
{

    public ModGUIConfig(GuiScreen guiScreen) {
        super(guiScreen, new ConfigElement(configuration.getCategory(configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID, false, false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
