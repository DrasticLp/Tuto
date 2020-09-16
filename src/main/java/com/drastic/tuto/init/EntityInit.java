package com.drastic.tuto.init;

import com.drastic.tuto.Main;
import com.drastic.tuto.objects.entity.EntityScorpion;
import com.drastic.tuto.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
    public static void registerEntities()
    {
       registerEntity("scorpion", EntityScorpion.class, 111, 50, 16765255, 1672485); 
    }
    
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}
