package com.example.examplemod;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<SwordItem> NAME_SPEAR = ITEMS.register("name_spear",
            () -> new SwordItem(ModItemTier.CUSTOMNAMEHERE, 5, -2.8f,
                    (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item ((new Item.Properties()).group(ItemGroup.FOOD).food(WitcheryFoods.LEMON_FOOD)));
}
