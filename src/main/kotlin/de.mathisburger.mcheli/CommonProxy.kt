package de.mathisburger.mcheli

import net.minecraft.entity.Entity
import net.minecraft.server.MinecraftServer
import net.minecraftforge.fml.common.FMLCommonHandler


class CommonProxy {
    var lastConfigFileName: String? = null
    val dataDir: String
        get() = MinecraftServer.USER_CACHE_FILE.absolutePath

    fun registerRenderer() {}
    fun registerBlockRenderer() {}
    fun registerModels() {}
    fun registerModelsHeli(name: String?, reload: Boolean) {}
    fun registerModelsPlane(name: String?, reload: Boolean) {}
    fun registerModelsVehicle(name: String?, reload: Boolean) {}
    fun registerModelsTank(name: String?, reload: Boolean) {}
    fun registerClientTick() {}
    fun registerServerTick() {
        FMLCommonHandler.instance().bus().register(ServerTickHandler())
    }

    val isRemote: Boolean
        get() = false

    fun side(): String {
        return "Server"
    }

    // TODO: Fill in with types
    fun CreateSoundUpdater(aircraft: Any?): Any? {
        return null
    }

    fun registerSounds() {}
    fun loadConfig(fileName: String?): Config {
        lastConfigFileName = fileName
        val config = Config("./", fileName)
        config.load()
        config.write()
        return config
    }

    fun reconfig(): Config {
        Lib.DbgLog(false, "MCH_CommonProxy.reconfig()", arrayOfNulls<Any>(0))
        return loadConfig(lastConfigFileName)
    }

    fun loadHUD(path: String?) {}
    fun reloadHUD() {}
    val clientPlayer: Entity?
        get() = null

    fun setCreativeDigDelay(n: Int) {}
    fun init() {}
    val isFirstPerson: Boolean
        get() = false
    val newRenderType: Int
        get() = -1
    val isSinglePlayer: Boolean
    // TODO: Implement if game is single player or not
        get() = false

    fun readClientModList() {}
    // TODO: Figure out what IChatComponent is in 1.12.2
    fun printChatMessage(chat: Any?, showTime: Int, pos: Int) {}
    fun hitBullet() {}
    fun clientLocked() {}
}
