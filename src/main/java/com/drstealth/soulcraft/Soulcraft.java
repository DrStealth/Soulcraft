package com.drstealth.soulcraft;

/**
 * Created by DrStealth on 8/6/2016.
 */

import com.drstealth.soulcraft.creativetab.SoulcraftTab;
import com.drstealth.soulcraft.init.ModBlocks;
import com.drstealth.soulcraft.init.ModCrafting;
import com.drstealth.soulcraft.init.ModItems;
import com.drstealth.soulcraft.network.NetworkHandler;
import com.drstealth.soulcraft.reference.Reference;
import com.drstealth.soulcraft.handler.ConfigurationHandler;
import com.drstealth.soulcraft.proxy.IProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Soulcraft
{
    private EventBus eventBus = MinecraftForge.EVENT_BUS;

    @Instance(Reference.MOD_ID)
    public static Soulcraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public static final CreativeTabs CREATIVE_TABS = new SoulcraftTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance();
        eventBus.register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        ModItems.register();
        ModBlocks.register();

        proxy.preInit();
        NetworkHandler.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //proxy.init();

        ModCrafting.register();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
