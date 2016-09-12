package com.drstealth.soulcraft.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

/**
 * Created by DrStealth on 9/12/2016.
 */
public class ContainerSC extends Container
{
    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return false;
    }
}
