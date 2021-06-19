
package net.mcreator.obliterum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.obliterum.itemgroup.ObliterumItemGroup;
import net.mcreator.obliterum.ObliterumModElements;

@ObliterumModElements.ModElement.Tag
public class ObliterumAxeItem extends ObliterumModElements.ModElement {
	@ObjectHolder("obliterum:obliterum_axe")
	public static final Item block = null;
	public ObliterumAxeItem(ObliterumModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3811;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 33f;
			}

			public int getHarvestLevel() {
				return 14;
			}

			public int getEnchantability() {
				return 98;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ObliterumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ObliterumItemGroup.tab)) {
		}.setRegistryName("obliterum_axe"));
	}
}
