package com.electrifiedded.orecreepers.entity;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityDiamondCreeper extends EntityOreCreeper {
    public EntityDiamondCreeper(World world) { super(world); }

    @Override protected double maxHealth() { return 80.0; }

    @Override protected ItemStack drop() { return new ItemStack(Items.DIAMOND); }
}
