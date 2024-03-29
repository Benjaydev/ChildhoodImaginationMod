package net.benjaydev.childhoodimagination.event;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.entity.ModEntities;
import net.benjaydev.childhoodimagination.entity.custom.EasterChickenEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ChildhoodImaginationMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.BLUE_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.RED_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.ORANGE_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.PURPLE_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.BROWN_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.YELLOW_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.GREEN_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.GRAY_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.FIRE_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
        event.put(ModEntities.VOID_EASTER_CHICKEN.get(), EasterChickenEntity.createAttributes().build());
    }
}
