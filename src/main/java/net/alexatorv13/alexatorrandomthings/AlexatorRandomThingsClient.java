package net.alexatorv13.alexatorrandomthings;

import net.alexatorv13.alexatorrandomthings.screen.CashRegisterScreen;
import net.alexatorv13.alexatorrandomthings.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class AlexatorRandomThingsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        HandledScreens.register(ModScreenHandlers.CASH_REGISTER_SCREEN_HANDLER_SCREEN, CashRegisterScreen::new);

    }
}
