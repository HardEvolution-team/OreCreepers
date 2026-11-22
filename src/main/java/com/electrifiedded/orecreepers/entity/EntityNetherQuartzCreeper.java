package com.electrifiedded.orecreepers.entity;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityNetherQuartzCreeper extends EntityOreCreeper {
    public EntityNetherQuartzCreeper(World world) { super(world); }

    @Override protected double maxHealth() { return 25.0; }

    @Override protected ItemStack drop() { return new ItemStack(Items.QUARTZ); }
}
