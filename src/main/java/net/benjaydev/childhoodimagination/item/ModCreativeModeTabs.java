package net.benjaydev.childhoodimagination.item;

import net.benjaydev.childhoodimagination.ChildhoodImaginationMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVEMODETABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChildhoodImaginationMod.MODID);

    public static final RegistryObject<CreativeModeTab> CUSTOMTAB = CREATIVEMODETABS.register("customtab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab." + ChildhoodImaginationMod.MODID + ".customtab"))
                    .icon(() -> new ItemStack(ModItems.SCRUE.get()))
                    .displayItems((params, output) ->{
                        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()){
                            output.accept(item.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVEMODETABS.register(eventBus);
    }
}
