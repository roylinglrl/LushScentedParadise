package net.royling.LushScentedParadise.Botania.BotaniaTeapot;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;


public class ManaTeapotScreen extends AbstractContainerScreen<ManaTeapotMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("lushscentedparadise","textures/gui/mana_teapot.png");
    public ManaTeapotScreen(ManaTeapotMenu menu, Inventory inventory, Component titile){
        super(menu,inventory,titile);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {
        RenderSystem.setShaderTexture(0,TEXTURE);
        int x = (this.width - this.imageWidth) / 2;
        int y = (this.height - this.imageHeight) / 2;
        guiGraphics.blit(TEXTURE, x, y, 0, 0, this.imageWidth, this.imageHeight);
        int progress = Math.min(this.menu.getBrewProgress(), 24);
        guiGraphics.blit(TEXTURE, x + 79, y + 34, 176, 0, progress, 16);
        int mana = Math.min(this.menu.getmana(),80);
        System.out.println("Mana:"+mana);
        guiGraphics.blit(TEXTURE,x+60,y+60,176,16,mana,3);
        this.renderTooltip(guiGraphics,i,i1);
    }
}
