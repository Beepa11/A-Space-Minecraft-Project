package net.beepa11.backrooms.shader;

import net.beepa11.backrooms.registry.BRBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class ModRenderTypes {

    public static void setup()
    {
        ItemBlockRenderTypes.setRenderLayer(BRBlocks.THRESHOLD_PORTAL.get(), RenderType.translucent());
    }

}
