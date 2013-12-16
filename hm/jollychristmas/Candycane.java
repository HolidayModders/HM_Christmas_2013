package hm.jollychristmas;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Candycane extends ItemFood
{
	public Candycane(int par1, int par2, float par3, boolean par4)
	{
		super(par1, par2, par3, par4);
		setCreativeTab(mod_JollyChristmas.JCTab);
	}
	
	public void registerIcons(IconRegister icon)
	{
		if(itemID==mod_JollyChristmas.Candycane.itemID)
		{
			this.itemIcon=icon.registerIcon("Candycane-Item");
		}
	}
}
