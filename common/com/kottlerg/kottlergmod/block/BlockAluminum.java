package com.kottlerg.kottlergmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAluminum extends Block {

    public BlockAluminum(int id, Material mat) {
        super(id, mat);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public void registerIcon(IconRegister reg){
        this.blockIcon = reg.registerIcon("KottlergMod:AluminumBlock");
    }

}
