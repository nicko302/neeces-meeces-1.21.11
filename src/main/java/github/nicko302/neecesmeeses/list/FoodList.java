package github.nicko302.neecesmeeses.list;

import net.minecraft.component.type.FoodComponent;

public class FoodList {
    public static final FoodComponent CHEESE_SETTINGS = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.2F)
            .build();
}