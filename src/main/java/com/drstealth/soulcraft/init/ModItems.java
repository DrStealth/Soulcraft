package com.drstealth.soulcraft.init;

import com.drstealth.soulcraft.items.ItemSC;
import com.drstealth.soulcraft.items.ItemSoulManual;
import com.drstealth.soulcraft.items.ItemSoulShard;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by DrStealth on 8/20/2016.
 */
public class ModItems
{
    public static ItemSC soulManualV1;
    public static ItemSC soulShard;

    public static void init()
    {
        soulManualV1 = new ItemSoulManual();
        soulShard = new ItemSoulShard();
    }

    public static void register()
    {
        GameRegistry.register(soulManualV1);
        GameRegistry.register(soulShard);
    }

    public static void registerRenders()
    {
        registerRender(soulManualV1);
        registerRender(soulShard);
    }

    private static void registerRender(ItemSC itemSC)
    {
        ModelLoader.setCustomModelResourceLocation(itemSC, 0, new ModelResourceLocation(itemSC.getRegistryName(),
                "inventory"));
    }
}
