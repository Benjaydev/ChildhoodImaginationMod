package net.benjaydev.childhoodimagination.item;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.benjaydev.childhoodimagination.item.custom.EasterDungeonKeyItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChildhoodImaginationMod.MODID);

    public static final RegistryObject<Item> SCRUE = ITEMS.register("scrue", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCRUE_CHUNK = ITEMS.register("scrue_chunk", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCRUE_STICK = ITEMS.register("scrue_stick", () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SCRUE_PICKAXE = ITEMS.register("scrue_pickaxe", () -> new PickaxeItem(ModToolTiers.SCRUE, 1, 1,new Item.Properties()));
    public static final RegistryObject<Item> SCRUE_AXE = ITEMS.register("scrue_axe", () -> new AxeItem(ModToolTiers.SCRUE, 6, 1,new Item.Properties()));
    public static final RegistryObject<Item> SCRUE_SWORD = ITEMS.register("scrue_sword", () -> new SwordItem(ModToolTiers.SCRUE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SCRUE_SHOVEL = ITEMS.register("scrue_shovel", () -> new ShovelItem(ModToolTiers.SCRUE, 0, 0,new Item.Properties()));
    public static final RegistryObject<Item> SCRUE_HOE = ITEMS.register("scrue_hoe", () -> new HoeItem(ModToolTiers.SCRUE, 0, 0,new Item.Properties()));

    // Easter
    public static final RegistryObject<Item> EASTER_DUNGEON_KEY = ITEMS.register("easter_dungeon_key", () -> new EasterDungeonKeyItem(new Item.Properties().durability(10)));
    public static final RegistryObject<Item> EASTER_GEM = ITEMS.register("easter_gem", () -> new Item(new Item.Properties()));

    // Eggs
    public static final RegistryObject<Item> BLUE_EASTER_EGG = ITEMS.register("blue_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> RED_EASTER_EGG = ITEMS.register("red_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_EASTER_EGG = ITEMS.register("orange_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_EASTER_EGG = ITEMS.register("purple_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_EASTER_EGG = ITEMS.register("brown_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_EASTER_EGG = ITEMS.register("yellow_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_EASTER_EGG = ITEMS.register("green_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> GRAY_EASTER_EGG = ITEMS.register("gray_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_EASTER_EGG = ITEMS.register("fire_easter_egg", () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> VOID_EASTER_EGG = ITEMS.register("void_easter_egg", () -> new EggItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
