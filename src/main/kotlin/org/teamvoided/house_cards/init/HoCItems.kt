package org.teamvoided.house_cards.init

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import org.teamvoided.house_cards.HouseOfCards.id

object HoCItems {
    fun init() {}
    val ACE_OF_SPADES = register("ace_of_spades", Item(Item.Settings()))
    val ACE_OF_HEARTS = register("ace_of_hearts", Item(Item.Settings()))
    val TAB_ITEM = register("tab_item", Item(Item.Settings()))
    fun register(id: String, item: Item): Item {
        return Registry.register(Registries.ITEM, id(id), item)
    }
}