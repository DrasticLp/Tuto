package com.drastic.tuto.init;

import java.util.ArrayList;
import java.util.List;

import com.drastic.tuto.objects.blocks.BlockBasic;
import com.drastic.tuto.objects.blocks.BlockOreMod;
import com.drastic.tuto.objects.blocks.BlockSpecial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
    public static List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_TUTO = new BlockBasic("block_tuto", Material.ROCK);
    public static final Block TUTO_BLOCK_SPECIAL = new BlockSpecial("tuto_block_special", Material.ROCK);
    
    //Ores
    public static final Block ORE_TUTO = new BlockOreMod("ore_tuto", Material.ROCK);
}
