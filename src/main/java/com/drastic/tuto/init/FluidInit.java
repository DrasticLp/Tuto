package com.drastic.tuto.init;

import com.drastic.tuto.objects.fluids.FluidOil;
import com.drastic.tuto.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidInit
{
    public static final Fluid OIL = new FluidOil("oil", new ResourceLocation(Reference.MODID + ":blocks/oil_still"), new ResourceLocation(Reference.MODID + ":blocks/oil_flow"));

    public static void registerFluids()
    {
        registerFluid(OIL);
    }
    
    private static void registerFluid(Fluid fluid)
    {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }
}
