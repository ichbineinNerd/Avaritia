package fox.spiteful.avaritia.items;

import cpw.mods.fml.common.registry.GameRegistry;
import fox.spiteful.avaritia.items.tools.ItemPickaxeInfinity;
import fox.spiteful.avaritia.items.tools.ItemSwordInfinity;
import fox.spiteful.avaritia.items.tools.ItemSwordSkulls;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.EnumHelper;

import static net.minecraft.item.Item.ToolMaterial;

public class LudicrousItems {

    public static Item resource;
    public static Item singularity;
    public static Item infinity_pickaxe;
    public static Item infinity_sword;
    public static Item skull_sword;

    public static Item akashic_record;
    public static Item armok_orb;

    public static EnumRarity cosmic = EnumHelper.addRarity("COSMIC", EnumChatFormatting.RED, "Cosmic");

    public static void grind(){
        resource = new ItemResource();
        GameRegistry.registerItem(resource, "Resource");
        singularity = new ItemSingularity();
        GameRegistry.registerItem(singularity, "Singularity");
        infinity_pickaxe = new ItemPickaxeInfinity();
        GameRegistry.registerItem(infinity_pickaxe, "Infinity_Pickaxe");
        infinity_sword = new ItemSwordInfinity();
        GameRegistry.registerItem(infinity_sword, "Infinity_Sword");
        skull_sword = new ItemSwordSkulls();
        GameRegistry.registerItem(skull_sword, "Skull_Sword");
    }
}