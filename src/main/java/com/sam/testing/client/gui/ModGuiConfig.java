package com.sam.testing.client.gui;

import com.sam.testing.handler.ConfigHandler;
import com.sam.testing.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{

   public ModGuiConfig(GuiScreen guiScreen)
   {
       // Look in class GuiConfig for more info
       super(guiScreen,
               new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
               Reference.MOD_ID,
               false, // Does this require a world Restart
               false, // Does this require a MC Restart
               GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString())
               );
   }
}
