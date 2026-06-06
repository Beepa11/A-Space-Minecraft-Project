package net.beepa11.backrooms.entity.client;

import net.beepa11.backrooms.Backrooms;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation HOWLER_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(Backrooms.MODID, "howler_layer"), "main");

    public static final ModelLayerLocation LIFEFORM_GEN_1_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(Backrooms.MODID, "lifeform_gen_1_layer"), "main");
}
