package com.drastic.tuto.world.generation;

import java.util.Random;

import com.drastic.tuto.init.BlockInit;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
    private WorldGenerator ore_tuto, block_tuto, dirt;
    
    public WorldGenCustomOres()
    {
        ore_tuto = new WorldGenMinable(BlockInit.ORE_TUTO.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        block_tuto = new WorldGenMinable(BlockInit.BLOCK_TUTO.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
        dirt = new WorldGenMinable(Blocks.DIRT.getDefaultState(), 15, BlockMatcher.forBlock(Blocks.END_STONE));
   }
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.getDimension())
        {
            case -1:
                runGenerator(block_tuto, world, random, chunkX, chunkZ, 150, 2, 255);
                break;
            case 0:
                runGenerator(ore_tuto, world, random, chunkX, chunkZ, 150, 2, 150);               
                break;
            case 1:
                runGenerator(dirt, world, random, chunkX, chunkZ, 150, 2, 255);
                break;
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
    {
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
        
        int heightDiff = maxHeight - minHeight + 1;
        
        for(int i = 0; i < chance; i++)
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);
            
            gen.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}
