package net.benjaydev.childhoodimagination.entity.custom;

import net.benjaydev.childhoodimagination.entity.ModEntities;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class BlueEasterChickenEntity extends EasterChickenEntity{
    public BlueEasterChickenEntity(EntityType<? extends EasterChickenEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public RegistryObject<Item> GetEggDrop() {
        return ModItems.BLUE_EASTER_EGG;
    }

    @Nullable
    @Override
    public EasterChickenEntity getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.BLUE_EASTER_CHICKEN.get().create(pLevel);
    }
}
