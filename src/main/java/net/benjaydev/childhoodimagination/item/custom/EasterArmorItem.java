package net.benjaydev.childhoodimagination.item.custom;

import com.google.common.collect.ImmutableMap;
import net.benjaydev.childhoodimagination.item.ModArmorMaterials;
import net.benjaydev.childhoodimagination.util.ModTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.EnderEyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.Map;

public class EasterArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<MobEffectInstance>>())
                    .put(ModArmorMaterials.VOID_EASTER,
                            List.of(new MobEffectInstance(MobEffects.DIG_SPEED, 30, 1,
                                    false,false, true),
                                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 30, 2,
                                    false,false, true)))
                    .put(ModArmorMaterials.FIRE_EASTER, List.of(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 30, 5,
                            false,false, true))).build();


    public EasterArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
            else{
                player.getAbilities().mayfly = false;
                player.getAbilities().flying = false;
                player.onUpdateAbilities();
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, List<MobEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<MobEffectInstance> mapStatusEffect = entry.getValue();

            for(MobEffectInstance effect : mapStatusEffect){
                // Full set of same armor has special effects
                if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                    addStatusEffectForMaterial(player, effect);
                }
            }
        }

        if(hasCorrectArmorOn(ModArmorMaterials.VOID_EASTER, player)){
            player.getAbilities().mayfly = true;
            player.onUpdateAbilities();
        }

        addStatusEffectForMaterial(player, new MobEffectInstance(MobEffects.SLOW_FALLING, 2, 1,
                false,false, true));
        addStatusEffectForMaterial(player, new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 1,
                false,false, true));
    }

    private void addStatusEffectForMaterial(Player player, MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(!hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
