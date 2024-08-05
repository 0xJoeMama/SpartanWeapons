package net.spartanweapons.item;

import com.google.common.base.Preconditions;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.spartanweapons.util.WoodType;

import java.util.List;

public class SpartanWeaponItem extends SwordItem {
    public SpartanWeaponItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (type == TooltipType.BASIC) {
            var woodType = stack.get(WoodType.WOOD_TYPE_COMPONENT);
            if (woodType == null) return;

            var id = WoodType.REGISTRY.getId(woodType);
            Preconditions.checkNotNull(id);
            tooltip.add(Text.translatable("woodtype." + id.getNamespace() + "." + id.getPath()));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
