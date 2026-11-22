package com.electrifiedded.orecreepers.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/** The 1.7.10 Ore Creeper model: creeper shape with a 4px (not 6px) body offset. */
public class OreCreeperModel extends ModelBase {
    private final ModelRenderer head, body, leg1, leg2, leg3, leg4;

    public OreCreeperModel() {
        int o = 4;
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8, 0F);
        head.setRotationPoint(0F, o, 0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4, 0F);
        body.setRotationPoint(0F, o, 0F);
        leg1 = leg(-2F, 12 + o, 4F);
        leg2 = leg(2F, 12 + o, 4F);
        leg3 = leg(-2F, 12 + o, -4F);
        leg4 = leg(2F, 12 + o, -4F);
    }

    private ModelRenderer leg(float x, float y, float z) {
        ModelRenderer r = new ModelRenderer(this, 0, 16);
        r.addBox(-2F, 0F, -2F, 4, 6, 4, 0F);
        r.setRotationPoint(x, y, z);
        return r;
    }

    @Override
    public void render(Entity e, float f1, float f2, float f3, float f4, float f5, float s) {
        setRotationAngles(f1, f2, f3, f4, f5, s, e);
        head.render(s); body.render(s);
        leg1.render(s); leg2.render(s); leg3.render(s); leg4.render(s);
    }

    @Override
    public void setRotationAngles(float f1, float f2, float f3, float yaw, float pitch, float s, Entity e) {
        head.rotateAngleY = yaw / (180F / (float) Math.PI);
        head.rotateAngleX = pitch / (180F / (float) Math.PI);
        leg1.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 1.4F * f2;
        leg2.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float) Math.PI) * 1.4F * f2;
        leg3.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float) Math.PI) * 1.4F * f2;
        leg4.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 1.4F * f2;
    }
}
