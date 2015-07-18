package com.sam.testing;


import com.sam.testing.proxy.IProxy;
import com.sam.testing.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class testing
{
    @Mod.Instance(Reference.MOD_ID)
    public static testing instance;

    @SidedProxy(clientSide = "com.sam.testing.proxy.ClientProxy", serverSide = "com.sam.testing.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }



    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
