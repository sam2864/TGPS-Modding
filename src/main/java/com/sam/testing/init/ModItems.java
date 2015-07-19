package com.sam.testing.init;

import com.sam.testing.item.ItemMapleLeaf;
import com.sam.testing.item.ItemWrapper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemWrapper mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "MapleLeaf");
    }
}
