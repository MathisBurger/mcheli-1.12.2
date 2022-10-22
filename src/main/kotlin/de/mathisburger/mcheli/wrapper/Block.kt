package de.mathisburger.mcheli.wrapper

import net.minecraft.block.material.Material
import net.minecraft.block.Block
import net.minecraft.init.Blocks

abstract class Block protected constructor(material: Material) : Block(material) {
    companion object {

        fun getBlockFromName(name: String): Block? {
            return Block.getBlockFromName(name)
        }

        val snowLayer: Block
            get() = Blocks.SNOW_LAYER

        fun isNull(block: Block?): Boolean {
            return block == null || block === Blocks.AIR
        }

        fun isEqual(blockId: Int, block: Block): Boolean {
            return Block.isEqualTo(Block.getBlockById(blockId), block)
        }

        fun isEqual(block1: Block, block2: Block): Boolean {
            return Block.isEqualTo(block1, block2)
        }

        val water: Block
            get() = Blocks.WATER

        fun getBlockById(i: Int): Block {
            return Block.getBlockById(i)
        }
    }
}
