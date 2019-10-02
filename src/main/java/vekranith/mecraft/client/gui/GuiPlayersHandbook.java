package vekranith.mecraft.client.gui;

import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import vekranith.mecraft.util.Reference;

public class GuiPlayersHandbook extends GuiScreen
{

	final ResourceLocation PHBTexture = new ResourceLocation(Reference.MODID, "textures/gui/playershandbook.png");
	int guiWidth = 145;
	int guiHeight = 178;
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) 
	{
	
		drawDefaultBackground();
		Minecraft.getMinecraft().renderEngine.bindTexture(PHBTexture);
		int centerX = (width / 2) - guiWidth / 2;
		int centerY = (height / 2) - guiHeight / 2;
		drawTexturedModalRect(centerX, centerY, 0, 0, guiWidth, guiHeight);
		drawCenteredString(fontRenderer, "Players Handbook", (width / 2), centerY + 11, 0xffffff);
		
		super.drawScreen(mouseX, mouseY, partialTicks);
		
	}
	
	@Override
	public void initGui() 
	{
	
		super.initGui();
	
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException 
	{
	
		super.actionPerformed(button);
	
	}
	
	@Override
	public boolean doesGuiPauseGame() 
	{
	
		return true;
	
	}
	
}
