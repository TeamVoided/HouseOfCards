package org.teamvoided.house_cards

import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.teamvoided.house_cards.init.HoCItems
import org.teamvoided.house_cards.init.HoCTabs

@Suppress("unused")
object HouseOfCards {
    const val MODID = "house_cards"

    @JvmField
    val log: Logger = LoggerFactory.getLogger(HouseOfCards::class.simpleName)

    fun commonInit() {
        log.info("ass")
        HoCItems.init()
        HoCTabs.init()
    }

    fun clientInit() {
        log.info("penis")
    }

    fun id(path: String) = Identifier(MODID, path)
}
