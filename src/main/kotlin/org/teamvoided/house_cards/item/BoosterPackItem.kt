package org.teamvoided.house_cards.item

import net.minecraft.entity.ItemEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.loot.LootTable
import net.minecraft.loot.context.LootContextParameterSet
import net.minecraft.loot.context.LootContextParameters
import net.minecraft.loot.context.LootContextTypes
import net.minecraft.registry.RegistryKey
import net.minecraft.server.world.ServerWorld
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.stat.Stats
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class BoosterPackItem(settings: Settings, val lootTable: RegistryKey<LootTable>) : Item(settings) {
    override fun use(world: World, user: PlayerEntity, hand: Hand): TypedActionResult<ItemStack> {

        val itemStack = user.getStackInHand(hand)
        world.playSound(
            null,
            user.x,
            user.y,
            user.z,
            SoundEvents.BLOCK_ENDER_CHEST_OPEN,
            SoundCategory.PLAYERS,
            0.5f,
            0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f)
        )
        if (!world.isClient) {
            val lootC = LootContextParameterSet.Builder(world as ServerWorld)
                .addOptional(LootContextParameters.THIS_ENTITY, user)
                .add(LootContextParameters.ORIGIN, user.pos)
                .build(LootContextTypes.CHEST)
            val lootTable = world.server.method_58576().getLootTable(lootTable)
            val items = lootTable.generateLoot(lootC)
            items.forEach dropper@{
                if (it.isEmpty) return@dropper
                val itemEntity = ItemEntity(world, user.x, user.y, user.z, it)
                world.spawnEntity(itemEntity)
            }
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this))
        itemStack.consume(1, user)
        return TypedActionResult.success(itemStack, world.isClient())
    }
}
