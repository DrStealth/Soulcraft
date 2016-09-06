package com.drstealth.soulcraft.network;

import com.drstealth.soulcraft.reference.Reference;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

/**
 * Created by DrStealth on 9/6/2016.
 */
public class NetworkHandler
{
    private static SimpleNetworkWrapper INSTANCE;

    public static void init()
    {
        INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);
    }
}
