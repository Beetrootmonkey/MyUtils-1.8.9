package iamtheissue.myutils.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{

	@Override
	public int getBurnTime(ItemStack fuel)
	{
        Item itemFuel = fuel.getItem();
        if(itemFuel instanceof ItemFuelPellet)
        {
        	return ((ItemFuelPellet)itemFuel).getBurnTime();
        }
		return 0;
	}	
}
