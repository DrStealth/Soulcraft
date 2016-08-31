package com.drstealth.soulcraft.blocks;

import com.drstealth.soulcraft.Soulcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by DrStealth on 8/21/2016.
 */
public class BlockSC extends Block
{
    public BlockSC(Material materialIn)
    {
        super(materialIn);
        setCreativeTab(Soulcraft.CREATIVE_TABS);
    }
}
