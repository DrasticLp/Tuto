package com.drastic.tuto.init;

import java.util.ArrayList;
import java.util.List;

import com.drastic.tuto.objects.items.ItemBase;
import com.drastic.tuto.objects.items.ItemCustomFood;
import com.drastic.tuto.objects.items.ItemRadar;
import com.drastic.tuto.objects.items.ItemSpecial;
import com.drastic.tuto.objects.items.armor.ArmorMod;
import com.drastic.tuto.objects.items.tools.ItemAxeMod;
import com.drastic.tuto.objects.items.tools.ItemHammer;
import com.drastic.tuto.objects.items.tools.ItemPickaxeMod;
import com.drastic.tuto.objects.items.tools.ItemShovelMod;
import com.drastic.tuto.objects.items.tools.ItemSwordMod;
import com.drastic.tuto.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
    public static List<Item> ITEMS = new ArrayList<Item>();
    
    //ToolMaterials
    public static final ToolMaterial TOOL_TUTO = EnumHelper.addToolMaterial("tuto_tool", 5, 2500, 25.0f, 1.0f, 18);
    public static final ToolMaterial SWORD_TOOL_TUTO = EnumHelper.addToolMaterial("tuto_tool", 5, 2500, 25.0f, 12.0f, 18);
    
    //ArmorMaterials
    public static final ArmorMaterial ARMOR_TUTO = EnumHelper.addArmorMaterial("armor_tuto", Reference.MODID + ":tuto", 75, new int[] {3, 5, 4, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
    
    //Materiaux
    public static final Item TUTO_INGOT = new ItemBase("tuto_ingot");
    
    //Tools
    public static final Item TUTO_PICKAXE = new ItemPickaxeMod("tuto_pickaxe", TOOL_TUTO);
    public static final Item TUTO_SHOVEL = new ItemShovelMod("tuto_shovel", TOOL_TUTO);
    public static final Item TUTO_SWORD = new ItemSwordMod("tuto_sword", SWORD_TOOL_TUTO);
    public static final Item TUTO_AXE = new ItemAxeMod("tuto_axe", TOOL_TUTO);
    
    public static final Item HAMMER = new ItemHammer("hammer", TOOL_TUTO);
   
    //Armors
    public static final Item TUTO_HELMET = new ArmorMod("tuto_helmet", ARMOR_TUTO, 1, EntityEquipmentSlot.HEAD);
    public static final Item TUTO_CHESTPLATE = new ArmorMod("tuto_chestplate", ARMOR_TUTO, 1, EntityEquipmentSlot.CHEST);
    public static final Item TUTO_LEGGINGS = new ArmorMod("tuto_leggings", ARMOR_TUTO, 2, EntityEquipmentSlot.LEGS);
    public static final Item TUTO_BOOTS = new ArmorMod("tuto_boots", ARMOR_TUTO, 1, EntityEquipmentSlot.FEET);
    
    //Specials
    public static final Item TUTO_STICK = new ItemSpecial("tuto_stick");
    public static final Item RADAR = new ItemRadar("radar");
    
    //Foods
    public static final Item COAL_APPLE = new ItemCustomFood("coal_apple", 8, true);
    
}
