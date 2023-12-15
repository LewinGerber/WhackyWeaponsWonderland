package com.example.whackyweaponswonderland.item;

import com.example.whackyweaponswonderland.WhackyWeaponsWonderlandMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Hold items we register for mod

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WhackyWeaponsWonderlandMod.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    //Add Items
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

}
