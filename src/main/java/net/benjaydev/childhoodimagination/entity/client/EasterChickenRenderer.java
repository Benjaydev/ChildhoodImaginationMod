package net.benjaydev.childhoodimagination.entity.client;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.entity.custom.EasterChickenEntity;
import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.Chicken;

public class EasterChickenRenderer extends MobRenderer<EasterChickenEntity, ChickenModel<EasterChickenEntity>> {

    private static final ResourceLocation CHICKEN_LOCATION = new ResourceLocation(ChildhoodImaginationMod.MODID, "textures/entity/blue_easter_chicken.png");

    public EasterChickenRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ChickenModel(pContext.bakeLayer(ModelLayers.CHICKEN)), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(EasterChickenEntity easterChickenEntity) {
        return CHICKEN_LOCATION;
    }

    protected float getBob(Chicken pLivingBase, float pPartialTicks) {
        float $$2 = Mth.lerp(pPartialTicks, pLivingBase.oFlap, pLivingBase.flap);
        float $$3 = Mth.lerp(pPartialTicks, pLivingBase.oFlapSpeed, pLivingBase.flapSpeed);
        return (Mth.sin($$2) + 1.0F) * $$3;
    }


}
