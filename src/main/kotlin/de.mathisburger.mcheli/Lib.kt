package de.mathisburger.mcheli

import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import java.text.SimpleDateFormat
import java.util.*


class Lib {
    companion object {
        fun parseDouble(s: String?): Double {
            return s?.replace(',', '.')?.toDouble() ?: 0.0
        }

        fun getTime(): String {
            val sdf = SimpleDateFormat("HH:mm:ss:SSS")
            return sdf.format(Date())
        }

        fun DbgLog(isRemote: Boolean, format: String?, vararg data: Any?) {
            if (Config.DebugLog) {
                val t: String = getTime()
                if (isRemote) {
                    var playerName: String = "null"
                    if (getClientPlayer() is EntityPlayer) playerName = (getClientPlayer() as EntityPlayer).displayName
                    println(String.format(format!!, *data))
                } else {
                    println(String.format(format!!, *data))
                }
            }
        }

        fun getClientPlayer(): Entity? {
            return McHeli.proxy.getClientPlayer()
        }
    }
}
