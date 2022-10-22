package de.mathisburger.mcheli.wrapper

import net.minecraft.client.Minecraft
import net.minecraft.client.multiplayer.PlayerControllerMP
import net.minecraft.client.renderer.EntityRenderer
import net.minecraft.client.renderer.ItemRenderer
import net.minecraft.client.renderer.entity.Render
import net.minecraft.client.renderer.entity.RenderManager
import net.minecraft.entity.Entity
import net.minecraft.item.ItemStack
import net.minecraft.network.NetworkManager
import net.minecraft.network.NetworkSystem
import net.minecraft.util.math.AxisAlignedBB
import net.minecraftforge.fml.common.ObfuscationReflectionHelper
import java.util.*


object Reflection {

    fun getRenderManager(render: Render<*>): RenderManager? {
        return try {
            ObfuscationReflectionHelper.getPrivateValue<Any, Render<*>>(
                // TODO: Find the name of this field
                Render::class.java, render, "renderManager"
            ) as RenderManager
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun restoreDefaultThirdPersonDistance() {
        thirdPersonDistance = 4.0f
    }

    var thirdPersonDistance: Float
        get() = try {
            val mc: Minecraft = Minecraft.getMinecraft()
            (ObfuscationReflectionHelper.getPrivateValue<Any, EntityRenderer>(
                EntityRenderer::class.java,
                mc.entityRenderer,
                "thirdPersonDistance"
            ) as Float).toFloat()
        } catch (e: Exception) {
            e.printStackTrace()
            4.0f
        }
        set(dist) {
            if (dist < 0.1) return
            try {
                val mc: Minecraft = Minecraft.getMinecraft()
                ObfuscationReflectionHelper.setPrivateValue(
                    EntityRenderer::class.java,
                    mc.entityRenderer,
                    java.lang.Float.valueOf(dist),
                    "thirdPersonDistance"
                )
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    fun setCameraRoll(roll: Float) {
        var roll = roll
        try {
            // TODO: Find out what this function is doing
            //roll = MathHelper.func_76142_g(roll)
            val mc: Minecraft = Minecraft.getMinecraft()
            ObfuscationReflectionHelper.setPrivateValue(
                EntityRenderer::class.java,
                Minecraft.getMinecraft().entityRenderer,
                java.lang.Float.valueOf(roll),
                "camRoll"
            )
            ObfuscationReflectionHelper.setPrivateValue(
                EntityRenderer::class.java,
                Minecraft.getMinecraft().entityRenderer,
                java.lang.Float.valueOf(roll),
                "prevCamRoll"
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    val prevCameraRoll: Float
        get() {
            return try {
                val mc: Minecraft = Minecraft.getMinecraft()
                (ObfuscationReflectionHelper.getPrivateValue<Any, EntityRenderer>(
                    EntityRenderer::class.java,
                    Minecraft.getMinecraft().entityRenderer,
                    "prevCamRoll"
                ) as Float).toFloat()
            } catch (e: Exception) {
                e.printStackTrace()
                0.0f
            }
        }

    fun restoreCameraZoom() {
        setCameraZoom(1.0f)
    }

    fun setCameraZoom(zoom: Float) {
        try {
            val mc: Minecraft = Minecraft.getMinecraft()
            ObfuscationReflectionHelper.setPrivateValue(
                EntityRenderer::class.java,
                mc.entityRenderer,
                java.lang.Float.valueOf(zoom),
                "cameraZoom"
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun setCreativeDigSpeed(n: Int) {
        try {
            val mc: Minecraft = Minecraft.getMinecraft()
            ObfuscationReflectionHelper.setPrivateValue(
                PlayerControllerMP::class.java,
                mc.playerController,
                Integer.valueOf(n),
                "blockHitDelay"
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    var itemRenderer: ItemRenderer?
        get() = (Minecraft.getMinecraft()).itemRenderer
        set(r) {
            try {
                // TODO: What is done here?
                val mc: Minecraft = Minecraft.getMinecraft()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    fun setItemRenderer_ItemToRender(itemToRender: ItemStack) {
        try {
            ObfuscationReflectionHelper.setPrivateValue<ItemRenderer, ItemStack>(
                ItemRenderer::class.java,
                itemRenderer, itemToRender, "itemToRender"
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    val itemRenderer_ItemToRender: ItemStack?
        get() {
            return try {
                ObfuscationReflectionHelper.getPrivateValue<Any, ItemRenderer>(
                    ItemRenderer::class.java, itemRenderer, "itemToRender"
                ) as ItemStack
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    fun setItemRendererProgress(equippedProgress: Float) {
        try {
            ObfuscationReflectionHelper.setPrivateValue<ItemRenderer, Float>(
                ItemRenderer::class.java,
                itemRenderer, java.lang.Float.valueOf(equippedProgress), "equippedProgress"
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun setBoundingBox(entity: Entity?, bb: AxisAlignedBB?) {
        try {
            ObfuscationReflectionHelper.setPrivateValue(
                Entity::class.java,
                entity,
                bb,
                "boundingBox"
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    val networkManagers: List<NetworkManager>
        get() {
            return listOf<NetworkManager>();
            // TODO: make this work again
            /**return try {
                ObfuscationReflectionHelper.getPrivateValue(
                    NetworkSystem::class.java,
                    MinecraftServer.func_71276_C().func_147137_ag(),
                    arrayOf("field_151272_f", "networkManagers")
                ) as List<*>
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }*/
        }

    fun getReceivedPacketsQueue(nm: NetworkManager): Queue<*>? {
        return try {
            ObfuscationReflectionHelper.getPrivateValue<Any, NetworkManager>(
                NetworkManager::class.java,
                nm,
                "receivedPacketsQueue"
            ) as Queue<*>?
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun getSendPacketsQueue(nm: NetworkManager): Queue<*>? {
        return try {
            ObfuscationReflectionHelper.getPrivateValue<Any, NetworkManager>(
                NetworkManager::class.java,
                nm,
                "outboundPacketsQueue"
            ) as Queue<*>
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
