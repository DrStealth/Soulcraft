package com.drstealth.soulcraft.blocks;

import com.drstealth.soulcraft.reference.RegisterEnumRef;
import com.drstealth.soulcraft.tileentity.TileEntitySoulTank;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by DrStealth on 9/19/2016.
 */
public class BlockSoulTank extends BlockSCTileEntity
{
    public BlockSoulTank()
    {
        super(Material.GLASS);
        setUnlocalizedName(RegisterEnumRef.SoulcraftBlocks.SOULTANK.getUnlocalizedName());
        setRegistryName(RegisterEnumRef.SoulcraftBlocks.SOULTANK.getRegistryName());
        this.setLightOpacity(1);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
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

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new TileEntitySoulTank();
    }
}
