package org.teamvoided.house_cards.data.gen

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.minecraft.registry.RegistrySetBuilder
import org.teamvoided.house_cards.HouseOfCards.log
import org.teamvoided.house_cards.data.gen.EnTranslationProvider
import org.teamvoided.house_cards.data.gen.ModelCreator


@Suppress("unused")
class HouseOfCardsData : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(gen: FabricDataGenerator) {
        log.info("Hello from DataGen")
        val pack = gen.createPack()
        pack.addProvider(::ModelCreator)
        pack.addProvider(::EnTranslationProvider)
    }

    override fun buildRegistry(gen: RegistrySetBuilder) {
//        gen.add(RegistryKeys.BIOME, TemplateBiomes::boostrap)
    }
}
