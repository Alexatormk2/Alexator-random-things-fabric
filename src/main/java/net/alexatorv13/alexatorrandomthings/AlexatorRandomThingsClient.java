package net.alexatorv13.alexatorrandomthings;

import net.alexatorv13.alexatorrandomthings.entity.client.ModModelLayers;
import net.alexatorv13.alexatorrandomthings.entity.client.WHMikuModel;
import net.alexatorv13.alexatorrandomthings.screen.CashRegisterScreen;
import net.alexatorv13.alexatorrandomthings.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class AlexatorRandomThingsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        HandledScreens.register(ModScreenHandlers.CASH_REGISTER_SCREEN_HANDLER_SCREEN, CashRegisterScreen::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HWMIKU, WHMikuModel::getTexturedModelData);

    }
}
