package de.mathisburger.mcheli.wrapper

import io.netty.buffer.ByteBuf
import net.minecraftforge.fml.common.network.simpleimpl.IMessage

/**
 * Packet dummy that implements IMessage
 */
class PacketDummy : IMessage {
    override fun fromBytes(buf: ByteBuf?) {
    }

    override fun toBytes(buf: ByteBuf?) {
    }
}
