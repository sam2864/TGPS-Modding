package com.sam.testing.block;

import com.sam.testing.creativetab.CreativeTabTesting;

public class BlockFlag extends BlockTesting

{
    public BlockFlag()
    {
        super();
        this.setBlockName("flag");
        this.setCreativeTab(CreativeTabTesting.TEST_TAB);
        this.setHarvestLevel("ItemPickaxe", 2);
        this.setHardness(4);
    }
}
