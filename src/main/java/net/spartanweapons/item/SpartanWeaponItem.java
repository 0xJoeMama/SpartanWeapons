package net.spartanweapons.item;

import com.google.common.base.Preconditions;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spartanweapons.util.WoodType;

import java.util.List;

public class SpartanWeaponItem extends SwordItem {
    private final boolean hasHandle;

    public SpartanWeaponItem(ToolMaterial toolMaterial, Settings settings, boolean hasHandle) {
        super(toolMaterial, settings);
        this.hasHandle = hasHandle;
    }

    public SpartanWeaponItem(ToolMaterial material, Settings settings) {
        this(material, settings, false);
    }

    public boolean hasHandle() {
        return this.hasHandle;
    }

    public static String getItemName(Identifier id) {
        var parts = id.getPath().split("_");
        return parts[parts.length - 1];
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
