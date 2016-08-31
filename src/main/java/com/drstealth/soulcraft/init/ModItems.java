package com.drstealth.soulcraft.init;

import com.drstealth.soulcraft.items.ItemSC;
import com.drstealth.soulcraft.items.ItemSoulManualV1;
import com.drstealth.soulcraft.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by DrStealth on 8/20/2016.
 */
public class ModItems
{
    public static ItemSC soulManualV1;

    public static void init()
    {
        soulManualV1 = new ItemSoulManualV1();
    }

    public static void register()
    {
        GameRegistry.register(soulManualV1);
    }

    public static void registerRenders()
    {
        registerRender(soulManualV1);
    }

    private static void registerRender(ItemSC itemSC)
    {
        ModelLoader.setCustomModelResourceLocation(itemSC, 0, new ModelResourceLocation(itemSC.getRegistryName(),
                "inventory"));

        //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemSC, 0,
        //        new ModelResourceLocation(Reference.MOD_ID + ":" + itemSC.getUnlocalizedName().substring(5), "inventory"));
    }
}
