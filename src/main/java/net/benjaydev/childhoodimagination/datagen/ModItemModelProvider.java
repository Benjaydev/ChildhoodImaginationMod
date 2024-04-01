package net.benjaydev.childhoodimagination.datagen;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChildhoodImaginationMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SCRUE);
        simpleItem(ModItems.SCRUE_CHUNK);
        simpleItem(ModItems.SCRUE_STICK);
        handHeldItem(ModItems.SCRUE_AXE);
        handHeldItem(ModItems.SCRUE_PICKAXE);
        handHeldItem(ModItems.SCRUE_SHOVEL);
        handHeldItem(ModItems.SCRUE_SWORD);
        handHeldItem(ModItems.SCRUE_HOE);


        simpleItem(ModItems.EASTER_DUNGEON_KEY);
        simpleItem(ModItems.EASTER_GEM);

        simpleItem(ModItems.BLUE_EASTER_EGG);
        simpleItem(ModItems.BROWN_EASTER_EGG);
        simpleItem(ModItems.GREEN_EASTER_EGG);
        simpleItem(ModItems.GRAY_EASTER_EGG);
        simpleItem(ModItems.ORANGE_EASTER_EGG);
        simpleItem(ModItems.RED_EASTER_EGG);
        simpleItem(ModItems.PURPLE_EASTER_EGG);
        simpleItem(ModItems.YELLOW_EASTER_EGG);
        simpleItem(ModItems.VOID_EASTER_EGG);
        simpleItem(ModItems.FIRE_EASTER_EGG);

        simpleItem(ModItems.BLUE_EASTER_FEATHER);
        simpleItem(ModItems.BROWN_EASTER_FEATHER);
        simpleItem(ModItems.GREEN_EASTER_FEATHER);
        simpleItem(ModItems.GRAY_EASTER_FEATHER);
        simpleItem(ModItems.ORANGE_EASTER_FEATHER);
        simpleItem(ModItems.RED_EASTER_FEATHER);
        simpleItem(ModItems.PURPLE_EASTER_FEATHER);
        simpleItem(ModItems.YELLOW_EASTER_FEATHER);
        simpleItem(ModItems.VOID_EASTER_FEATHER);
        simpleItem(ModItems.FIRE_EASTER_FEATHER);

        trimmedArmorItem(ModItems.BLUE_EASTER_BOOTS);
        trimmedArmorItem(ModItems.BLUE_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.BLUE_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.BLUE_EASTER_HELMET);

        trimmedArmorItem(ModItems.RED_EASTER_BOOTS);
        trimmedArmorItem(ModItems.RED_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.RED_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.RED_EASTER_HELMET);

        trimmedArmorItem(ModItems.ORANGE_EASTER_BOOTS);
        trimmedArmorItem(ModItems.ORANGE_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.ORANGE_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.ORANGE_EASTER_HELMET);

        trimmedArmorItem(ModItems.PURPLE_EASTER_BOOTS);
        trimmedArmorItem(ModItems.PURPLE_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.PURPLE_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.PURPLE_EASTER_HELMET);

        trimmedArmorItem(ModItems.BROWN_EASTER_BOOTS);
        trimmedArmorItem(ModItems.BROWN_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.BROWN_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.BROWN_EASTER_HELMET);

        trimmedArmorItem(ModItems.YELLOW_EASTER_BOOTS);
        trimmedArmorItem(ModItems.YELLOW_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.YELLOW_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.YELLOW_EASTER_HELMET);

        trimmedArmorItem(ModItems.GREEN_EASTER_BOOTS);
        trimmedArmorItem(ModItems.GREEN_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.GREEN_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.GREEN_EASTER_HELMET);

        trimmedArmorItem(ModItems.GRAY_EASTER_BOOTS);
        trimmedArmorItem(ModItems.GRAY_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.GRAY_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.GRAY_EASTER_HELMET);

        trimmedArmorItem(ModItems.FIRE_EASTER_BOOTS);
        trimmedArmorItem(ModItems.FIRE_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.FIRE_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.FIRE_EASTER_HELMET);

        trimmedArmorItem(ModItems.VOID_EASTER_BOOTS);
        trimmedArmorItem(ModItems.VOID_EASTER_LEGGINGS);
        trimmedArmorItem(ModItems.VOID_EASTER_CHESTPLATE);
        trimmedArmorItem(ModItems.VOID_EASTER_HELMET);


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ChildhoodImaginationMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ChildhoodImaginationMod.MODID, "item/" + item.getId().getPath()));
    }


    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = ChildhoodImaginationMod.MODID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

}
