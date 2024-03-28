package net.benjaydev.childhoodimagination.entity;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.entity.custom.EasterChickenEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChildhoodImaginationMod.MODID);

    public static RegistryObject<EntityType<EasterChickenEntity>> EASTER_CHICKEN =
            ENTITY_TYPES.register("blue_easter_chicken", () -> EntityType.Builder.of(EasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("blue_easter_chicken"));

    /*public static RegistryObject<EntityType<BlueEasterChickenEntity>> BLUE_EASTER_CHICKEN =
            ENTITY_TYPES.register("blue_easter_chicken", () -> EntityType.Builder.of(BlueEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("blue_easter_chicken"));*/

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
