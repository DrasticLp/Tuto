package com.drastic.tuto.init;

import java.util.ArrayList;
import java.util.List;

import com.drastic.tuto.objects.blocks.BlockBasic;
import com.drastic.tuto.objects.blocks.BlockOreMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
    public static List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_TUTO = new BlockBasic("block_tuto", Material.ROCK);
    
    //Ores
    public static final Block ORE_TUTO = new BlockOreMod("ore_tuto", Material.ROCK);
}
