/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.yteriagrp.ytermod.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import fr.yteriagrp.ytermod.item.CupperdiamingotItem;
import fr.yteriagrp.ytermod.item.CupperdiamItem;
import fr.yteriagrp.ytermod.YtermodMod;

public class YtermodModItems {
	public static Item CUPPERDIAM_INGOT;
	public static Item CUPPERDIAM_POWDER;

	public static void load() {
		CUPPERDIAM_INGOT = register("cupperdiam_ingot", new CupperdiamingotItem());
		CUPPERDIAM_POWDER = register("cupperdiam_powder", new CupperdiamItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YtermodMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
