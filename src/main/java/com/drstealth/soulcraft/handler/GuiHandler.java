package com.drstealth.soulcraft.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by DrStealth on 9/12/2016.
 */
public class GuiHandler implements IGuiHandler
{
    public enum GuiIDs
    {

    }

    @java.lang.Override
    public java.lang.Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (GuiIDs.values()[ID])
        {

        }
        throw new IllegalArgumentException("No gui with id " + ID);
    }

    @java.lang.Override
    public java.lang.Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (GuiIDs.values()[ID])
        {

        }
        throw new IllegalArgumentException("No gui with id " + ID);
    }
}
