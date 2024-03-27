package net.benjaydev.childhoodimagination.datagen;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
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
}
