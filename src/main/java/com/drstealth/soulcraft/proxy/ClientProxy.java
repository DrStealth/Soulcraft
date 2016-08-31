package com.drstealth.soulcraft.proxy;

import com.drstealth.soulcraft.init.ModBlocks;
import com.drstealth.soulcraft.init.ModItems;

/**
 * Created by DrStealth on 8/6/2016.
 */
public class ClientProxy extends CommonProxy
{

    @Override
    public void preInit()
    {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

    @Override
    public void init()
    {
        //ModItems.registerRenders();
        //ModBlocks.registerRenders();
    }
}
