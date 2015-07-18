package com.sam.testing;


import com.sam.testing.config.ConfigHandler;
import com.sam.testing.proxy.IProxy;
import com.sam.testing.reference.Reference;
import com.sam.testing.utility.LogHelper;
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

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Loading " + Reference.MOD_NAME);
        ConfigHandler.init(event.getSuggestedConfigurationFile());
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
