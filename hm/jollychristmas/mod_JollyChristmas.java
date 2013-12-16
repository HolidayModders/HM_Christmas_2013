package hm.jollychristmas;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = mod_JollyChristmas.modid, name = "Jolly Christmas", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_JollyChristmas
{
	public static final String modid = "JollyChristmas";
	
	/**Items**/
	public static Item Candycane;
	
	/**Tabs**/
	public static CreativeTabs JCTab;
	
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		Candycane=(new Candycane(3075, 2, 0.1F, false)).setAlwaysEdible().setPotionEffect(Potion.moveSpeed.id, 2, 1, 1.0F).setUnlocalizedName("Candycane");
		JCTab=new JCTab(CreativeTabs.getNextID(), "Jolly Ol' Christmas");
		/**Names**/
		LanguageRegistry.addName(Candycane, "Candycane");
	}
}