package com.drastic.tuto.util.handlers;

import com.drastic.tuto.init.BlockInit;
import com.drastic.tuto.init.ItemInit;
import com.drastic.tuto.util.interfaces.IHasModel;
import com.drastic.tuto.world.generation.WorldGenCustomOres;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler
{
    
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }
    
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }
    
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }
        
        for(Block block : BlockInit.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();         
            }
        }
    }
    
    public static void preInitRegistries()
    {
        GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
    }
    
    public static void initRegistries()
    {
        RecipesHandler.registerRecipes();        
    }
    
}
