package github.nicko302.neecesmeeses.init;

import github.nicko302.neecesmeeses.NeeceSMeeces;
import github.nicko302.neecesmeeses.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ItemInit {

    public static final Item CHEESE = register("cheese",
            new Item(new Item.Settings().food(FoodList.CHEESE_SETTINGS).registryKey(key("cheese"))));


    private static RegistryKey<Item> key(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, NeeceSMeeces.id(name));
    }
    public static <T extends Item> T register(String name, T item) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, NeeceSMeeces.id(name));
        return Registry.register(Registries.ITEM, key(name), item);
    }
    public static void init() {}
}
