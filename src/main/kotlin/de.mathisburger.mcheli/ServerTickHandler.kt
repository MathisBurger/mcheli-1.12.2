package de.mathisburger.mcheli

import de.mathisburger.mcheli.wrapper.Reflection
import net.minecraft.network.NetworkManager
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent
import net.minecraftforge.fml.common.gameevent.TickEvent.ServerTickEvent
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket
import java.util.*
import kotlin.collections.HashMap


class ServerTickHandler {
    var rcvMap = HashMap<String, Int?>()
    var sndMap = HashMap<String, Int?>()
    var sndPacketNum = 0
    var rcvPacketNum = 0
    var tick = 0
    @SubscribeEvent
    fun onServerTickEvent(event: ServerTickEvent) {
        if (event.phase == TickEvent.Phase.START);
        if (event.phase == TickEvent.Phase.END);
    }

    private fun onServerTickPre() {
        tick++
        val list: List<NetworkManager> = Reflection.networkManagers
        if (list != null) for (i in list.indices) {
            var queue = Reflection.getReceivedPacketsQueue(list[i])
            if (queue != null) {
                putMap(rcvMap, queue.iterator())
                rcvPacketNum += queue.size
            }
            queue = Reflection.getSendPacketsQueue(list[i])
            if (queue != null) {
                putMap(sndMap, queue.iterator())
                sndPacketNum += queue.size
            }
        }
        if (tick >= 20) {
            tick = 0
            sndPacketNum = 0
            rcvPacketNum = sndPacketNum
            rcvMap.clear()
            sndMap.clear()
        }
    }

    fun putMap(map: HashMap<String, Int?>, iterator: Iterator<*>) {
        while (iterator.hasNext()) {
            val o = iterator.next()!!
            var key = o.javaClass.name.toString()
            key = if (key.startsWith("net.minecraft.")) {
                "Minecraft"
            } else if (o is FMLProxyPacket) {
                o.channel()
            } else {
                "Unknown!"
            }
            if (map.containsKey(key)) {
                map[key] = Integer.valueOf(1 + map[key]!!.toInt())
                continue
            }
            map[key] = Integer.valueOf(1)
        }
    }

    private fun onServerTickPost() {}
}
