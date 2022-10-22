package de.mathisburger.mcheli.wrapper

import com.google.common.io.ByteArrayDataInput
import com.google.common.io.ByteStreams
import io.netty.buffer.ByteBuf
import net.minecraftforge.fml.common.network.simpleimpl.IMessage

/**
 * An implementation of the @see IMessage interface
 */
class PacketBase : IMessage {

    private var data: ByteArrayDataInput? = null;

    /**
     * Creates default data
     */
    fun createData(): ByteArray {
        return ByteArray(0);
    }

    /**
     * Creates data from bytes
     */
    override fun fromBytes(buf: ByteBuf?) {
        var arraySize = ((buf?.array())?.size ?:1) -1;
        var dst = ByteArray(arraySize);
        buf?.getBytes(0, dst);
        this.data = ByteStreams.newDataInput(dst);
    }

    /**
     * Converts to bytes
     */
    override fun toBytes(buf: ByteBuf?) {
        buf?.writeBytes(this.createData());
    }
}
