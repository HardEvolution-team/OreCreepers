package com.electrifiedded.orecreepers.entity;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityEmeraldCreeper extends EntityOreCreeper {
    public EntityEmeraldCreeper(World world) { super(world); }

    @Override protected double maxHealth() { return 80.0; }

    @Override protected ItemStack drop() { return new ItemStack(Items.EMERALD); }
}
