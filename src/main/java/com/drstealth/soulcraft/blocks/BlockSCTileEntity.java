package com.drstealth.soulcraft.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by DrStealth on 9/7/2016.
 */
public abstract class BlockSCTileEntity extends BlockContainer
{
    public BlockSCTileEntity(Material material)
    {
        super(material);
    }
}
