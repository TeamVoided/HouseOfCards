package org.teamvoided.house_cards.data

import net.minecraft.loot.LootTable
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import org.teamvoided.house_cards.HouseOfCards.id

object HoCLootTables {
    val BASIC_BOOSTER_PACK = register("basic_booster_pack")



    fun register(id: String): RegistryKey<LootTable> {
        return RegistryKey.of(RegistryKeys.LOOT_TABLE, id(id))
    }
}