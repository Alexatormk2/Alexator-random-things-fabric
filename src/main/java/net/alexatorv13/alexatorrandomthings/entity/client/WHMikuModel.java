package net.alexatorv13.alexatorrandomthings.entity.client;

import net.alexatorv13.alexatorrandomthings.entity.animation.ModAnimations;
import net.alexatorv13.alexatorrandomthings.entity.custom.HostilewMikuEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class WHMikuModel<T extends HostilewMikuEntity> extends SinglePartEntityModel<T> {
	private final ModelPart WHMikuModel;

	private final ModelPart head;

	public WHMikuModel(ModelPart root) {
		this.WHMikuModel = root.getChild("WHMikuModel");
		this.head =WHMikuModel.getChild("torso").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData WHMikuModel = modelPartData.addChild("WHMikuModel", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 21.375F, 0.0F));

		ModelPartData torso = WHMikuModel.addChild("torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = torso.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.275F, -14.2F, -0.65F));

		ModelPartData neck = head.addChild("neck", ModelPartBuilder.create().uv(41, 0).cuboid(-0.8F, -1.0F, -1.0F, 1.6F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.575F, -5.075F, -2.225F, 4.975F, 4.75F, 4.825F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-2.575F, -5.075F, -2.225F, 4.975F, 4.75F, 4.825F, new Dilation(0.1F))
		.uv(44, 0).cuboid(-2.575F, -5.075F, -2.225F, 4.975F, 4.75F, 4.825F, new Dilation(-0.1F)), ModelTransform.pivot(-0.05F, 0.325F, 0.025F));

		ModelPartData hair = neck.addChild("hair", ModelPartBuilder.create(), ModelTransform.pivot(0.15F, -5.125F, 0.625F));

		ModelPartData twintail2 = hair.addChild("twintail2", ModelPartBuilder.create().uv(0, 55).cuboid(-3.225F, -0.25F, 0.625F, 1.325F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(13, 61).cuboid(-3.575F, -0.05F, 1.025F, 0.725F, 1.5F, 1.225F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = twintail2.addChild("cube_r1", ModelPartBuilder.create().uv(8, 61).cuboid(-0.375F, -2.5375F, -0.475F, 0.875F, 1.075F, 1.175F, new Dilation(0.0F)), ModelTransform.of(-4.025F, 7.0056F, 3.3036F, 0.2705F, 0.0F, 0.0F));

		ModelPartData cube_r2 = twintail2.addChild("cube_r2", ModelPartBuilder.create().uv(26, 56).cuboid(-0.65F, 4.5125F, -1.0F, 1.35F, 5.075F, 2.0F, new Dilation(0.0F))
		.uv(18, 56).cuboid(-0.65F, -1.0375F, -1.0F, 1.35F, 5.075F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.025F, 0.8625F, 1.6F, 0.2705F, 0.0F, 0.0F));

		ModelPartData twintail1 = hair.addChild("twintail1", ModelPartBuilder.create().uv(13, 61).cuboid(2.85F, -0.05F, 1.025F, 0.725F, 1.5F, 1.225F, new Dilation(0.0F))
		.uv(1, 60).cuboid(1.65F, -0.25F, 0.625F, 1.225F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r3 = twintail1.addChild("cube_r3", ModelPartBuilder.create().uv(8, 61).cuboid(-0.85F, -2.5375F, -0.475F, 0.875F, 1.075F, 1.175F, new Dilation(0.0F)), ModelTransform.of(4.025F, 7.0056F, 3.3036F, 0.2705F, 0.0F, 0.0F));

		ModelPartData cube_r4 = twintail1.addChild("cube_r4", ModelPartBuilder.create().uv(26, 56).cuboid(-1.05F, 4.5125F, -1.0F, 1.35F, 5.075F, 2.0F, new Dilation(0.0F))
		.uv(18, 56).cuboid(-1.05F, -1.0375F, -1.0F, 1.35F, 5.075F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.025F, 0.8625F, 1.6F, 0.2705F, 0.0F, 0.0F));

		ModelPartData upperbody = torso.addChild("upperbody", ModelPartBuilder.create().uv(0, 10).cuboid(-3.75F, -4.4F, -1.225F, 2.0F, 1.325F, 1.5F, new Dilation(0.0F))
		.uv(7, 9).cuboid(1.225F, -4.4F, -0.875F, 2.0F, 1.325F, 1.0F, new Dilation(0.0F))
		.uv(0, 13).cuboid(-2.8F, -4.8F, -2.0F, 5.1F, 4.675F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.2F, -9.2F, 0.0F));

		ModelPartData arms = upperbody.addChild("arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 9.2F, 0.0F));

		ModelPartData armR = arms.addChild("armR", ModelPartBuilder.create().uv(46, 23).cuboid(0.25F, 3.35F, -0.75F, 0.6F, 1.325F, 1.7F, new Dilation(0.0F))
		.uv(39, 42).cuboid(-0.15F, -0.775F, -0.975F, 1.325F, 4.375F, 1.825F, new Dilation(0.0F)), ModelTransform.pivot(2.925F, -12.95F, -0.4F));

		ModelPartData mid = armR.addChild("mid", ModelPartBuilder.create().uv(40, 28).cuboid(-0.35F, 1.725F, -0.75F, 0.6F, 1.425F, 1.425F, new Dilation(0.0F))
		.uv(46, 43).cuboid(-0.725F, 0.125F, -0.875F, 1.3F, 2.525F, 1.8F, new Dilation(0.0F))
		.uv(40, 32).cuboid(-0.725F, 3.1F, -0.875F, 1.3F, 1.35F, 1.8F, new Dilation(0.0F)), ModelTransform.pivot(0.6F, 3.75F, 0.0F));

		ModelPartData armL = arms.addChild("armL", ModelPartBuilder.create().uv(16, 30).cuboid(-0.775F, -0.8F, -0.825F, 1.325F, 3.325F, 1.825F, new Dilation(0.0F))
		.uv(31, 12).cuboid(-0.55F, 2.325F, 0.0F, 0.25F, 1.225F, 0.275F, new Dilation(0.0F))
		.uv(26, 15).cuboid(0.05F, 2.325F, -0.25F, 0.25F, 1.225F, 0.275F, new Dilation(0.0F))
		.uv(32, 15).cuboid(-0.2F, 2.325F, -0.15F, 0.25F, 1.225F, 0.275F, new Dilation(0.0F)), ModelTransform.pivot(-3.975F, -12.925F, -0.55F));

		ModelPartData cube_r5 = armL.addChild("cube_r5", ModelPartBuilder.create().uv(28, 15).cuboid(-0.125F, -0.275F, -0.1375F, 0.225F, 0.525F, 0.275F, new Dilation(0.0F)), ModelTransform.of(-0.4713F, 3.7723F, 0.1375F, 0.0F, 0.0F, 0.2182F));

		ModelPartData cube_r6 = armL.addChild("cube_r6", ModelPartBuilder.create().uv(28, 12).cuboid(-0.125F, -0.275F, -0.1375F, 0.225F, 1.125F, 0.275F, new Dilation(0.0F)), ModelTransform.of(-0.1213F, 3.7723F, -0.0125F, 0.0F, 0.0F, 0.2182F));

		ModelPartData cube_r7 = armL.addChild("cube_r7", ModelPartBuilder.create().uv(30, 15).cuboid(-0.125F, -0.275F, -0.1375F, 0.225F, 2.025F, 0.275F, new Dilation(0.0F)), ModelTransform.of(0.1287F, 3.7723F, -0.1125F, 0.0F, 0.0F, 0.2182F));

		ModelPartData breast = upperbody.addChild("breast", ModelPartBuilder.create(), ModelTransform.of(-0.3125F, -3.2F, -2.325F, 0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r8 = breast.addChild("cube_r8", ModelPartBuilder.create().uv(55, 17).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.1F))
		.uv(45, 12).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0875F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		ModelPartData cube_r9 = breast.addChild("cube_r9", ModelPartBuilder.create().uv(54, 12).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.1F))
		.uv(45, 17).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.0875F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));

		ModelPartData endo = upperbody.addChild("endo", ModelPartBuilder.create().uv(46, 59).cuboid(-2.375F, -13.7F, -1.5F, 4.6F, 2.1F, 2.0F, new Dilation(0.0F))
		.uv(60, 58).cuboid(-0.775F, -11.85F, -0.175F, 1.175F, 4.8F, 0.75F, new Dilation(0.0F))
		.uv(51, 53).cuboid(1.575F, -11.45F, -1.475F, 0.625F, 0.875F, 2.0F, new Dilation(0.0F))
		.uv(60, 56).cuboid(0.3F, -11.45F, -0.075F, 1.25F, 0.875F, 0.6F, new Dilation(0.0F))
		.uv(39, 56).cuboid(-1.55F, -11.45F, -0.075F, 1.25F, 0.875F, 0.6F, new Dilation(0.0F))
		.uv(56, 52).cuboid(-2.2F, -11.45F, -1.475F, 0.625F, 0.875F, 2.0F, new Dilation(0.0F))
		.uv(49, 56).cuboid(1.575F, -10.325F, -1.475F, 0.625F, 0.875F, 2.0F, new Dilation(0.0F))
		.uv(42, 61).cuboid(0.3F, -10.325F, -0.075F, 1.25F, 0.875F, 0.6F, new Dilation(0.0F))
		.uv(55, 57).cuboid(-1.55F, -10.325F, -0.075F, 1.25F, 0.875F, 0.6F, new Dilation(0.0F))
		.uv(37, 58).cuboid(-2.2F, -10.325F, -1.475F, 0.625F, 0.875F, 2.0F, new Dilation(0.0F))
		.uv(38, 61).cuboid(1.575F, -9.15F, -1.475F, 0.525F, 0.875F, 2.0F, new Dilation(0.0F))
		.uv(43, 59).cuboid(0.3F, -9.15F, -0.075F, 1.25F, 0.875F, 0.6F, new Dilation(0.0F))
		.uv(44, 56).cuboid(-1.55F, -9.15F, -0.075F, 1.25F, 0.875F, 0.6F, new Dilation(0.0F))
		.uv(33, 60).cuboid(-2.2F, -9.15F, -1.475F, 0.625F, 0.875F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.2F, 0.0F));

		ModelPartData middlebody = torso.addChild("middlebody", ModelPartBuilder.create().uv(48, 29).cuboid(-2.825F, -0.075F, -1.8F, 5.55F, 4.225F, 2.425F, new Dilation(0.0F))
		.uv(56, 37).cuboid(-1.15F, 2.075F, -1.275F, 2.275F, 2.0F, 1.6F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -9.3F, 0.0F));

		ModelPartData bottombody = middlebody.addChild("bottombody", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 9.3F, 0.0F));

		ModelPartData legs = bottombody.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legR = legs.addChild("legR", ModelPartBuilder.create().uv(0, 38).cuboid(-1.1F, -0.575F, -1.575F, 2.175F, 4.55F, 1.95F, new Dilation(0.0F))
		.uv(0, 30).cuboid(-0.775F, 3.725F, -1.65F, 1.6F, 1.525F, 1.65F, new Dilation(0.0F)), ModelTransform.pivot(1.55F, -6.15F, 0.0F));

		ModelPartData rigth = legR.addChild("rigth", ModelPartBuilder.create().uv(21, 25).cuboid(-0.55F, 1.65F, -0.325F, 1.075F, 2.625F, 1.2F, new Dilation(0.0F))
		.uv(9, 34).cuboid(-1.025F, 3.925F, -0.675F, 2.0F, 0.625F, 2.0F, new Dilation(0.0F))
		.uv(18, 40).cuboid(-1.025F, 0.175F, -0.65F, 2.175F, 3.025F, 1.95F, new Dilation(0.0F)), ModelTransform.pivot(-0.075F, 4.3F, -0.925F));

		ModelPartData legL = legs.addChild("legL", ModelPartBuilder.create().uv(9, 38).cuboid(-1.075F, -0.3F, -1.575F, 2.175F, 4.55F, 1.95F, new Dilation(0.0F))
		.uv(8, 30).cuboid(-0.825F, 4.0F, -1.65F, 1.6F, 1.525F, 1.65F, new Dilation(0.0F)), ModelTransform.pivot(-1.65F, -6.425F, 0.0F));

		ModelPartData left2 = legL.addChild("left2", ModelPartBuilder.create().uv(18, 36).cuboid(-1.3F, 0.075F, -0.875F, 2.175F, 1.475F, 1.95F, new Dilation(0.0F))
		.uv(16, 25).cuboid(-0.675F, 1.55F, -0.55F, 1.075F, 2.625F, 1.2F, new Dilation(0.0F))
		.uv(0, 34).cuboid(-1.125F, 3.825F, -0.9F, 2.0F, 0.625F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.225F, 4.675F, -0.7F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(HostilewMikuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.WHMIKU_WALK, limbSwing, limbSwingAmount, 1f, 1f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.WHMIKU_IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.WHMIKU_ATTACK, ageInTicks, 1f);



	}

	private void setHeadAngles(float headYaw,float headPitch){
headYaw = MathHelper.clamp(headYaw,-30.0f,30.0f);
headPitch= MathHelper.clamp(headPitch,-25.0f,45.0f);


		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;

	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		WHMikuModel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return WHMikuModel;
	}
}