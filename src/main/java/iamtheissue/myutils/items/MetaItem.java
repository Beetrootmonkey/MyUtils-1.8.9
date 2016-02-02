package iamtheissue.myutils.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MetaItem extends Item
{
	private int variations;
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
	    return super.getUnlocalizedName() + "_" + stack.getItemDamage();
	}

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems)
	{
		for(int i = 0; i < variations; i++)
		{
			subItems.add(new ItemStack(itemIn, 1, i));
		}
	}
	
	
    public MetaItem(String unlocalizedName, int variations) {
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.variations = variations;
    }
}
