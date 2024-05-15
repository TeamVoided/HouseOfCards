package org.teamvoided.house_cards.data.gen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.model.BlockStateModelGenerator
import org.teamvoided.house_cards.init.HoCItems

class ModelCreator(o:FabricDataOutput): FabricModelProvider(o) {
    override fun generateBlockStateModels(gen: BlockStateModelGenerator) {

    }

    override fun generateItemModels(gen: ItemModelGenerator) {
        gen.register(HoCItems.TAB_ITEM)
        gen.register(HoCItems.ACE_OF_HEARTS)
        gen.register(HoCItems.ACE_OF_SPADES)
    }
}