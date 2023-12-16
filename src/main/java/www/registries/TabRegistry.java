package www.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static www.WhackyWeaponsWonderland.MODID;

public class TabRegistry {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    
    private static final RegistryObject<CreativeModeTab> MOD_TAB = add("mod_tab", TabRegistry::createModTab);

    public static void register(IEventBus bus) {
        bus.addListener(TabRegistry::addToDefaultCreativeTab);
        CREATIVE_MODE_TABS.register(bus);
    }
    
    public static RegistryObject<CreativeModeTab> add(String name, Supplier<CreativeModeTab> supplier) {
        return CREATIVE_MODE_TABS.register(name, supplier);
    }

    private static void addToDefaultCreativeTab(BuildCreativeModeTabContentsEvent event) {
        event.accept(ItemRegistry.SAPPHIRE);
    }

    private static CreativeModeTab createModTab() {
       return CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegistry.SAPPHIRE.get().getDefaultInstance())
            .title(Component.translatable("WWW Items"))
            .displayItems(getItemsForModTab()).build();
    }

    @NotNull
    private static CreativeModeTab.DisplayItemsGenerator getItemsForModTab() {
        return (parameters, output) -> {
            output.accept(ItemRegistry.SAPPHIRE.get());
            output.accept(ItemRegistry.BLASTER.get());
        };
    }
}
