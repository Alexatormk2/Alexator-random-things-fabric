package net.alexatorv13.alexatorrandomthings.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFood {


    public static final FoodComponent CHICKEN_NUGGET =
            new FoodComponent.Builder().meat().hunger(2).saturationModifier(0.1f).snack().build();
    public static final FoodComponent FRIES =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build();
    public static final FoodComponent LETTUCE =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent TOMATO =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent ONION =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();


    public static final FoodComponent CHEESE_WHEEL =
            new FoodComponent.Builder().hunger(25).saturationModifier(10f).build();
    public static final FoodComponent CHEESE_PIECE =
            new FoodComponent.Builder().hunger(10).saturationModifier(5f).build();
    public static final FoodComponent CHEESE_SLICE =
            new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent BURGERBREAD =
            new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent PROCESSED_MEAT =
             new FoodComponent.Builder().meat().hunger(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,200),100).snack().build();

    public static final FoodComponent RAW_PATTY =
            new FoodComponent.Builder().meat().hunger(3).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,200),100).build();
    public static final FoodComponent PATTY =
             new FoodComponent.Builder().meat().hunger(5).saturationModifier(0.1f).build();



    public static final FoodComponent RAW_NUGGET =
            new FoodComponent.Builder().meat().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,300),100).build();

    public static final FoodComponent RAW_FRIES =
            new FoodComponent.Builder().meat().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,200),100).build();


    public static final FoodComponent NUGGET_BAG =
            new FoodComponent.Builder().meat().hunger(10).saturationModifier(0.1f).build();

    public static final FoodComponent FRIES_BAG =
            new FoodComponent.Builder().hunger(12).saturationModifier(0.1f).build();

    public static final FoodComponent BURGER =
            new FoodComponent.Builder().hunger(14).saturationModifier(7f).build();
    public static final FoodComponent CHEESEBURGER =
            new FoodComponent.Builder().hunger(15).saturationModifier(7.6f).build();


}
