package com.drstealth.soulcraft.blocks;

import com.drstealth.soulcraft.reference.RegisterEnumRef;
import net.minecraft.block.material.Material;

/**
 * Created by DrStealth on 9/20/2016.
 */
public class BlockSoulCompressor extends BlockSC
{
    public BlockSoulCompressor()
    {
        super(Material.ROCK);
        setUnlocalizedName(RegisterEnumRef.SoulcraftBlocks.SOULCOMPRESSOR.getUnlocalizedName());
        setRegistryName(RegisterEnumRef.SoulcraftBlocks.SOULCOMPRESSOR.getRegistryName());
    }
}
