package net.benjaydev.childhoodimagination.entity;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.entity.client.RedEasterChickenRenderer;
import net.benjaydev.childhoodimagination.entity.custom.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChildhoodImaginationMod.MODID);

    public static RegistryObject<EntityType<BlueEasterChickenEntity>> BLUE_EASTER_CHICKEN =
            ENTITY_TYPES.register("blue_easter_chicken", () -> EntityType.Builder.of(BlueEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("blue_easter_chicken"));

    public static RegistryObject<EntityType<RedEasterChickenEntity>> RED_EASTER_CHICKEN =
            ENTITY_TYPES.register("red_easter_chicken", () -> EntityType.Builder.of(RedEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("red_easter_chicken"));

    public static RegistryObject<EntityType<OrangeEasterChickenEntity>> ORANGE_EASTER_CHICKEN =
            ENTITY_TYPES.register("orange_easter_chicken", () -> EntityType.Builder.of(OrangeEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("orange_easter_chicken"));

    public static RegistryObject<EntityType<PurpleEasterChickenEntity>> PURPLE_EASTER_CHICKEN =
            ENTITY_TYPES.register("purple_easter_chicken", () -> EntityType.Builder.of(PurpleEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("purple_easter_chicken"));

    public static RegistryObject<EntityType<BrownEasterChickenEntity>> BROWN_EASTER_CHICKEN =
            ENTITY_TYPES.register("brown_easter_chicken", () -> EntityType.Builder.of(BrownEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("brown_easter_chicken"));

    public static RegistryObject<EntityType<YellowEasterChickenEntity>> YELLOW_EASTER_CHICKEN =
            ENTITY_TYPES.register("yellow_easter_chicken", () -> EntityType.Builder.of(YellowEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("yellow_easter_chicken"));

    public static RegistryObject<EntityType<GreenEasterChickenEntity>> GREEN_EASTER_CHICKEN =
            ENTITY_TYPES.register("green_easter_chicken", () -> EntityType.Builder.of(GreenEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("green_easter_chicken"));

    public static RegistryObject<EntityType<GrayEasterChickenEntity>> GRAY_EASTER_CHICKEN =
            ENTITY_TYPES.register("gray_easter_chicken", () -> EntityType.Builder.of(GrayEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("gray_easter_chicken"));

    public static RegistryObject<EntityType<FireEasterChickenEntity>> FIRE_EASTER_CHICKEN =
            ENTITY_TYPES.register("fire_easter_chicken", () -> EntityType.Builder.of(FireEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("fire_easter_chicken"));

    public static RegistryObject<EntityType<VoidEasterChickenEntity>> VOID_EASTER_CHICKEN =
            ENTITY_TYPES.register("void_easter_chicken", () -> EntityType.Builder.of(VoidEasterChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f).build("void_easter_chicken"));


    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
