package iamtheissue.myutils.init;



import java.util.List;

import iamtheissue.myutils.Reference;
import iamtheissue.myutils.items.ItemFuelPellet;
import iamtheissue.myutils.items.ItemPoisonous;
import iamtheissue.myutils.items.MetaItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.Thaumcraft;
import thaumcraft.common.items.consumables.ItemChunksEdible;

public class Items
{
	
	public static Item raw_squid;
	public static Item cooked_squid;
	public static Item raw_horse;
	public static Item cooked_horse;
	public static Item raw_spider;
	public static Item cooked_spider;
	public static Item raw_spider_leg;
	public static Item cooked_spider_leg;
	public static Item cooked_spider_eye;
	
	public static Item coal_pellet;
	public static Item charcoal_pellet;
	
	public static Item phial_goo;
	
	public static void preInit()
	{
		ModelBakery.registerItemVariants(phial_goo, new ModelResourceLocation(Reference.MOD_ID + ":phial_goo_0", "inventory"), new ModelResourceLocation(Reference.MOD_ID + ":phial_goo_1", "inventory"));
	}
	
	public static void init()
	{
		raw_squid = new ItemFood(2, 0.4f, false).setUnlocalizedName("raw_squid");
		cooked_squid = new ItemFood(5, 6f, false).setUnlocalizedName("cooked_squid");
		raw_horse = new ItemFood(3, 1.8f, true).setUnlocalizedName("raw_horse");
		cooked_horse = new ItemFood(8, 12.8f, true).setUnlocalizedName("cooked_horse");
		raw_spider = new ItemPoisonous(2, 1f, 300, 1).setUnlocalizedName("raw_spider");
		cooked_spider = new ItemFood(8, 10f, false).setUnlocalizedName("cooked_spider");;
		raw_spider_leg = new ItemPoisonous(1, 0.2f, 100, 0).setUnlocalizedName("raw_spider_leg");;
		cooked_spider_leg = new ItemFood(2,  2f, false).setUnlocalizedName("cooked_spider_leg");;
		cooked_spider_eye = new ItemFood(2,  2f, false).setUnlocalizedName("cooked_spider_eye");;
		
		coal_pellet = new ItemFuelPellet(200).setUnlocalizedName("coal_pellet");
		charcoal_pellet = new ItemFuelPellet(200).setUnlocalizedName("charcoal_pellet");
		
		phial_goo = new MetaItem("phial_goo", 2);
		
		
	}
	
	public static void register()
	{
		GameRegistry.registerItem(raw_squid, raw_squid.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_squid, cooked_squid.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_horse, raw_horse.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_horse, cooked_horse.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_spider, raw_spider.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_spider, cooked_spider.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_spider_leg, raw_spider_leg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_spider_leg, cooked_spider_leg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_spider_eye, cooked_spider_eye.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(coal_pellet, coal_pellet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(charcoal_pellet, charcoal_pellet.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(phial_goo, phial_goo.getUnlocalizedName().substring(5));
		
		
		}
	
	public static void registerThaumcraftAspects()
	{
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_squid), (new AspectList()).add(Aspect.BEAST, 2).add(Aspect.LIFE, 1).add(Aspect.WATER, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_squid), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_horse), (new AspectList()).add(Aspect.BEAST, 2).add(Aspect.LIFE, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_horse), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_spider), (new AspectList()).add(Aspect.DEATH, 2).add(Aspect.BEAST, 2).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_spider_leg), (new AspectList()).add(Aspect.DEATH, 1).add(Aspect.BEAST, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider_leg), (new AspectList()).add(Aspect.LIFE, 1).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider_eye), (new AspectList()).add(Aspect.LIFE, 1).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(phial_goo, 1, 0), (new AspectList()).add(Aspect.FLUX, 2).add(Aspect.AURA, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(phial_goo, 1, 1), (new AspectList()).add(Aspect.FLUX, 4).add(Aspect.AURA, 4));
		
		
	}
	
	public static void registerRenders()
	{
		registerRender(raw_squid);
		registerRender(cooked_squid);
		registerRender(raw_horse);
		registerRender(cooked_horse);
		registerRender(raw_spider);
		registerRender(cooked_spider);
		registerRender(raw_spider_leg);
		registerRender(cooked_spider_leg);
		registerRender(cooked_spider_eye);
		
		registerRender(coal_pellet);
		registerRender(charcoal_pellet);
		
		registerRender(phial_goo, 0);
		registerRender(phial_goo, 1);
		
		
		
		
	}
	
	private static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	private static void registerRender(Item item, int meta)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5) + "_" + meta, "inventory"));
	}
	
	
	
	
	
	
	
	
	
	
}
