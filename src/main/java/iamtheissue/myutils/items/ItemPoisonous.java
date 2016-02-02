package iamtheissue.myutils.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemPoisonous extends ItemFood
{
	private int duration;
	private int amplifier;
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		PotionEffect effect = new PotionEffect(19, duration, amplifier);
		if (!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(effect));
		}
            
	}

	public ItemPoisonous(int amount, float saturation, int duration, int amplifier)
	{
		super(amount, saturation, false);
		this.duration = duration;
		this.amplifier = amplifier;
	}
	
	

	
}
