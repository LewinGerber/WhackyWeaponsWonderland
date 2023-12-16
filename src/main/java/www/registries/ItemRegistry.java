package www.registries;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static www.WhackyWeaponsWonderland.MODID;

public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> SAPPHIRE = add("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLASTER = add("blaster", () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static RegistryObject<Item> add(String name,  Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }
}
