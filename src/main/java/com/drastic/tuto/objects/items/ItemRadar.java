package com.drastic.tuto.objects.items;

import java.util.Random;

import com.drastic.tuto.Main;
import com.drastic.tuto.guis.GuiRadar;
import com.drastic.tuto.init.ItemInit;
import com.drastic.tuto.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRadar extends Item implements IHasModel
{
    private static EntityPlayer player;

    private static int dura = 90 * 20 * 60;

    public static int percents = 0;

    public ItemRadar(String name)
    {
        this.addPropertyOverride(new ResourceLocation("percent"), new IItemPropertyGetter()
        {

            @SideOnly(Side.CLIENT)
            @Override
            public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn)
            {
                return percents;
            }
        });

        this.setMaxDamage(this.dura);
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
        setCreativeTab(Main.TUTO_TAB);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
        this.player = (EntityPlayer)entityIn;

        if(this.player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemRadar)
        {
            if(this.dura >= 0)
            {
                this.dura--;  
                stack.damageItem(1, player);
                if(GuiRadar.amountTiles <= 25)
                {
                    this.percents = GuiRadar.amountTiles;
                }
                else if(GuiRadar.amountTiles >= 26)
                {
                    this.percents = 26;
                }
            }
        }

        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
    }

}
