package com.electrifiedded.orecreepers;

import com.electrifiedded.archaiclib.legacy.registry.LegacyGameRegistry;
import com.electrifiedded.archaiclib.legacy.world.LegacySpawns;
import com.electrifiedded.archaiclib.original.OriginalModAssets;
import com.electrifiedded.orecreepers.entity.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.List;

@Mod(modid = OreCreepersMod.MOD_ID, name = "Ore Creepers", version = "1.0.0", dependencies = "required-after:archaiclib")
public class OreCreepersMod {
    public static final String MOD_ID = "orecreepers";
    public static final String ORIGINAL_NAME = "orecreepers1.7.10_v.1.jar (Ore Creepers by shinymew, 1.7.10)";
    public static final String ORIGINAL_URL = "https://www.curseforge.com/minecraft/mc-mods/ore-creepers";

    @SidedProxy(clientSide = "com.electrifiedded.orecreepers.client.ClientProxy", serverSide = "com.electrifiedded.orecreepers.CommonProxy")
    public static CommonProxy proxy;

    private int nextId = 0;

    public OreCreepersMod() {
        // textures come from the player's own copy of the original jar (archaic_originals/); the lang is ours
        OriginalModAssets.hide(MOD_ID, "lang/en_us.lang");
    }

    private void entity(Class<? extends Entity> cls, String name, int egg1, int egg2) {
        LegacyGameRegistry.registerModEntity(cls, name, nextId++, this, 80, 3, true, egg1, egg2);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        OriginalModAssets.require(MOD_ID, MOD_ID, ORIGINAL_NAME, ORIGINAL_URL, MOD_ID);
        entity(EntityCoalCreeper.class, "coal_creeper", 0, 16777164);
        entity(EntityRedstoneCreeper.class, "redstone_creeper", 13369344, 16777164);
        entity(EntityIronCreeper.class, "iron_creeper", 10053222, 16777164);
        entity(EntityGoldCreeper.class, "gold_creeper", 16776960, 16777164);
        entity(EntityLapisCreeper.class, "lapis_creeper", 13209, 16777164);
        entity(EntityDiamondCreeper.class, "diamond_creeper", 6750207, 16777164);
        entity(EntityEmeraldCreeper.class, "emerald_creeper", 65331, 16777164);
        entity(EntityNetherQuartzCreeper.class, "nether_quartz_creeper", 16777164, 0);

        List<Biome> overworld = LegacySpawns.biomes(LegacySpawns::isOverworld);
        LegacySpawns.add(EntityCoalCreeper.class, 12, 5, 5, EnumCreatureType.MONSTER, overworld);
        LegacySpawns.add(EntityRedstoneCreeper.class, 9, 5, 5, EnumCreatureType.MONSTER, overworld);
        LegacySpawns.add(EntityIronCreeper.class, 7, 5, 5, EnumCreatureType.MONSTER, overworld);
        LegacySpawns.add(EntityGoldCreeper.class, 7, 5, 5, EnumCreatureType.MONSTER, overworld);
        LegacySpawns.add(EntityLapisCreeper.class, 7, 5, 5, EnumCreatureType.MONSTER, overworld);
        LegacySpawns.add(EntityDiamondCreeper.class, 5, 5, 5, EnumCreatureType.MONSTER, overworld);
        LegacySpawns.add(EntityEmeraldCreeper.class, 5, 5, 5, EnumCreatureType.MONSTER, overworld);
        LegacySpawns.addSpawn(EntityNetherQuartzCreeper.class, 50, 50, 50, EnumCreatureType.MONSTER, Biomes.HELL);
        proxy.preInit();
    }
}
