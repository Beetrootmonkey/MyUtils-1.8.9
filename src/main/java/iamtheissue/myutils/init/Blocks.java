package iamtheissue.myutils.init;

import iamtheissue.myutils.Reference;
import iamtheissue.myutils.blocks.GlowingSand;
import iamtheissue.myutils.blocks.GlowstoneBlock;
import iamtheissue.myutils.blocks.Lamp;
import iamtheissue.myutils.blocks.SmallLamp;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class Blocks
{
	public static Block lamp;
	public static Block glowstone_block;
	public static Block glowing_sand;
	public static Block small_lamp;
	
	
	public static void init()
	{
		lamp = new Lamp().setUnlocalizedName("lamp");
		glowstone_block = new GlowstoneBlock().setUnlocalizedName("glowstone_block");
		glowing_sand = new GlowingSand().setUnlocalizedName("glowing_sand");
		small_lamp = new SmallLamp().setUnlocalizedName("small_lamp");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(lamp, lamp.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(glowstone_block, glowstone_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(glowing_sand, glowing_sand.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(small_lamp, small_lamp.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(lamp);
		registerRender(glowstone_block);
		registerRender(glowing_sand);
		registerRender(small_lamp);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerThaumcraftAspects()
	{
		ThaumcraftApi.registerObjectTag(new ItemStack(lamp), (new AspectList()).add(Aspect.LIGHT, 2).add(Aspect.CRYSTAL, 1).add(Aspect.CRAFT, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(glowing_sand), (new AspectList()).add(Aspect.LIGHT, 2).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(small_lamp), (new AspectList()).add(Aspect.LIGHT, 2).add(Aspect.CRYSTAL, 1).add(Aspect.CRAFT, 1));
		
	}
}
