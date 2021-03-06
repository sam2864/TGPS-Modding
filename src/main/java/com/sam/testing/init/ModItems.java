package com.sam.testing.init;

import com.sam.testing.item.ItemMapleLeaf;
import com.sam.testing.item.ItemTesting;
import com.sam.testing.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID) // Stops other mods tampering with this
public class ModItems
{
    public static final ItemTesting mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "MapleLeaf");
    }
}
