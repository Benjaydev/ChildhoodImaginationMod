package net.benjaydev.childhoodimagination.item;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    BLUE_EASTER("blue_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.BLUE_COMPRESSED_EASTER_BLOCK.get())),
    RED_EASTER("red_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.RED_COMPRESSED_EASTER_BLOCK.get())),
    ORANGE_EASTER("orange_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.ORANGE_COMPRESSED_EASTER_BLOCK.get())),
    PURPLE_EASTER("purple_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.PURPLE_COMPRESSED_EASTER_BLOCK.get())),
    BROWN_EASTER("brown_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.BROWN_COMPRESSED_EASTER_BLOCK.get())),
    YELLOW_EASTER("yellow_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.YELLOW_COMPRESSED_EASTER_BLOCK.get())),
    GREEN_EASTER("green_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.GREEN_COMPRESSED_EASTER_BLOCK.get())),
    GRAY_EASTER("gray_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.GRAY_COMPRESSED_EASTER_BLOCK.get())),
    FIRE_EASTER("fire_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.FIRE_COMPRESSED_EASTER_BLOCK.get())),
    VOID_EASTER("void_easter", 26, new int[]{5,7,5,4}, 25,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1f, 0f, () -> Ingredient.of(ModBlocks.VOID_COMPRESSED_EASTER_BLOCK.get()));
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return ChildhoodImaginationMod.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
