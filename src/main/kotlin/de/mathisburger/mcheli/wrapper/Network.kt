package de.mathisburger.mcheli.wrapper

import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.entity.player.EntityPlayerMP
import net.minecraftforge.fml.common.network.NetworkRegistry
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint
import net.minecraftforge.fml.common.network.simpleimpl.IMessage


/**
 * Network object
 */
object Network {

    val INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("MCHeli_CH")

    /**
     * Sends information to server
     */
    fun sendToServer(pkt: PacketBase?) {
        INSTANCE.sendToServer(pkt as IMessage?)
    }

    /**
     * Sends information to player
     */
    fun sendToPlayer(pkt: PacketBase?, player: EntityPlayer?) {
        if (player is EntityPlayerMP) INSTANCE.sendTo(pkt as IMessage?, player as EntityPlayerMP?)
    }

    /**
     * Sends information to everything around
     */
    fun sendToAllAround(pkt: PacketBase?, sender: Entity, renge: Double) {
        val t =
            TargetPoint(sender.dimension, sender.posX, sender.posY, sender.posZ, renge)
        INSTANCE.sendToAllAround(pkt as IMessage?, t)
    }

    /**
     * Send information to all players
     */
    fun sendToAllPlayers(pkt: PacketBase?) {
        INSTANCE.sendToAll(pkt as IMessage?)
    }
}

