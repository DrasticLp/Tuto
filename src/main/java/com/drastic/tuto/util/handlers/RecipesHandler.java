package com.drastic.tuto.util.handlers;

import com.drastic.tuto.init.BlockInit;
import com.drastic.tuto.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesHandler
{
    public static void registerRecipes()
    {
        GameRegistry.addSmelting(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(Items.DIAMOND, 5), 5.0f);
        GameRegistry.addSmelting(BlockInit.BLOCK_TUTO, new ItemStack(ItemInit.TUTO_INGOT, 9), 5.0f);
        
    }
}
