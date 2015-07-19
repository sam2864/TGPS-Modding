package com.sam.testing.init;

import com.sam.testing.block.BlockFlag;
import com.sam.testing.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID) // Stops other mods tampering with this
public class ModBlocks
{
    public static BlockFlag flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
