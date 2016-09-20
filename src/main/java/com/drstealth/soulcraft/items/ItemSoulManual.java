package com.drstealth.soulcraft.items;

import com.drstealth.soulcraft.reference.RegisterEnumRef;

/**
 * Created by DrStealth on 8/20/2016.
 */
public class ItemSoulManual extends ItemSC
{
    public ItemSoulManual()
    {
        super();
        setUnlocalizedName(RegisterEnumRef.SoulcraftItems.SOULMANUAL.getUnlocalizedName());
        setRegistryName(RegisterEnumRef.SoulcraftItems.SOULMANUAL.getRegistryName());
    }
}
