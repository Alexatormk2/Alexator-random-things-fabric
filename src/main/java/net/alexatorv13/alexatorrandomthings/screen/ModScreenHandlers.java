package net.alexatorv13.alexatorrandomthings.screen;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import net.fabricmc.fabric.api.screenhandler.v1.FabricScreenHandlerFactory;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

    public static final ScreenHandlerType<CashRegisterScreenHandler> CASH_REGISTER_SCREEN_HANDLER_SCREEN =
            ScreenHandlerRegistry.registerSimple(new Identifier(AlexatorRandomThings.MOD_ID, "cashregister"),CashRegisterScreenHandler::new);

    public static void registerScreenHandlers() {
        AlexatorRandomThings.LOGGER.info("Registering Screen Handlers for " + AlexatorRandomThings.MOD_ID);
    }
}