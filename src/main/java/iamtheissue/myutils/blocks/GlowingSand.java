package iamtheissue.myutils.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GlowingSand extends Block
{
	public GlowingSand()
	{
		super(Material.sand);
		setCreativeTab(CreativeTabs.tabDecorations);
		setStepSound(soundTypeSand);
		setHarvestLevel("shovel", 0);
		setHardness(1f);
		setLightLevel(1f);
	}
	
}
