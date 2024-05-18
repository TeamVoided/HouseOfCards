package org.teamvoided.house_cards.init

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import org.teamvoided.house_cards.HouseOfCards.id

object HoCTabs {
    fun init() {
    }

    val HOUSE_OF_CARDS_TAB = register(
        "house_of_cards_tab",
        FabricItemGroup.builder()
            .icon {HoCItems.TAB_ITEM.defaultStack  }
            .name(Text.translatable("House of Cards"))
            .entries { _, entires ->
                entires.addStacks(
                    mutableSetOf(
                        HoCItems.BOOSTER_PACK.defaultStack,
                        HoCItems.ACE_OF_HEARTS.defaultStack,
                        HoCItems.ACE_OF_SPADES.defaultStack
                    )
                )
            }
            .build()
    )

    fun register(id: String, tab: ItemGroup): ItemGroup {
        return Registry.register(Registries.ITEM_GROUP, id(id), tab)
    }
}