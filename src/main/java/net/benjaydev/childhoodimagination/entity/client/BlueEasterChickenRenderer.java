package net.benjaydev.childhoodimagination.entity.client;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.entity.custom.EasterChickenEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class BlueEasterChickenRenderer extends EasterChickenRenderer{
    public BlueEasterChickenRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(EasterChickenEntity easterChickenEntity) {
        return new ResourceLocation(ChildhoodImaginationMod.MODID, "textures/entity/blue_easter_chicken.png");
    }
}
