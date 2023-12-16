package www.registries;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static www.WhackyWeaponsWonderland.MODID;

public class BlockRegistry {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

    public static RegistryObject<Block> add(String name,  Supplier<Block> supplier) {
        return BLOCKS.register(name, supplier);
    }
}
