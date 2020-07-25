package com.drastic.tuto.objects.items.tools;

import java.util.Set;

import com.drastic.tuto.Main;
import com.drastic.tuto.init.BlockInit;
import com.drastic.tuto.init.ItemInit;
import com.drastic.tuto.util.interfaces.IHasModel;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemAxeMod extends ItemTool implements IHasModel
{

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(BlockInit.BLOCK_TUTO, Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    public ItemAxeMod(String name, ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TUTO_TAB);
        
        ItemInit.ITEMS.add(this);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? 1 : this.toolMaterial.getEfficiency();
    }

    @Override
    public void registerModels() 
    {
        Main.proxy.registerItemRenderer(this, 0);
    }

}