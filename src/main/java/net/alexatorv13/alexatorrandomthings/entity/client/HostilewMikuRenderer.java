package net.alexatorv13.alexatorrandomthings.entity.client;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorrandomthings.AlexatorRandomThingsClient;
import net.alexatorv13.alexatorrandomthings.entity.custom.HostilewMikuEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class HostilewMikuRenderer extends MobEntityRenderer<HostilewMikuEntity,WHMikuModel<HostilewMikuEntity>> {
    private static final Identifier TEXTURE = new Identifier(AlexatorRandomThings.MOD_ID,"textures/entity/wmikuwitheredhostile.png");
    public HostilewMikuRenderer(EntityRendererFactory.Context context) {
        super(context, new WHMikuModel<>(context.getPart(ModModelLayers.HWMIKU)), 0.4f);
    }

    @Override
    public Identifier getTexture(HostilewMikuEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(HostilewMikuEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
matrixStack.scale(2f,2f,2f);
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
