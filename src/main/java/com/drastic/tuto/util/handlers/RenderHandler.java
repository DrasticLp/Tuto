package com.drastic.tuto.util.handlers;

import com.drastic.tuto.client.renderer.entity.RenderScorpion;
import com.drastic.tuto.init.BlockInit;
import com.drastic.tuto.objects.entity.EntityScorpion;
import com.drastic.tuto.util.Reference;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityScorpion.class, new IRenderFactory<EntityScorpion>()
        {

            @Override
            public Render<? super EntityScorpion> createRenderFor(RenderManager manager)
            {
                return new RenderScorpion<EntityScorpion>(manager);
            }});
    }
    
    public static void registerCustomMeshesAndStates()
    {
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(BlockInit.OIL), new ItemMeshDefinition()
        {
            
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack)
            {
                return new ModelResourceLocation("tuto:oil", "fluid");
            }
        });
        
        ModelLoader.setCustomStateMapper(BlockInit.OIL, new StateMapperBase()
        {
            
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation("tuto:oil", "fluid");
            }
        });
    }
}
