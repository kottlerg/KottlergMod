package com.kottlerg.kottlergmod;

import com.kottlerg.kottlergmod.lib.IDConfigs;
import com.kottlerg.kottlergmod.lib.Lang;
import com.kottlerg.kottlergmod.lib.Referance;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.kottlerg.kottlergmod.WorldGen;
import com.kottlerg.kottlergmod.block.*;

@Mod(modid = Referance.MOD_ID, name = Referance.MOD_NAME, version = Referance.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class KottlergMod {
    
     public static Block OreAluminum;
     public static Block BlockAluminum;
    
    int oreAluminumID = IDConfigs.IDALUMINUMORE;
    int blockAluminumID = IDConfigs.IDALUMINUMBLOCK;
    
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    @Init
    public void Init(FMLInitializationEvent event) {
        
        OreAluminum = new OreAluminum(oreAluminumID, Material.iron).setUnlocalizedName("aluminumore").setResistance(5F).setHardness(2.5F).setStepSound(Block.soundStoneFootstep);
        BlockAluminum = new BlockAluminum(blockAluminumID, Material.iron).setUnlocalizedName("aluminumblock").setResistance(5F).setHardness(3F).setStepSound(Block.soundMetalFootstep);
        
        gameRegisters();
        languageRegisters();
        
        GameRegistry.registerWorldGenerator(new WorldGen());
    }
    
   
    
    
    private static void gameRegisters(){
        GameRegistry.registerBlock(OreAluminum, "orealuminum");
        GameRegistry.registerBlock(BlockAluminum, "blockaluminum");
    }
    
    private static void languageRegisters(){
        LanguageRegistry.addName(OreAluminum, Lang.ALUMINUMORE);
        LanguageRegistry.addName(BlockAluminum, Lang.ALUMINUMBLOCK);
    }
    @PostInit
    public void PostInit(FMLPostInitializationEvent event) {
        
    }

}
