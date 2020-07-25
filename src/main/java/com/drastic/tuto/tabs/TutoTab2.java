package com.drastic.tuto.tabs;

import com.drastic.tuto.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutoTab2 extends CreativeTabs
{

    public TutoTab2(String label)
    {
        super(label);
        this.setBackgroundImageName(label + ".png");
    }
    
    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.TUTO_BOOTS);
    }

}
