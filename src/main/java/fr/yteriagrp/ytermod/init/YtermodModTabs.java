
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.yteriagrp.ytermod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import fr.yteriagrp.ytermod.YtermodMod;

public class YtermodModTabs {
	public static ResourceKey<CreativeModeTab> TAB_YTERMODORES = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(YtermodMod.MODID, "ytermodores"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_YTERMODORES,
				FabricItemGroup.builder().title(Component.translatable("item_group." + YtermodMod.MODID + ".ytermodores")).icon(() -> new ItemStack(Blocks.POLISHED_BLACKSTONE_SLAB)).build());
	}
}
