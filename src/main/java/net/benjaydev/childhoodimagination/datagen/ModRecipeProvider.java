package net.benjaydev.childhoodimagination.datagen;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.benjaydev.childhoodimagination.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.Iterator;
import java.util.List;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SCRUE_SMELTABLES = List.of(ModItems.SCRUE_CHUNK.get(),
            ModBlocks.SCRUE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        oreSmelting(recipeOutput, SCRUE_SMELTABLES, RecipeCategory.MISC, ModItems.SCRUE.get(), 1f, 200, "scrue");
        oreBlasting(recipeOutput, SCRUE_SMELTABLES, RecipeCategory.MISC, ModItems.SCRUE.get(), 1f, 100, "scrue");


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCRUE_STICK.get(), 2)
                .requires(ModItems.SCRUE.get())
                .requires(Items.STICK)
                .requires(Items.STICK)
                .unlockedBy(getHasName(ModItems.SCRUE.get()), has(ModItems.SCRUE.get()))
                .save(recipeOutput);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCRUE_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" # ")
                .define('S', ModItems.SCRUE.get())
                .define('#', ModItems.SCRUE_STICK.get())
                .unlockedBy(getHasName(ModItems.SCRUE.get()), has(ModItems.SCRUE.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCRUE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.SCRUE.get())
                .define('#', ModItems.SCRUE_STICK.get())
                .unlockedBy(getHasName(ModItems.SCRUE.get()), has(ModItems.SCRUE.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCRUE_SHOVEL.get())
                .pattern(" S ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.SCRUE.get())
                .define('#', ModItems.SCRUE_STICK.get())
                .unlockedBy(getHasName(ModItems.SCRUE.get()), has(ModItems.SCRUE.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCRUE_AXE.get())
                .pattern("SS ")
                .pattern("S# ")
                .pattern(" # ")
                .define('S', ModItems.SCRUE.get())
                .define('#', ModItems.SCRUE_STICK.get())
                .unlockedBy(getHasName(ModItems.SCRUE.get()), has(ModItems.SCRUE.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCRUE_HOE.get())
                .pattern("SS ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.SCRUE.get())
                .define('#', ModItems.SCRUE_STICK.get())
                .unlockedBy(getHasName(ModItems.SCRUE.get()), has(ModItems.SCRUE.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EASTER_DUNGEON_KEY.get())
                .pattern(" G ")
                .pattern(" # ")
                .pattern("   ")
                .define('G', ModItems.EASTER_GEM.get())
                .define('#', ModItems.SCRUE_STICK.get())
                .unlockedBy(getHasName(ModItems.EASTER_GEM.get()), has(ModItems.EASTER_GEM.get()))
                .save(recipeOutput);


        // Easter
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLUE_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.BLUE_EASTER_EGG.get())
                .requires(ModItems.BLUE_EASTER_EGG.get())
                .requires(ModItems.BLUE_EASTER_EGG.get())
                .requires(ModItems.BLUE_EASTER_EGG.get())
                .requires(ModItems.BLUE_EASTER_FEATHER.get())
                .requires(ModItems.BLUE_EASTER_FEATHER.get())
                .requires(ModItems.BLUE_EASTER_FEATHER.get())
                .requires(ModItems.BLUE_EASTER_FEATHER.get())
                .requires(ModItems.BLUE_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.BLUE_EASTER_EGG.get()), has(ModItems.BLUE_EASTER_EGG.get()))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.RED_EASTER_EGG.get())
                .requires(ModItems.RED_EASTER_EGG.get())
                .requires(ModItems.RED_EASTER_EGG.get())
                .requires(ModItems.RED_EASTER_EGG.get())
                .requires(ModItems.RED_EASTER_FEATHER.get())
                .requires(ModItems.RED_EASTER_FEATHER.get())
                .requires(ModItems.RED_EASTER_FEATHER.get())
                .requires(ModItems.RED_EASTER_FEATHER.get())
                .requires(ModItems.RED_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.RED_EASTER_EGG.get()), has(ModItems.RED_EASTER_EGG.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ORANGE_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.ORANGE_EASTER_EGG.get())
                .requires(ModItems.ORANGE_EASTER_EGG.get())
                .requires(ModItems.ORANGE_EASTER_EGG.get())
                .requires(ModItems.ORANGE_EASTER_EGG.get())
                .requires(ModItems.ORANGE_EASTER_FEATHER.get())
                .requires(ModItems.ORANGE_EASTER_FEATHER.get())
                .requires(ModItems.ORANGE_EASTER_FEATHER.get())
                .requires(ModItems.ORANGE_EASTER_FEATHER.get())
                .requires(ModItems.ORANGE_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.ORANGE_EASTER_EGG.get()), has(ModItems.ORANGE_EASTER_EGG.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.PURPLE_EASTER_EGG.get())
                .requires(ModItems.PURPLE_EASTER_EGG.get())
                .requires(ModItems.PURPLE_EASTER_EGG.get())
                .requires(ModItems.PURPLE_EASTER_EGG.get())
                .requires(ModItems.PURPLE_EASTER_FEATHER.get())
                .requires(ModItems.PURPLE_EASTER_FEATHER.get())
                .requires(ModItems.PURPLE_EASTER_FEATHER.get())
                .requires(ModItems.PURPLE_EASTER_FEATHER.get())
                .requires(ModItems.PURPLE_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.PURPLE_EASTER_EGG.get()), has(ModItems.PURPLE_EASTER_EGG.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BROWN_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.BROWN_EASTER_EGG.get())
                .requires(ModItems.BROWN_EASTER_EGG.get())
                .requires(ModItems.BROWN_EASTER_EGG.get())
                .requires(ModItems.BROWN_EASTER_EGG.get())
                .requires(ModItems.BROWN_EASTER_FEATHER.get())
                .requires(ModItems.BROWN_EASTER_FEATHER.get())
                .requires(ModItems.BROWN_EASTER_FEATHER.get())
                .requires(ModItems.BROWN_EASTER_FEATHER.get())
                .requires(ModItems.BROWN_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.BROWN_EASTER_EGG.get()), has(ModItems.BROWN_EASTER_EGG.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.YELLOW_EASTER_EGG.get())
                .requires(ModItems.YELLOW_EASTER_EGG.get())
                .requires(ModItems.YELLOW_EASTER_EGG.get())
                .requires(ModItems.YELLOW_EASTER_EGG.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.YELLOW_EASTER_EGG.get()), has(ModItems.YELLOW_EASTER_EGG.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GREEN_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.GREEN_EASTER_EGG.get())
                .requires(ModItems.GREEN_EASTER_EGG.get())
                .requires(ModItems.GREEN_EASTER_EGG.get())
                .requires(ModItems.GREEN_EASTER_EGG.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .requires(ModItems.GREEN_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.GREEN_EASTER_EGG.get()), has(ModItems.GREEN_EASTER_EGG.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GRAY_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.GRAY_EASTER_EGG.get())
                .requires(ModItems.GRAY_EASTER_EGG.get())
                .requires(ModItems.GRAY_EASTER_EGG.get())
                .requires(ModItems.GRAY_EASTER_EGG.get())
                .requires(ModItems.GRAY_EASTER_FEATHER.get())
                .requires(ModItems.GRAY_EASTER_FEATHER.get())
                .requires(ModItems.GRAY_EASTER_FEATHER.get())
                .requires(ModItems.GRAY_EASTER_FEATHER.get())
                .requires(ModItems.GRAY_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.GRAY_EASTER_EGG.get()), has(ModItems.GRAY_EASTER_EGG.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.FIRE_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.FIRE_EASTER_EGG.get())
                .requires(ModItems.FIRE_EASTER_EGG.get())
                .requires(ModItems.FIRE_EASTER_EGG.get())
                .requires(ModItems.FIRE_EASTER_EGG.get())
                .requires(ModItems.FIRE_EASTER_FEATHER.get())
                .requires(ModItems.FIRE_EASTER_FEATHER.get())
                .requires(ModItems.FIRE_EASTER_FEATHER.get())
                .requires(ModItems.FIRE_EASTER_FEATHER.get())
                .requires(ModItems.FIRE_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.FIRE_EASTER_EGG.get()), has(ModItems.FIRE_EASTER_EGG.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VOID_COMPRESSED_EASTER_BLOCK.get(), 1)
                .requires(ModItems.VOID_EASTER_EGG.get())
                .requires(ModItems.VOID_EASTER_EGG.get())
                .requires(ModItems.VOID_EASTER_EGG.get())
                .requires(ModItems.VOID_EASTER_EGG.get())
                .requires(ModItems.VOID_EASTER_FEATHER.get())
                .requires(ModItems.VOID_EASTER_FEATHER.get())
                .requires(ModItems.VOID_EASTER_FEATHER.get())
                .requires(ModItems.VOID_EASTER_FEATHER.get())
                .requires(ModItems.VOID_EASTER_FEATHER.get())
                .unlockedBy(getHasName(ModItems.VOID_EASTER_EGG.get()), has(ModItems.VOID_EASTER_EGG.get()))
                .save(recipeOutput);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.EASTER_PORTAL.get(), 1)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .requires(ModTags.Items.COMPRESSED_EASTER_BLOCK)
                .unlockedBy(getHasName(ModBlocks.BLUE_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.RED_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.ORANGE_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.PURPLE_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.BROWN_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.YELLOW_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.GREEN_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.GRAY_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.FIRE_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .unlockedBy(getHasName(ModBlocks.VOID_COMPRESSED_EASTER_BLOCK.get()), has(ModTags.Items.COMPRESSED_EASTER_BLOCK))
                .save(recipeOutput);

        MakeEasterArmorSet(recipeOutput, ModBlocks.BLUE_COMPRESSED_EASTER_BLOCK,
                ModItems.BLUE_EASTER_BOOTS, ModItems.BLUE_EASTER_LEGGINGS,
                ModItems.BLUE_EASTER_CHESTPLATE, ModItems.BLUE_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.RED_COMPRESSED_EASTER_BLOCK,
                ModItems.RED_EASTER_BOOTS, ModItems.RED_EASTER_LEGGINGS,
                ModItems.RED_EASTER_CHESTPLATE, ModItems.RED_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.ORANGE_COMPRESSED_EASTER_BLOCK,
                ModItems.ORANGE_EASTER_BOOTS, ModItems.ORANGE_EASTER_LEGGINGS,
                ModItems.ORANGE_EASTER_CHESTPLATE, ModItems.ORANGE_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.PURPLE_COMPRESSED_EASTER_BLOCK,
                ModItems.PURPLE_EASTER_BOOTS, ModItems.PURPLE_EASTER_LEGGINGS,
                ModItems.PURPLE_EASTER_CHESTPLATE, ModItems.PURPLE_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.BROWN_COMPRESSED_EASTER_BLOCK,
                ModItems.BROWN_EASTER_BOOTS, ModItems.BROWN_EASTER_LEGGINGS,
                ModItems.BROWN_EASTER_CHESTPLATE, ModItems.BROWN_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.YELLOW_COMPRESSED_EASTER_BLOCK,
                ModItems.YELLOW_EASTER_BOOTS, ModItems.YELLOW_EASTER_LEGGINGS,
                ModItems.YELLOW_EASTER_CHESTPLATE, ModItems.YELLOW_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.GREEN_COMPRESSED_EASTER_BLOCK,
                ModItems.GREEN_EASTER_BOOTS, ModItems.GREEN_EASTER_LEGGINGS,
                ModItems.GREEN_EASTER_CHESTPLATE, ModItems.GREEN_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.GRAY_COMPRESSED_EASTER_BLOCK,
                ModItems.GRAY_EASTER_BOOTS, ModItems.GRAY_EASTER_LEGGINGS,
                ModItems.GRAY_EASTER_CHESTPLATE, ModItems.GRAY_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.FIRE_COMPRESSED_EASTER_BLOCK,
                ModItems.FIRE_EASTER_BOOTS, ModItems.FIRE_EASTER_LEGGINGS,
                ModItems.FIRE_EASTER_CHESTPLATE, ModItems.FIRE_EASTER_HELMET);

        MakeEasterArmorSet(recipeOutput, ModBlocks.VOID_COMPRESSED_EASTER_BLOCK,
                ModItems.VOID_EASTER_BOOTS, ModItems.VOID_EASTER_LEGGINGS,
                ModItems.VOID_EASTER_CHESTPLATE, ModItems.VOID_EASTER_HELMET);





    }

    public void MakeEasterArmorSet(RecipeOutput recipeOutput, RegistryObject<Block> ingredient,
                                   RegistryObject<Item> boots, RegistryObject<Item> leggings,
                                   RegistryObject<Item> chestplate, RegistryObject<Item> helmet ){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, boots.get())
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .define('#', ingredient.get())
                .unlockedBy(getHasName(ingredient.get()), has(ingredient.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, leggings.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', ingredient.get())
                .unlockedBy(getHasName(ingredient.get()), has(ingredient.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, chestplate.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', ingredient.get())
                .unlockedBy(getHasName(ingredient.get()), has(ingredient.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, helmet.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', ingredient.get())
                .unlockedBy(getHasName(ingredient.get()), has(ingredient.get()))
                .save(recipeOutput);
    }

    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput,  ChildhoodImaginationMod.MODID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }

    }
}
