package io.github.drmanganese.endercrop.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;

import java.util.List;

import io.github.drmanganese.endercrop.init.ModBlocks;
import io.github.drmanganese.endercrop.reference.Names;

public class ItemEnderSeeds extends ItemSeeds {

    public ItemEnderSeeds() {
        super(ModBlocks.CROP_ENDER, null);
        this.setUnlocalizedName(Names.Items.SEEDS);
        this.setRegistryName(Names.Items.SEEDS);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
        if (stack.getItem() instanceof ItemSeeds) {
            tooltip.add(I18n.format("endercrop.tip.seed"));
        }
    }
}
