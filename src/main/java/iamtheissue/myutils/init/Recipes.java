package iamtheissue.myutils.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;

public class Recipes
{
	public static void register()
	{
		GameRegistry.addSmelting(Items.raw_squid, new ItemStack(Items.cooked_squid), 0.35f);
		GameRegistry.addSmelting(Items.raw_horse, new ItemStack(Items.cooked_horse), 0.35f);
		GameRegistry.addSmelting(Items.raw_spider, new ItemStack(Items.cooked_spider), 0.35f);
		GameRegistry.addSmelting(Items.raw_spider_leg, new ItemStack(Items.cooked_spider_leg), 0.35f);
		GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("minecraft:spider_eye")), new ItemStack(Items.cooked_spider_eye), 0.35f);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal_pellet, 8), new ItemStack(net.minecraft.init.Items.coal));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.charcoal_pellet, 8), new ItemStack(net.minecraft.init.Items.coal, 1, 1));
		
		GameRegistry.addShapedRecipe(new ItemStack(net.minecraft.item.Item.getByNameOrId("minecraft:stick"), 4), new Object[]{"R", "R", 'R', net.minecraft.item.ItemAnvilBlock.getByNameOrId("minecraft:reeds")});
		
		if(Loader.isModLoaded("Thaumcraft"))
		{
			ThaumcraftApi.addSmeltingBonus(new ItemStack(Items.raw_squid), new ItemStack(Item.getByNameOrId("thaumcraft:chunk"), 0, 3));
			ThaumcraftApi.addSmeltingBonus(new ItemStack(Items.raw_horse), new ItemStack(Item.getByNameOrId("thaumcraft:chunk"), 0, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.phial_goo), new ItemStack(Item.getByNameOrId("thaumcraft:phial"), 1, 0), new ItemStack(Item.getByNameOrId("thaumcraft:tainted")));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.phial_goo, 1, 1), new ItemStack(Items.phial_goo, 1, 0), new ItemStack(Item.getByNameOrId("thaumcraft:tainted")));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.phial_goo), new ItemStack(Item.getByNameOrId("thaumcraft:phial"), 1, 0), new ItemStack(Item.getByNameOrId("thaumcraft:tainted"), 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.phial_goo, 1, 1), new ItemStack(Items.phial_goo, 1, 0), new ItemStack(Item.getByNameOrId("thaumcraft:tainted"), 1, 1));
			GameRegistry.addSmelting(new ItemStack(Item.getByNameOrId("thaumcraft:taint_log")), new ItemStack(Item.getByNameOrId("thaumcraft:tainted")), 0.35f);
			ThaumcraftApi.addSmeltingBonus(new ItemStack(Item.getByNameOrId("thaumcraft:taint_log")), new ItemStack(Items.charcoal_pellet, 0, 0));
			
		}
		if(Loader.isModLoaded("BiomesOPlenty"))
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("biomesoplenty:shroompowder")), net.minecraft.item.Item.getByNameOrId("minecraft:red_mushroom"));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("biomesoplenty:shroompowder")), net.minecraft.item.Item.getByNameOrId("minecraft:brown_mushroom"));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.getByNameOrId("minecraft:mushroom_stew")), net.minecraft.item.Item.getByNameOrId("biomesoplenty:shroompowder"), net.minecraft.item.Item.getByNameOrId("biomesoplenty:shroompowder"), net.minecraft.item.Item.getByNameOrId("minecraft:bowl"));
		}
	}
	
	public static void oreRegistration()
    {
        
    }
}
