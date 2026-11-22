package com.electrifiedded.orecreepers.entity;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityIronCreeper extends EntityOreCreeper {
    public EntityIronCreeper(World world) { super(world); }

    @Override protected double maxHealth() { return 60.0; }

    @Override protected ItemStack drop() { return new ItemStack(Items.IRON_INGOT); }
}
