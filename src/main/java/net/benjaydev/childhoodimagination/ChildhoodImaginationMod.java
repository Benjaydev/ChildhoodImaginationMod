package net.benjaydev.childhoodimagination;

import com.mojang.logging.LogUtils;
import net.benjaydev.childhoodimagination.block.ModBlocks;
import net.benjaydev.childhoodimagination.entity.ModEntities;
import net.benjaydev.childhoodimagination.entity.client.*;
import net.benjaydev.childhoodimagination.entity.custom.BlueEasterChickenEntity;
import net.benjaydev.childhoodimagination.entity.custom.YellowEasterChickenEntity;
import net.benjaydev.childhoodimagination.item.ModCreativeModeTabs;
import net.benjaydev.childhoodimagination.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ChildhoodImaginationMod.MODID)
public class ChildhoodImaginationMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "childhoodimagination";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public ChildhoodImaginationMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModEntities.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.BLUE_EASTER_CHICKEN.get(), BlueEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.RED_EASTER_CHICKEN.get(), RedEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.ORANGE_EASTER_CHICKEN.get(), OrangeEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.PURPLE_EASTER_CHICKEN.get(), PurpleEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.BROWN_EASTER_CHICKEN.get(), BrownEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.YELLOW_EASTER_CHICKEN.get(), YellowEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.GREEN_EASTER_CHICKEN.get(), GreenEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.GRAY_EASTER_CHICKEN.get(), GrayEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.VOID_EASTER_CHICKEN.get(), VoidEasterChickenRenderer::new);
            EntityRenderers.register(ModEntities.FIRE_EASTER_CHICKEN.get(), FireEasterChickenRenderer::new);
        }
    }
}
