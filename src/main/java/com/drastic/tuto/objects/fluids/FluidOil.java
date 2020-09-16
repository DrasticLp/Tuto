package com.drastic.tuto.objects.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidOil extends Fluid
{

    public FluidOil(String fluidName, ResourceLocation still, ResourceLocation flowing)
    {
        super(fluidName, still, flowing);
        this.setUnlocalizedName(fluidName);
    }

}
