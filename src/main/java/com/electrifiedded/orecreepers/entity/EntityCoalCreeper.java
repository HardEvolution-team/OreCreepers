package com.electrifiedded.orecreepers.entity;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityCoalCreeper extends EntityOreCreeper {
    public EntityCoalCreeper(World world) { super(world); }

    @Override protected double maxHealth() { return 40.0; }

    @Override protected ItemStack drop() { return new ItemStack(Items.COAL); }
}
