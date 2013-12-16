package hm.jollychristmas;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

final class JCTab extends CreativeTabs
{
	JCTab(int par1, String par2Str)
	{
		super(par1, par2Str);
	}
	
	@SideOnly (Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return mod_JollyChristmas.Candycane.itemID;
	}
	
	public String getTranslatedTabLabel()
	{
		return "Jolly Ol' Christmas";
	}
}
