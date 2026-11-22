package com.electrifiedded.orecreepers.client;

import static com.electrifiedded.archaiclib.legacy.client.LegacyRenderLiving.register;

import com.electrifiedded.orecreepers.CommonProxy;
import com.electrifiedded.orecreepers.entity.*;

public class ClientProxy extends CommonProxy {
    private static final String M = "orecreepers:textures/mobs/";

    @Override
    public void preInit() {
        register(EntityCoalCreeper.class, OreCreeperModel::new, 0.8F, M + "coalcreeper.png");
        register(EntityRedstoneCreeper.class, OreCreeperModel::new, 0.8F, M + "redstonecreeper.png");
        register(EntityIronCreeper.class, OreCreeperModel::new, 0.8F, M + "ironcreeper.png");
        register(EntityGoldCreeper.class, OreCreeperModel::new, 0.8F, M + "goldcreeper.png");
        register(EntityLapisCreeper.class, OreCreeperModel::new, 0.8F, M + "lapiscreeper.png");
        register(EntityDiamondCreeper.class, OreCreeperModel::new, 0.8F, M + "diamondcreeper.png");
        register(EntityEmeraldCreeper.class, OreCreeperModel::new, 0.8F, M + "emeraldcreeper.png");
        register(EntityNetherQuartzCreeper.class, OreCreeperModel::new, 0.8F, M + "quartzcreeper.png");
    }
}
