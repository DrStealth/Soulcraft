package com.drstealth.soulcraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by DrStealth on 8/23/2016.
 */
public class SoulcraftTab extends CreativeTabs
{
    public SoulcraftTab()
    {
        super("tabSoulcraft");
    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks.SOUL_SAND);
    }
}
