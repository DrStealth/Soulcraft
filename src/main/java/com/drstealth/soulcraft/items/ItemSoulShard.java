package com.drstealth.soulcraft.items;

import com.drstealth.soulcraft.reference.RegisterEnumRef;

/**
 * Created by DrStealth on 9/20/2016.
 */
public class ItemSoulShard extends ItemSC
{
    public ItemSoulShard()
    {
        super();
        setUnlocalizedName(RegisterEnumRef.SoulcraftItems.SOULSHARD.getUnlocalizedName());
        setRegistryName(RegisterEnumRef.SoulcraftItems.SOULSHARD.getRegistryName());
    }
}
