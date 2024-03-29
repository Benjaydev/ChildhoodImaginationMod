package net.benjaydev.childhoodimagination.entity.custom;

import net.benjaydev.childhoodimagination.entity.ModEntities;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.nbt.Tag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;

public class FireEasterChickenEntity extends EasterChickenEntity{
    public FireEasterChickenEntity(EntityType<? extends EasterChickenEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public RegistryObject<Item> GetEggDrop() {
        return ModItems.FIRE_EASTER_EGG;
    }

    @Nullable
    @Override
    public EasterChickenEntity getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.FIRE_EASTER_CHICKEN.get().create(pLevel);
    }

    @Override
    public boolean hurt(DamageSource pSource, float pAmount) {
        if(pSource.is(DamageTypes.IN_FIRE) || pSource.is(DamageTypes.ON_FIRE) || pSource.is(DamageTypes.LAVA)){
            return false;
        }
        return super.hurt(pSource, pAmount);
    }
}
