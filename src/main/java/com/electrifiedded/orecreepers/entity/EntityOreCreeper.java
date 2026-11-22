package com.electrifiedded.orecreepers.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/** Creeper that drops an ore item. Reimplementation of the 1.7.10 Ore Creepers family. */
public abstract class EntityOreCreeper extends EntityCreeper {
    protected EntityOreCreeper(World world) {
        super(world);
        setHealth((float) maxHealth());
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(maxHealth());
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0);
        getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.2);
    }

    protected abstract double maxHealth();

    protected abstract ItemStack drop();

    @Override
    protected void dropFewItems(boolean recentlyHit, int looting) {
        int n = rand.nextInt(7 + looting);
        for (int i = 0; i < n; i++) entityDropItem(drop(), 0.0F);
    }
}
