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
     public static Block BlockCopper;
     public static Block OreCopper;
    
    int oreAluminumID = IDConfigs.IDALUMINUMORE;
    int blockAluminumID = IDConfigs.IDALUMINUMBLOCK;
    int oreCopperID = IDConfigs.IDCOPPERORE;
    int blockCopperID = IDConfigs.IDCOPPERBLOCK;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    @Init
    public void Init(FMLInitializationEvent event) {
        
        OreAluminum = new OreAluminum(oreAluminumID, Material.iron).setUnlocalizedName("aluminumore").setResistance(15F).setHardness(8F).setStepSound(Block.soundStoneFootstep);
        BlockAluminum = new BlockAluminum(blockAluminumID, Material.iron).setUnlocalizedName("aluminumblock").setResistance(20F).setHardness(15F).setStepSound(Block.soundMetalFootstep);
        OreCopper = new OreCopper(oreCopperID, Material.iron).setUnlocalizedName("copperore").setResistance(15F).setHardness(8F).setStepSound(Block.soundStoneFootstep);
        BlockCopper = new BlockCopper(blockCopperID, Material.iron).setUnlocalizedName("copperblock").setResistance(20F).setHardness(15F).setStepSound(Block.soundMetalFootstep);
        
        gameRegisters();
        languageRegisters();
        
        GameRegistry.registerWorldGenerator(new WorldGen());
    }
    
   
    
    
    private static void gameRegisters(){
        GameRegistry.registerBlock(OreAluminum, "orealuminum");
        GameRegistry.registerBlock(BlockAluminum, "blockaluminum");
        GameRegistry.registerBlock(BlockCopper, "blockcopper");
        GameRegistry.registerBlock(OreCopper,"orecopper");
    }
    
    private static void languageRegisters(){
        LanguageRegistry.addName(OreAluminum, Lang.ALUMINUMORE);
        LanguageRegistry.addName(BlockAluminum, Lang.ALUMINUMBLOCK);
        LanguageRegistry.addName(BlockCopper, Lang.COPPERBLOCK);
        LanguageRegistry.addName(OreCopper, Lang.COPPERORE);
    }
    @PostInit
    public void PostInit(FMLPostInitializationEvent event) {
        
    }

}
