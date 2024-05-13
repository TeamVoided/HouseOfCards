package org.teamvoided.house_cards

import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Suppress("unused")
object HouseOfCards {
    const val MODID = "house_cards"

    @JvmField
    val log: Logger = LoggerFactory.getLogger(HouseOfCards::class.simpleName)

    fun commonInit() {
        log.info("Hello from Common")
    }

    fun clientInit() {
        log.info("Hello from Client")
    }

    fun id(path: String) = Identifier(MODID, path)
}
