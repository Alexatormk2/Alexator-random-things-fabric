package net.alexatorv13.alexatorrandomthings.screen;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CashRegisterScreenHandler> CASH_REGISTER_SCREEN_HANDLER_SCREEN = ScreenHandlerRegistry.registerSimple(new Identifier("alexatorrandomthings", "cashregister"), CashRegisterScreenHandler::new);

    public ModScreenHandlers() {
    }

    public static void registerScreenHandlers() {
        AlexatorRandomThings.LOGGER.info("Registering Screen Handlers for alexatorrandomthings");
    }
}
