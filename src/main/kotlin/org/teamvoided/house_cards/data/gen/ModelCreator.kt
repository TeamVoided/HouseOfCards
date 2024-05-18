package org.teamvoided.house_cards.data.gen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.model.BlockStateModelGenerator
import net.minecraft.data.client.model.Models
import org.teamvoided.house_cards.init.HoCItems

class ModelCreator(o: FabricDataOutput) : FabricModelProvider(o) {
    override fun generateBlockStateModels(gen: BlockStateModelGenerator) {

    }

    val items = listOf(
        HoCItems.TAB_ITEM,
        HoCItems.ACE_OF_SPADES,
        HoCItems.ACE_OF_HEARTS,
        HoCItems.BOOSTER_PACK,
    )

    override fun generateItemModels(gen: ItemModelGenerator) {
        items.forEach{
            gen.register(it,Models.SINGLE_LAYER_ITEM)
        }
    }
}