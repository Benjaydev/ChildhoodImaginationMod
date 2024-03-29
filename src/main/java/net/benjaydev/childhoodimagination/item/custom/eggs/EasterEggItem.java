package net.benjaydev.childhoodimagination.item.custom.eggs;

import net.benjaydev.childhoodimagination.entity.ModEntities;
import net.benjaydev.childhoodimagination.entity.custom.BlueEasterChickenEntity;
import net.benjaydev.childhoodimagination.entity.custom.EasterChickenEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;

import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

public class EasterEggItem extends Item {

    private String CHICKEN_TYPE = "blue";

    public EasterEggItem(Item.Properties pProperties, String chicken_type) {
        super(pProperties);
        CHICKEN_TYPE = chicken_type;
    }

    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack heldItem = pPlayer.getItemInHand(pHand);
        pLevel.playSound((Player)null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.EGG_THROW, SoundSource.PLAYERS, 0.5F, 0.4F / (pLevel.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!pLevel.isClientSide) {
            ThrownEasterEgg projectile = new ThrownEasterEgg(pLevel, pPlayer);
            projectile.SetChickenType(CHICKEN_TYPE);
            projectile.setItem(heldItem);
            projectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.5F, 1.0F);
            pLevel.addFreshEntity(projectile);
        }

        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        if (!pPlayer.getAbilities().instabuild) {
            heldItem.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(heldItem, pLevel.isClientSide());
    }
}
