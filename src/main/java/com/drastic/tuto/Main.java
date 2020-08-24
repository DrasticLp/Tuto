package com.drastic.tuto;

import com.drastic.tuto.proxy.CommonProxy;
import com.drastic.tuto.tabs.TutoTab;
import com.drastic.tuto.tabs.TutoTab2;
import com.drastic.tuto.util.Reference;
import com.drastic.tuto.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
    
    @Instance
    public static Main instance;
    
    public static final CreativeTabs TUTO_TAB = new TutoTab("tuto");
    public static final CreativeTabs TUTO_TAB2 = new TutoTab2("tuto2");
    
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;
    
    public static org.apache.logging.log4j.Logger logger;
    
    @EventHandler
    public static void preInit(FMLPreInitializationEvent e)
    {
        logger = e.getModLog();
        
        proxy.preInit();
        //proxy.registerGuis();
        
        RegistryHandler.preInitRegistries();
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent e)
    {
        RegistryHandler.initRegistries();
    }
    
    @EventHandler
    public static void postInit(FMLPostInitializationEvent e)
    {
        
    }
}