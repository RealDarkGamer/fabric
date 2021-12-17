package net.thedarkgamer.fabrictest.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thedarkgamer.fabrictest.FabricTest;

public class ModItems {

    public static final Item ETHER_INGOT = registerItem("ether_ingot", new Item(new FabricItemSettings().fireproof().group(ItemGroup.MISC)));
    

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FabricTest.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + FabricTest.MOD_ID);
    }

}
