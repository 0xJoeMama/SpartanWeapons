package net.spartanweapons.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class Dagger extends SwordItem implements WoodTypeItem {

    public Dagger(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

}
