package com.drastic.tuto.tabs;

import com.drastic.tuto.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutoTab extends CreativeTabs
{

    public TutoTab(String label)
    {
        super(label);
        this.setBackgroundImageName(label + ".png");
    }
    
    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.TUTO_HELMET);
    }

}
