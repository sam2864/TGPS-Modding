package com.sam.testing.utility;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OredictHelper {
    public static boolean isItemThisOre(ItemStack item, String ore){
        for (int o : OreDictionary.getOreIDs(item)) {
            if (OreDictionary.getOreName(o).equals(ore)) {
                return true;
            }
        }
        return false;
    }
    //Requires the LogHelper class
    public static void dumpAllItems(){
        for (String l : OreDictionary.getOreNames()){
            LogHelper.info(l);
        }
    }
}



