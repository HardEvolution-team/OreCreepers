package com.electrifiedded.orecreepers.entity;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityLapisCreeper extends EntityOreCreeper {
    public EntityLapisCreeper(World world) { super(world); }

    @Override protected double maxHealth() { return 50.0; }

    @Override protected ItemStack drop() { return new ItemStack(Items.DYE, 1, 4); }
}
