package com.drastic.tuto.client.models.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * ModelSpider - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
@SideOnly(Side.CLIENT)
public class ModelScorpion extends ModelBase
{
    /** The spider's head box */
    public ModelRenderer spiderHead;
    /** The spider's neck box */
    public ModelRenderer spiderNeck;
    /** The spider's body box */
    public ModelRenderer spiderBody;
    /** Spider's first leg */
    public ModelRenderer spiderLeg1;
    /** Spider's second leg */
    public ModelRenderer spiderLeg2;
    /** Spider's third leg */
    public ModelRenderer spiderLeg3;
    /** Spider's fourth leg */
    public ModelRenderer spiderLeg4;
    /** Spider's fifth leg */
    public ModelRenderer spiderLeg5;
    /** Spider's sixth leg */
    public ModelRenderer spiderLeg6;
    /** Spider's seventh leg */
    public ModelRenderer spiderLeg7;
    /** Spider's eight leg */
    public ModelRenderer spiderLeg8;
    public ModelRenderer queue4;
    public ModelRenderer queue3;
    public ModelRenderer queue2;
    public ModelRenderer queue1;
    public ModelRenderer queue5;
    public ModelRenderer queue7;
    public ModelRenderer queue6;
    public ModelRenderer queue8;

    public ModelScorpion()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.queue1 = new ModelRenderer(this, 6, 16);
        this.queue1.setRotationPoint(-2.0F, 13.999999999999998F, 13.6F);
        this.queue1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 9, 0.0F);
        this.setRotateAngle(queue1, 0.629714794119554F, 0.0F, 0.0F);
        this.queue2 = new ModelRenderer(this, 6, 16);
        this.queue2.setRotationPoint(-2.0F, 9.999999999999998F, 19.5F);
        this.queue2.addBox(0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(queue2, 1.3004448256609749F, 0.0F, 0.0F);
        this.queue6 = new ModelRenderer(this, 18, 27);
        this.queue6.setRotationPoint(-4.0F, -5.099999999999997F, 10.2F);
        this.queue6.addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        this.queue8 = new ModelRenderer(this, 18, 27);
        this.queue8.setRotationPoint(-2.0F, -4.3F, 5.2F);
        this.queue8.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.queue3 = new ModelRenderer(this, 6, 16);
        this.queue3.setRotationPoint(-2.0F, -0.6000000000000001F, 22.3F);
        this.queue3.addBox(0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(queue3, -1.3004448256609749F, 0.0F, 0.0F);
        this.queue4 = new ModelRenderer(this, 6, 18);
        this.queue4.setRotationPoint(-2.0F, -5.4F, 14.6F);
        this.queue4.addBox(0.0F, 0.0F, 0.0F, 4, 3, 9, 0.0F);
        this.setRotateAngle(queue4, -0.5202826500195096F, 0.0F, 0.0F);
        this.queue5 = new ModelRenderer(this, 18, 27);
        this.queue5.setRotationPoint(-4.0F, -5.8F, 12.2F);
        this.queue5.addBox(0.0F, 0.0F, 0.0F, 8, 3, 2, 0.0F);
        this.queue7 = new ModelRenderer(this, 18, 27);
        this.queue7.setRotationPoint(-3.0F, -5.099999999999997F, 8.2F);
        this.queue7.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);

        
        float f = 0.0F;
        int i = 15;
        this.spiderHead = new ModelRenderer(this, 32, 4);
        this.spiderHead.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
        this.spiderHead.setRotationPoint(0.0F, 15.0F, -3.0F);
        this.spiderNeck = new ModelRenderer(this, 0, 0);
        this.spiderNeck.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.spiderNeck.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.spiderBody = new ModelRenderer(this, 0, 12);
        this.spiderBody.addBox(-5.0F, -4.0F, -6.0F, 10, 8, 12, 0.0F);
        this.spiderBody.setRotationPoint(0.0F, 15.0F, 9.0F);
        this.spiderLeg1 = new ModelRenderer(this, 18, 0);
        this.spiderLeg1.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.spiderLeg1.setRotationPoint(-4.0F, 15.0F, 2.0F);
        this.spiderLeg2 = new ModelRenderer(this, 18, 0);
        this.spiderLeg2.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.spiderLeg2.setRotationPoint(4.0F, 15.0F, 2.0F);
        this.spiderLeg3 = new ModelRenderer(this, 18, 0);
        this.spiderLeg3.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.spiderLeg3.setRotationPoint(-4.0F, 15.0F, 1.0F);
        this.spiderLeg4 = new ModelRenderer(this, 18, 0);
        this.spiderLeg4.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.spiderLeg4.setRotationPoint(4.0F, 15.0F, 1.0F);
        this.spiderLeg5 = new ModelRenderer(this, 18, 0);
        this.spiderLeg5.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.spiderLeg5.setRotationPoint(-4.0F, 15.0F, 0.0F);
        this.spiderLeg6 = new ModelRenderer(this, 18, 0);
        this.spiderLeg6.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.spiderLeg6.setRotationPoint(4.0F, 15.0F, 0.0F);
        this.spiderLeg7 = new ModelRenderer(this, 18, 0);
        this.spiderLeg7.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.spiderLeg7.setRotationPoint(-4.0F, 15.0F, -1.0F);
        this.spiderLeg8 = new ModelRenderer(this, 18, 0);
        this.spiderLeg8.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.spiderLeg8.setRotationPoint(4.0F, 15.0F, -1.0F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {        
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.spiderHead.render(scale);
        this.spiderNeck.render(scale);
        this.spiderBody.render(scale);
        this.spiderLeg1.render(scale);
        this.spiderLeg2.render(scale);
        this.spiderLeg3.render(scale);
        this.spiderLeg4.render(scale);
        this.spiderLeg5.render(scale);
        this.spiderLeg6.render(scale);
        this.spiderLeg7.render(scale);
        this.spiderLeg8.render(scale);
        
        this.queue1.render(scale);
        this.queue2.render(scale);
        this.queue6.render(scale);
        this.queue8.render(scale);
        this.queue3.render(scale);
        this.queue4.render(scale);
        this.queue5.render(scale);
        this.queue7.render(scale);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.spiderHead.rotateAngleY = netHeadYaw * 0.017453292F;
        this.spiderHead.rotateAngleX = headPitch * 0.017453292F;
        float f = ((float)Math.PI / 4F);
        this.spiderLeg1.rotateAngleZ = -((float)Math.PI / 4F);
        this.spiderLeg2.rotateAngleZ = ((float)Math.PI / 4F);
        this.spiderLeg3.rotateAngleZ = -0.58119464F;
        this.spiderLeg4.rotateAngleZ = 0.58119464F;
        this.spiderLeg5.rotateAngleZ = -0.58119464F;
        this.spiderLeg6.rotateAngleZ = 0.58119464F;
        this.spiderLeg7.rotateAngleZ = -((float)Math.PI / 4F);
        this.spiderLeg8.rotateAngleZ = ((float)Math.PI / 4F);
        float f1 = -0.0F;
        float f2 = 0.3926991F;
        this.spiderLeg1.rotateAngleY = ((float)Math.PI / 4F);
        this.spiderLeg2.rotateAngleY = -((float)Math.PI / 4F);
        this.spiderLeg3.rotateAngleY = 0.3926991F;
        this.spiderLeg4.rotateAngleY = -0.3926991F;
        this.spiderLeg5.rotateAngleY = -0.3926991F;
        this.spiderLeg6.rotateAngleY = 0.3926991F;
        this.spiderLeg7.rotateAngleY = -((float)Math.PI / 4F);
        this.spiderLeg8.rotateAngleY = ((float)Math.PI / 4F);
        float f3 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbSwingAmount;
        float f4 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * limbSwingAmount;
        float f5 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * limbSwingAmount;
        float f6 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
        float f7 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + 0.0F) * 0.4F) * limbSwingAmount;
        float f8 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + (float)Math.PI) * 0.4F) * limbSwingAmount;
        float f9 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * limbSwingAmount;
        float f10 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
        this.spiderLeg1.rotateAngleY += f3;
        this.spiderLeg2.rotateAngleY += -f3;
        this.spiderLeg3.rotateAngleY += f4;
        this.spiderLeg4.rotateAngleY += -f4;
        this.spiderLeg5.rotateAngleY += f5;
        this.spiderLeg6.rotateAngleY += -f5;
        this.spiderLeg7.rotateAngleY += f6;
        this.spiderLeg8.rotateAngleY += -f6;
        this.spiderLeg1.rotateAngleZ += f7;
        this.spiderLeg2.rotateAngleZ += -f7;
        this.spiderLeg3.rotateAngleZ += f8;
        this.spiderLeg4.rotateAngleZ += -f8;
        this.spiderLeg5.rotateAngleZ += f9;
        this.spiderLeg6.rotateAngleZ += -f9;
        this.spiderLeg7.rotateAngleZ += f10;
        this.spiderLeg8.rotateAngleZ += -f10;
    }
}
