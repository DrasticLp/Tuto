package com.drastic.tuto.proxy;

import com.drastic.tuto.guis.GuiRadar;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        MinecraftForge.EVENT_BUS.register(new GuiRadar());

    }
    
    @Override
    public void registerVariantRenderer(Item item, int meta, String filename, String id)
    {
        // TODO Auto-generated method stub
        super.registerVariantRenderer(item, meta, filename, id);
    }
    
    @Override
    public void registerEntityRenderers()
    {
        // TODO Auto-generated method stub
        super.registerEntityRenderers();
    }
    
    @Override
    public void preInit()
    {
        // TODO Auto-generated method stub
        super.preInit();
    }
    
    @Override
    public void registerGuis()
    {
    }
}
