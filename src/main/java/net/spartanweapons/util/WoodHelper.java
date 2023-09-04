package net.spartanweapons.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.spartanweapons.init.ItemInit;

public class WoodHelper {

    public static final Map<ItemStack, ItemStack> HANDLE_MAP = new HashMap<ItemStack, ItemStack>();

    private static final ArrayList<Item> OTHER_STICKS = new ArrayList<Item>(Arrays.asList(ItemInit.ACACIA_STICK, ItemInit.BAMBOO_STICK, ItemInit.BIRCH_STICK, ItemInit.CHERRY_STICK,
            ItemInit.CRIMSON_STICK, ItemInit.DARK_OAK_STICK, ItemInit.JUNGLE_STICK, ItemInit.MANGROVE_STICK, ItemInit.SPRUCE_STICK, ItemInit.WARPED_STICK));

    // 0:"oak", 1:"acacia", 2:"bamboo", 3:"birch", 4:"cherry", 5:"crimson", 6:"dark_oak", 7:"jungle", 8:"mangrove", 9:"spruce", 10:"warped"
    public static int getWoodType(List<ItemStack> input) {
        for (int i = 0; i < input.size(); i++) {
            Item item = input.get(i).getItem();
            if (OTHER_STICKS.contains(input.get(i).getItem())) {
                if (item.equals(OTHER_STICKS.get(0))) {
                    return 1;
                } else if (item.equals(OTHER_STICKS.get(1))) {
                    return 2;
                } else if (item.equals(OTHER_STICKS.get(2))) {
                    return 3;
                } else if (item.equals(OTHER_STICKS.get(3))) {
                    return 4;
                } else if (item.equals(OTHER_STICKS.get(4))) {
                    return 5;
                } else if (item.equals(OTHER_STICKS.get(5))) {
                    return 6;
                } else if (item.equals(OTHER_STICKS.get(6))) {
                    return 7;
                } else if (item.equals(OTHER_STICKS.get(7))) {
                    return 8;
                } else if (item.equals(OTHER_STICKS.get(8))) {
                    return 9;
                } else if (item.equals(OTHER_STICKS.get(9))) {
                    return 10;
                }
            }
        }
        return 0;
    }

}
