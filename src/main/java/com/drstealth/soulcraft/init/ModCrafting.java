package com.drstealth.soulcraft.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by DrStealth on 8/23/2016.
 */
public class ModCrafting
{

    public static void register()
    {
        //Shapeless Crafting
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.soulManualV1),
                new ItemStack(Item.getItemFromBlock(Blocks.SOUL_SAND)), new ItemStack(Items.BOOK));

        //Shaped Crafting
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.soulTank), "g g", "g g", "ggg",
                'g', new ItemStack(ModBlocks.soulGlass));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.soulCompressor), "tpt", "pgp", "bpb",
                't', new ItemStack(ModBlocks.soulTank), 'p', new ItemStack(Blocks.PISTON),
                'g', new ItemStack(ModBlocks.soulGlass), 'b', new ItemStack(Blocks.NETHER_BRICK));

        //Smelting
        GameRegistry.addSmelting(Blocks.SOUL_SAND, new ItemStack(Item.getItemFromBlock(ModBlocks.soulGlass)), 0.5f);
    }
}
