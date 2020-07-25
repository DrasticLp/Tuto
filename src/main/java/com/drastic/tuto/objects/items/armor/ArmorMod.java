package com.drastic.tuto.objects.items.armor;

import com.drastic.tuto.Main;
import com.drastic.tuto.init.ItemInit;
import com.drastic.tuto.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArmorMod extends ItemArmor implements IHasModel
{

    public ArmorMod(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
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
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        super.onArmorTick(world, player, itemStack);
    }
    
}
