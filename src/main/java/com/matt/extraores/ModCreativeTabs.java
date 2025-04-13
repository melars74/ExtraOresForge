package com.matt.extraores;

import com.matt.extraores.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraOres.MODID);

    public static final RegistryObject<CreativeModeTab> EXTRA_ORES_TAB = CREATIVE_MODE_TABS.register("extra_ores_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.extra_ores_tab"))
                    .icon(() -> new ItemStack(ModBlocks.SILVER_ORE_BLOCK.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.SILVER_ORE_BLOCK.get());
                    }).build());
}
