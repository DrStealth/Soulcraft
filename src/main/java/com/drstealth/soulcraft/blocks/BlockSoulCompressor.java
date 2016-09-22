package com.drstealth.soulcraft.blocks;

import com.drstealth.soulcraft.reference.RegisterEnumRef;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by DrStealth on 9/20/2016.
 */
public class BlockSoulCompressor extends BlockSCTileEntity
{
    public BlockSoulCompressor()
    {
        super(Material.ROCK);
        setUnlocalizedName(RegisterEnumRef.SoulcraftBlocks.SOULCOMPRESSOR.getUnlocalizedName());
        setRegistryName(RegisterEnumRef.SoulcraftBlocks.SOULCOMPRESSOR.getRegistryName());
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return null;
    }
}
