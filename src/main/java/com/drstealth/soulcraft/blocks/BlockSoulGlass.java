package com.drstealth.soulcraft.blocks;

import com.drstealth.soulcraft.reference.RegisterEnumRef;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by DrStealth on 8/21/2016.
 */
public class BlockSoulGlass extends BlockSC
{
    public BlockSoulGlass()
    {
        super(Material.GLASS);
        setUnlocalizedName(RegisterEnumRef.SoulcraftBlocks.SOULGLASS.getUnlocalizedName());
        setRegistryName(RegisterEnumRef.SoulcraftBlocks.SOULGLASS.getRegistryName());
        this.setLightOpacity(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}
