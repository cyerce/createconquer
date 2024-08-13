package net.aepherastudios.createconquer.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200), 1f).build();
    public static final FoodProperties URANIUM_POWDER = new FoodProperties.Builder().alwaysEat().nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 12000), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 12000), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 12000), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 12000), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 12000), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 12000), 1f).build();
}
