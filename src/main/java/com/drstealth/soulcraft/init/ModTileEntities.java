package com.drstealth.soulcraft.init;

import com.drstealth.soulcraft.reference.Reference;
import com.drstealth.soulcraft.tileentity.TileEntitySoulTank;
import com.drstealth.soulcraft.utility.Names;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by DrStealth on 9/7/2016.
 */
public class ModTileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntitySoulTank.class, Names.TileEntities.SOUL_TANK);
    }
}
