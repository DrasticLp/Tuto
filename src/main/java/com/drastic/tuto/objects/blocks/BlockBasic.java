package com.drastic.tuto.objects.blocks;

import com.drastic.tuto.Main;
import com.drastic.tuto.init.BlockInit;
import com.drastic.tuto.init.ItemInit;
import com.drastic.tuto.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBasic extends Block implements IHasModel
{
    public BlockBasic(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TUTO_TAB);
        setHardness(8.0F);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
    
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public boolean isFullBlock(IBlockState state)
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public boolean isFullCube(IBlockState state)
    {
        // TODO Auto-generated method stub
        return false;
    }
} 