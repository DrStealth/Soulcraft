package com.drstealth.soulcraft.init;

import com.drstealth.soulcraft.blocks.BlockSC;
import com.drstealth.soulcraft.blocks.BlockSoulCompressor;
import com.drstealth.soulcraft.blocks.BlockSoulGlass;
import com.drstealth.soulcraft.blocks.BlockSoulTank;
import com.drstealth.soulcraft.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by DrStealth on 8/21/2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static BlockSC soulGlass;
    public static BlockSC soulTank;
    public static BlockSC soulCompressor;

    public static void init()
    {
        soulGlass = new BlockSoulGlass();
        soulTank = new BlockSoulTank();
        soulCompressor = new BlockSoulCompressor();
    }

    public static void register()
    {
        registerBlock(soulGlass);
        registerBlock(soulTank);
        registerBlock(soulCompressor);
    }

    private static void registerBlock(BlockSC blockSC)
    {
        GameRegistry.register(blockSC);
        ItemBlock item = new ItemBlock(blockSC);
        item.setRegistryName(blockSC.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders()
    {
        registerRender(soulGlass);
        registerRender(soulTank);
        registerRender(soulCompressor);
    }

    private static void registerRender(BlockSC blockSC)
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSC), 0,
                new ModelResourceLocation(blockSC.getRegistryName(), "inventory"));
    }
}
