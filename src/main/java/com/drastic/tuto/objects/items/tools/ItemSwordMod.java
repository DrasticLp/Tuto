package com.drastic.tuto.objects.items.tools;

import com.drastic.tuto.Main;
import com.drastic.tuto.init.ItemInit;
import com.drastic.tuto.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class ItemSwordMod extends ItemSword implements IHasModel
{

    public ItemSwordMod(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TUTO_TAB);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }

}
