package com.drastic.tuto.objects.blocks;

import java.util.ArrayList;
import java.util.List;

import com.drastic.tuto.Main;
import com.drastic.tuto.init.BlockInit;
import com.drastic.tuto.init.ItemInit;
import com.drastic.tuto.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockOreMod extends Block implements IHasModel
{
    public BlockOreMod(String name, Material material)
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
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        List<ItemStack> list = new ArrayList<ItemStack>();
        list.add(new ItemStack(ItemInit.TUTO_INGOT, 5));
        list.add(new ItemStack(Items.APPLE, 5));
        return list;
    }
}
