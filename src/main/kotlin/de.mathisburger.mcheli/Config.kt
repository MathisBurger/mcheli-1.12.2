package de.mathisburger.mcheli

import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.DamageSource
import java.io.PrintWriter


class Config(minecraftPath: String, cfgFile: String) {
    val destroyBlockNames =
        "glass_pane, stained_glass_pane, tallgrass, double_plant, yellow_flower, red_flower, vine, wheat, reeds, waterlily"

    init {
        this
        mcPath = minecraftPath
        this
        this
        configFilePath = mcPath + cfgFile
        this
        DebugLog = false
        this
        configVer = "0.0.0"
        this
        bulletBreakableBlocks = ArrayList<Block>()
        this
        carBreakableBlocks = ArrayList<Block>()
        this
        carNoBreakableBlocks = ArrayList<Block>()
        this
        carBreakableMaterials = ArrayList<Material>()
        this
        tankBreakableBlocks = ArrayList<Block>()
        this
        tankNoBreakableBlocks = ArrayList<Block>()
        this
        tankBreakableMaterials = ArrayList<Material>()
        this
        KeyUp = MCH_ConfigPrm("KeyUp", 17)
        this
        KeyDown = MCH_ConfigPrm("KeyDown", 31)
        this
        KeyRight = MCH_ConfigPrm("KeyRight", 32)
        this
        KeyLeft = MCH_ConfigPrm("KeyLeft", 30)
        this
        KeySwitchMode = MCH_ConfigPrm("KeySwitchGunner", 35)
        this
        KeySwitchHovering = MCH_ConfigPrm("KeySwitchHovering", 57)
        this
        KeyAttack = MCH_ConfigPrm("KeyAttack", -100)
        this
        KeyUseWeapon = MCH_ConfigPrm("KeyUseWeapon", -99)
        this
        KeySwitchWeapon1 = MCH_ConfigPrm("KeySwitchWeapon1", -98)
        this
        KeySwitchWeapon2 = MCH_ConfigPrm("KeySwitchWeapon2", 34)
        this
        KeySwWeaponMode = MCH_ConfigPrm("KeySwitchWeaponMode", 45)
        this
        KeyZoom = MCH_ConfigPrm("KeyZoom", 44)
        this
        KeyCameraMode = MCH_ConfigPrm("KeyCameraMode", 46)
        this
        KeyUnmount = MCH_ConfigPrm("KeyUnmountMob", 21)
        this
        KeyFlare = MCH_ConfigPrm("KeyFlare", 47)
        this
        KeyExtra = MCH_ConfigPrm("KeyExtra", 33)
        this
        KeyCameraDistUp = MCH_ConfigPrm("KeyCameraDistanceUp", 201)
        this
        KeyCameraDistDown = MCH_ConfigPrm("KeyCameraDistanceDown", 209)
        this
        KeyFreeLook = MCH_ConfigPrm("KeyFreeLook", 29)
        this
        KeyGUI = MCH_ConfigPrm("KeyGUI", 19)
        this
        KeyGearUpDown = MCH_ConfigPrm("KeyGearUpDown", 48)
        this
        KeyPutToRack = MCH_ConfigPrm("KeyPutToRack", 36)
        this
        KeyDownFromRack = MCH_ConfigPrm("KeyDownFromRack", 22)
        this
        KeyScoreboard = MCH_ConfigPrm("KeyScoreboard", 38)
        this
        KeyMultiplayManager = MCH_ConfigPrm("KeyMultiplayManager", 50)
        this
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[0] = KeyUp
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[1] = KeyDown
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[2] = KeyRight
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[3] = KeyLeft
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[4] = KeySwitchMode
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[5] = KeySwitchHovering
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[6] = KeySwitchWeapon1
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[7] = KeySwitchWeapon2
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[8] = KeySwWeaponMode
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[9] = KeyZoom
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[10] = KeyCameraMode
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[11] = KeyUnmount
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[12] = KeyFlare
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[13] = KeyExtra
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[14] = KeyCameraDistUp
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[15] = KeyCameraDistDown
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[16] = KeyFreeLook
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[17] = KeyGUI
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[18] = KeyGearUpDown
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[19] = KeyPutToRack
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[20] = KeyDownFromRack
        this
        arrayOfNulls<MCH_ConfigPrm?>(23)[21] = KeyScoreboard
        this
        KeyConfig = arrayOf<MCH_ConfigPrm?>(
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, KeyMultiplayManager
        )
        this
        DamageVs = ArrayList<MCH_ConfigPrm>()
        this
        CommandPermission = ArrayList<MCH_ConfigPrm>()
        this
        CommandPermissionList = ArrayList<CommandPermission>()
        this
        IgnoreBulletHitList = ArrayList()
        this
        IgnoreBulletHitItem = MCH_ConfigPrm("IgnoreBulletHit", "")
        this
        TestMode = MCH_ConfigPrm("TestMode", false)
        this
        EnableCommand = MCH_ConfigPrm("EnableCommand", true)
        this
        PlaceableOnSpongeOnly = MCH_ConfigPrm("PlaceableOnSpongeOnly", false)
        this
        HideKeybind = MCH_ConfigPrm("HideKeybind", false)
        this
        ItemDamage = MCH_ConfigPrm("ItemDamage", true)
        this
        ItemFuel = MCH_ConfigPrm("ItemFuel", true)
        this
        AutoRepairHP = MCH_ConfigPrm("AutoRepairHP", 0.5)
        this
        Collision_DestroyBlock = MCH_ConfigPrm("Collision_DestroyBlock", true)
        this
        Explosion_DestroyBlock = MCH_ConfigPrm("Explosion_DestroyBlock", true)
        this
        Explosion_FlamingBlock = MCH_ConfigPrm("Explosion_FlamingBlock", true)
        this
        Collision_Car_BreakableBlock =
            MCH_ConfigPrm("Collision_Car_BreakableBlock", "double_plant, glass_pane,stained_glass_pane")
        this
        Collision_Car_NoBreakableBlock = MCH_ConfigPrm("Collision_Car_NoBreakBlock", "torch")
        this
        Collision_Car_BreakableMaterial =
            MCH_ConfigPrm("Collision_Car_BreakableMaterial", "cactus, cake, gourd, leaves, vine, plants")
        this
        Collision_Tank_BreakableBlock = MCH_ConfigPrm("Collision_Tank_BreakableBlock", "nether_brick_fence")
        this
        Collision_Tank_BreakableBlock.validVer = "1.0.0"
        this
        Collision_Tank_NoBreakableBlock = MCH_ConfigPrm("Collision_Tank_NoBreakBlock", "torch, glowstone")
        this
        Collision_Tank_BreakableMaterial = MCH_ConfigPrm(
            "Collision_Tank_BreakableMaterial",
            "cactus, cake, carpet, circuits, glass, gourd, leaves, vine, wood, plants"
        )
        this
        Collision_EntityDamage = MCH_ConfigPrm("Collision_EntityDamage", true)
        this
        Collision_EntityTankDamage = MCH_ConfigPrm("Collision_EntityTankDamage", false)
        this
        LWeaponAutoFire = MCH_ConfigPrm("LWeaponAutoFire", false)
        this
        DismountAll = MCH_ConfigPrm("DismountAll", false)
        this
        MountMinecartHeli = MCH_ConfigPrm("MountMinecartHeli", true)
        this
        MountMinecartPlane = MCH_ConfigPrm("MountMinecartPlane", true)
        this
        MountMinecartVehicle = MCH_ConfigPrm("MountMinecartVehicle", false)
        this
        MountMinecartTank = MCH_ConfigPrm("MountMinecartTank", true)
        this
        AutoThrottleDownHeli = MCH_ConfigPrm("AutoThrottleDownHeli", true)
        this
        AutoThrottleDownPlane = MCH_ConfigPrm("AutoThrottleDownPlane", false)
        this
        AutoThrottleDownTank = MCH_ConfigPrm("AutoThrottleDownTank", false)
        this
        DisableItemRender = MCH_ConfigPrm("DisableItemRender", 1)
        this
        DisableItemRender.desc = ";DisableItemRender = 0 ~ 3 (1 = Recommended)"
        this
        RenderDistanceWeight = MCH_ConfigPrm("RenderDistanceWeight", 10.0)
        this
        MobRenderDistanceWeight = MCH_ConfigPrm("MobRenderDistanceWeight", 1.0)
        this
        CreativeTabIcon = MCH_ConfigPrm("CreativeTabIconItem", "fuel")
        this
        CreativeTabIconHeli = MCH_ConfigPrm("CreativeTabIconHeli", "ah-64")
        this
        CreativeTabIconPlane = MCH_ConfigPrm("CreativeTabIconPlane", "f22a")
        this
        CreativeTabIconTank = MCH_ConfigPrm("CreativeTabIconTank", "merkava_mk4")
        this
        CreativeTabIconVehicle = MCH_ConfigPrm("CreativeTabIconVehicle", "mk15")
        this
        DisableShader = MCH_ConfigPrm("DisableShader", false)
        this
        AliveTimeOfCartridge = MCH_ConfigPrm("AliveTimeOfCartridge", 200)
        this
        InfinityAmmo = MCH_ConfigPrm("InfinityAmmo", false)
        this
        InfinityFuel = MCH_ConfigPrm("InfinityFuel", false)
        this
        HitMarkColor = MCH_ConfigPrm("HitMarkColor", "255, 255, 0, 0")
        this
        HitMarkColor.desc = ";HitMarkColor = Alpha, Red, Green, Blue"
        this
        SmoothShading = MCH_ConfigPrm("SmoothShading", true)
        this
        BulletBreakableBlock = MCH_ConfigPrm(
            "BulletBreakableBlocks",
            "glass_pane, stained_glass_pane, tallgrass, double_plant, yellow_flower, red_flower, vine, wheat, reeds, waterlily"
        )
        this
        BulletBreakableBlock.validVer = "0.10.4"
        this
        EnableModEntityRender = MCH_ConfigPrm("EnableModEntityRender", true)
        this
        DisableRenderLivingSpecials = MCH_ConfigPrm("DisableRenderLivingSpecials", true)
        this
        PreventingBroken = MCH_ConfigPrm("PreventingBroken", false)
        this
        DropItemInCreativeMode = MCH_ConfigPrm("DropItemInCreativeMode", false)
        this
        BreakableOnlyPickaxe = MCH_ConfigPrm("BreakableOnlyPickaxe", false)
        this
        InvertMouse = MCH_ConfigPrm("InvertMouse", false)
        this
        MouseSensitivity = MCH_ConfigPrm("MouseSensitivity", 10.0)
        this
        MouseControlStickModeHeli = MCH_ConfigPrm("MouseControlStickModeHeli", false)
        this
        MouseControlStickModePlane = MCH_ConfigPrm("MouseControlStickModePlane", false)
        this
        MouseControlFlightSimMode = MCH_ConfigPrm("MouseControlFlightSimMode", false)
        this
        MouseControlFlightSimMode.desc = ";MouseControlFlightSimMode = true ( Yaw:key, Roll=mouse )"
        this
        SwitchWeaponWithMouseWheel = MCH_ConfigPrm("SwitchWeaponWithMouseWheel", true)
        this
        AllHeliSpeed = MCH_ConfigPrm("AllHeliSpeed", 1.0)
        this
        AllPlaneSpeed = MCH_ConfigPrm("AllPlaneSpeed", 1.0)
        this
        AllTankSpeed = MCH_ConfigPrm("AllTankSpeed", 1.0)
        this
        HurtResistantTime = MCH_ConfigPrm("HurtResistantTime", 0.0)
        this
        DisplayHUDThirdPerson = MCH_ConfigPrm("DisplayHUDThirdPerson", false)
        this
        DisableCameraDistChange = MCH_ConfigPrm("DisableThirdPersonCameraDistChange", false)
        this
        EnableReplaceTextureManager = MCH_ConfigPrm("EnableReplaceTextureManager", true)
        this
        DisplayEntityMarker = MCH_ConfigPrm("DisplayEntityMarker", true)
        this
        DisplayMarkThroughWall = MCH_ConfigPrm("DisplayMarkThroughWall", true)
        this
        EntityMarkerSize = MCH_ConfigPrm("EntityMarkerSize", 10.0)
        this
        BlockMarkerSize = MCH_ConfigPrm("BlockMarkerSize", 10.0)
        this
        ReplaceRenderViewEntity = MCH_ConfigPrm("ReplaceRenderViewEntity", true)
        this
        StingerLockRange = MCH_ConfigPrm("StingerLockRange", 320.0)
        this
        StingerLockRange.validVer = "1.0.0"
        this
        DefaultExplosionParticle = MCH_ConfigPrm("DefaultExplosionParticle", false)
        this
        RangeFinderSpotDist = MCH_ConfigPrm("RangeFinderSpotDist", 400)
        this
        RangeFinderSpotTime = MCH_ConfigPrm("RangeFinderSpotTime", 15)
        this
        RangeFinderConsume = MCH_ConfigPrm("RangeFinderConsume", true)
        this
        EnablePutRackInFlying = MCH_ConfigPrm("EnablePutRackInFlying", true)
        this
        EnableDebugBoundingBox = MCH_ConfigPrm("EnableDebugBoundingBox", true)
        this
        hitMarkColorAlpha = 1.0f
        this
        hitMarkColorRGB = 16711680
        this
        ItemRecipe_Fuel = MCH_ConfigPrm("ItemRecipe_Fuel", "\"ICI\", \"III\", I, iron_ingot, C, coal")
        this
        ItemRecipe_GLTD = MCH_ConfigPrm(
            "ItemRecipe_GLTD",
            "\" B \", \"IDI\", \"IRI\", B, iron_block, I, iron_ingot, D, diamond, R, redstone"
        )
        this
        ItemRecipe_Chain = MCH_ConfigPrm("ItemRecipe_Chain", "\"I I\", \"III\", \"I I\", I, iron_ingot")
        this
        ItemRecipe_Parachute = MCH_ConfigPrm("ItemRecipe_Parachute", "\"WWW\", \"S S\", \" W \", W, wool, S, string")
        this
        ItemRecipe_Container = MCH_ConfigPrm("ItemRecipe_Container", "\"CCI\", C, chest, I, iron_ingot")
        this
        ItemRecipe_UavStation = arrayOf<MCH_ConfigPrm>(
            MCH_ConfigPrm(
                "ItemRecipe_UavStation",
                "\"III\", \"IDI\", \"IRI\", I, iron_ingot, D, diamond, R, redstone_block"
            ), MCH_ConfigPrm("ItemRecipe_UavStation2", "\"IDI\", \"IRI\", I, iron_ingot, D, diamond, R, redstone")
        )
        this
        ItemRecipe_DraftingTable = MCH_ConfigPrm(
            "ItemRecipe_DraftingTable",
            "\"R  \", \"PCP\", \"F F\", R, redstone, C, crafting_table, P, planks, F, fence"
        )
        this
        ItemRecipe_Wrench = MCH_ConfigPrm("ItemRecipe_Wrench", "\" I \", \" II\", \"I  \", I, iron_ingot")
        this
        ItemRecipe_RangeFinder =
            MCH_ConfigPrm("ItemRecipe_RangeFinder", "\"III\", \"RGR\", \"III\", I, iron_ingot, G, glass, R, redstone")
        this
        ItemRecipe_Stinger =
            MCH_ConfigPrm("ItemRecipe_Stinger", "\"G  \", \"III\", \"RI \", G, glass, I, iron_ingot, R, redstone")
        this
        ItemRecipe_StingerMissile = MCH_ConfigPrm(
            "ItemRecipe_StingerMissile",
            "\"R  \", \" I \", \"  G\", G, gunpowder, I, iron_ingot, R, redstone"
        )
        this
        ItemRecipe_Javelin =
            MCH_ConfigPrm("ItemRecipe_Javelin", "\"III\", \"GR \", G, glass, I, iron_ingot, R, redstone")
        this
        ItemRecipe_JavelinMissile = MCH_ConfigPrm(
            "ItemRecipe_JavelinMissile",
            "\" R \", \" I \", \" G \", G, gunpowder, I, iron_ingot, R, redstone"
        )
        this
        ItemID_GLTD = MCH_ConfigPrm("ItemID_GLTD", 28799)
        this
        ItemID_Chain = MCH_ConfigPrm("ItemID_Chain", 28798)
        this
        ItemID_Parachute = MCH_ConfigPrm("ItemID_Parachute", 28797)
        this
        ItemID_Container = MCH_ConfigPrm("ItemID_Container", 28796)
        this
        ItemID_UavStation = arrayOf<MCH_ConfigPrm>(
            MCH_ConfigPrm("ItemID_UavStation", 28795),
            MCH_ConfigPrm("ItemID_UavStation2", 28790)
        )
        this
        ItemID_InvisibleItem = MCH_ConfigPrm("ItemID_Internal", 28794)
        this
        ItemID_Fuel = MCH_ConfigPrm("ItemID_Fuel", 28793)
        this
        ItemID_DraftingTable = MCH_ConfigPrm("ItemID_DraftingTable", 28792)
        this
        ItemID_Wrench = MCH_ConfigPrm("ItemID_Wrench", 28791)
        this
        ItemID_RangeFinder = MCH_ConfigPrm("ItemID_RangeFinder", 28789)
        this
        ItemID_Stinger = MCH_ConfigPrm("ItemID_Stinger", 28900)
        this
        ItemID_StingerMissile = MCH_ConfigPrm("ItemID_StingerMissile", 28901)
        this
        BlockID_DraftingTableOFF = MCH_ConfigPrm("BlockID_DraftingTable", 3450)
        this
        BlockID_DraftingTableON = MCH_ConfigPrm("BlockID_DraftingTableON", 3451)
        this
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[0] = TestMode
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[1] = EnableCommand
        arrayOfNulls<MCH_ConfigPrm?>(86)[2] = null
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[3] = PlaceableOnSpongeOnly
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[4] = ItemDamage
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[5] = ItemFuel
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[6] = AutoRepairHP
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[7] = Explosion_DestroyBlock
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[8] = Explosion_FlamingBlock
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[9] = BulletBreakableBlock
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[10] = Collision_DestroyBlock
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[11] = Collision_Car_BreakableBlock
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[12] = Collision_Car_BreakableMaterial
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[13] = Collision_Tank_BreakableBlock
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[14] = Collision_Tank_BreakableMaterial
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[15] = Collision_EntityDamage
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[16] = Collision_EntityTankDamage
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[17] = InfinityAmmo
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[18] = InfinityFuel
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[19] = DismountAll
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[20] = MountMinecartHeli
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[21] = MountMinecartPlane
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[22] = MountMinecartVehicle
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[23] = MountMinecartTank
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[24] = PreventingBroken
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[25] = DropItemInCreativeMode
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[26] = BreakableOnlyPickaxe
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[27] = AllHeliSpeed
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[28] = AllPlaneSpeed
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[29] = AllTankSpeed
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[30] = HurtResistantTime
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[31] = StingerLockRange
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[32] = RangeFinderSpotDist
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[33] = RangeFinderSpotTime
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[34] = RangeFinderConsume
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[35] = EnablePutRackInFlying
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[36] = EnableDebugBoundingBox
        arrayOfNulls<MCH_ConfigPrm?>(86)[37] = null
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[38] = InvertMouse
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[39] = MouseSensitivity
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[40] = MouseControlStickModeHeli
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[41] = MouseControlStickModePlane
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[42] = MouseControlFlightSimMode
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[43] = AutoThrottleDownHeli
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[44] = AutoThrottleDownPlane
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[45] = AutoThrottleDownTank
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[46] = SwitchWeaponWithMouseWheel
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[47] = LWeaponAutoFire
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[48] = DisableItemRender
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[49] = HideKeybind
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[50] = RenderDistanceWeight
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[51] = MobRenderDistanceWeight
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[52] = CreativeTabIcon
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[53] = CreativeTabIconHeli
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[54] = CreativeTabIconPlane
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[55] = CreativeTabIconTank
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[56] = CreativeTabIconVehicle
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[57] = DisableShader
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[58] = DefaultExplosionParticle
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[59] = AliveTimeOfCartridge
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[60] = HitMarkColor
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[61] = SmoothShading
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[62] = EnableModEntityRender
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[63] = DisableRenderLivingSpecials
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[64] = DisplayHUDThirdPerson
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[65] = DisableCameraDistChange
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[66] = EnableReplaceTextureManager
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[67] = DisplayEntityMarker
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[68] = EntityMarkerSize
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[69] = BlockMarkerSize
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[70] = ReplaceRenderViewEntity
        arrayOfNulls<MCH_ConfigPrm?>(86)[71] = null
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[72] = ItemRecipe_Fuel
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[73] = ItemRecipe_GLTD
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[74] = ItemRecipe_Chain
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[75] = ItemRecipe_Parachute
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[76] = ItemRecipe_Container
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[77] = ItemRecipe_UavStation[0]
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[78] = ItemRecipe_UavStation[1]
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[79] = ItemRecipe_DraftingTable
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[80] = ItemRecipe_Wrench
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[81] = ItemRecipe_RangeFinder
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[82] = ItemRecipe_Stinger
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[83] = ItemRecipe_StingerMissile
        this
        arrayOfNulls<MCH_ConfigPrm?>(86)[84] = ItemRecipe_Javelin
        this
        General = arrayOf<MCH_ConfigPrm?>(
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, ItemRecipe_JavelinMissile
        )
        this
        DamageVsEntity = DamageFactor(this, "DamageVsEntity")
        this
        DamageVsLiving = DamageFactor(this, "DamageVsLiving")
        this
        DamageVsPlayer = DamageFactor(this, "DamageVsPlayer")
        this
        DamageVsMCHeliAircraft = DamageFactor(this, "DamageVsMCHeliAircraft")
        this
        DamageVsMCHeliTank = DamageFactor(this, "DamageVsMCHeliTank")
        this
        DamageVsMCHeliVehicle = DamageFactor(this, "DamageVsMCHeliVehicle")
        this
        DamageVsMCHeliOther = DamageFactor(this, "DamageVsMCHeliOther")
        this
        DamageAircraftByExternal = DamageFactor(this, "DamageMCHeliAircraftByExternal")
        this
        DamageTankByExternal = DamageFactor(this, "DamageMCHeliTankByExternal")
        this
        DamageVehicleByExternal = DamageFactor(this, "DamageMCHeliVehicleByExternal")
        this
        DamageOtherByExternal = DamageFactor(this, "DamageMCHeliOtherByExternal")
        this
        this
        arrayOfNulls<DamageFactor?>(11)[0] = DamageVsEntity
        this
        arrayOfNulls<DamageFactor?>(11)[1] = DamageVsLiving
        this
        arrayOfNulls<DamageFactor?>(11)[2] = DamageVsPlayer
        this
        arrayOfNulls<DamageFactor?>(11)[3] = DamageVsMCHeliAircraft
        this
        arrayOfNulls<DamageFactor?>(11)[4] = DamageVsMCHeliTank
        this
        arrayOfNulls<DamageFactor?>(11)[5] = DamageVsMCHeliVehicle
        this
        arrayOfNulls<DamageFactor?>(11)[6] = DamageVsMCHeliOther
        this
        arrayOfNulls<DamageFactor?>(11)[7] = DamageAircraftByExternal
        this
        arrayOfNulls<DamageFactor?>(11)[8] = DamageTankByExternal
        this
        arrayOfNulls<DamageFactor?>(11)[9] = DamageVehicleByExternal
        this
        DamageFactorList = arrayOf<DamageFactor?>(
            null, null, null, null, null, null, null, null, null, null,
            DamageOtherByExternal
        )
    }

    fun setBlockListFromString(list: MutableList<Block>, str: String) {
        list.clear()
        val s = str.split("\\s*,\\s*".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (blockName in s) {
            val b: Block = W_Block.getBlockFromName(blockName)
            if (b != null) list.add(b)
        }
    }

    fun setMaterialListFromString(list: MutableList<Material>, str: String) {
        list.clear()
        val s = str.split("\\s*,\\s*".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (name in s) {
            val m: Material = MCH_Lib.getMaterialFromName(name)
            if (m != null) list.add(m)
        }
    }

    fun correctionParameter() {
        this
        val s: Array<String> = HitMarkColor.prmString.split("\\s*,\\s*")
        if (s.size == 4) {
            this
            hitMarkColorAlpha = toInt255(s[0]) / 255.0f
            this
            hitMarkColorRGB = toInt255(s[1]) shl 16 or (toInt255(s[2]) shl 8) or toInt255(s[3])
        }
        this
        this
        AllHeliSpeed.prmDouble = MCH_Lib.RNG(AllHeliSpeed.prmDouble, 0.0, 1000.0)
        this
        this
        AllPlaneSpeed.prmDouble = MCH_Lib.RNG(AllPlaneSpeed.prmDouble, 0.0, 1000.0)
        this
        this
        AllTankSpeed.prmDouble = MCH_Lib.RNG(AllTankSpeed.prmDouble, 0.0, 1000.0)
        this
        setBlockListFromString(bulletBreakableBlocks, BulletBreakableBlock.prmString)
        this
        setBlockListFromString(carBreakableBlocks, Collision_Car_BreakableBlock.prmString)
        this
        setBlockListFromString(carNoBreakableBlocks, Collision_Car_NoBreakableBlock.prmString)
        this
        setMaterialListFromString(carBreakableMaterials, Collision_Car_BreakableMaterial.prmString)
        this
        setBlockListFromString(tankBreakableBlocks, Collision_Tank_BreakableBlock.prmString)
        this
        setBlockListFromString(tankNoBreakableBlocks, Collision_Tank_NoBreakableBlock.prmString)
        this
        setMaterialListFromString(tankBreakableMaterials, Collision_Tank_BreakableMaterial.prmString)
        this
        if (EntityMarkerSize.prmDouble < 0.0) {
            this
            EntityMarkerSize.prmDouble = 0.0
        }
        this
        if (BlockMarkerSize.prmDouble < 0.0) {
            this
            BlockMarkerSize.prmDouble = 0.0
        }
        if (HurtResistantTime.prmDouble < 0.0) HurtResistantTime.prmDouble = 0.0
        if (HurtResistantTime.prmDouble > 10000.0) HurtResistantTime.prmDouble = 10000.0
        if (MobRenderDistanceWeight.prmDouble < 0.1) {
            MobRenderDistanceWeight.prmDouble = 0.1
        } else if (MobRenderDistanceWeight.prmDouble > 10.0) {
            MobRenderDistanceWeight.prmDouble = 10.0
        }
        for (p in CommandPermission) {
            val cpm = CommandPermission(this, p.prmString)
            if (!cpm.name.isEmpty()) CommandPermissionList.add(cpm)
        }
        this
        if (IgnoreBulletHitList.size <= 0) {
            this
            IgnoreBulletHitList.add("flansmod.common.guns.EntityBullet")
            this
            IgnoreBulletHitList.add("flansmod.common.guns.EntityGrenade")
        }
        val isNoDamageVsSetting = DamageVs.size <= 0
        for (p in DamageVs) {
            this
            for (df in DamageFactorList) {
                if (p.name.equals(df.itemName)) df.list.add(newDamageEntity(p.prmString))
            }
        }
        this
        for (df in DamageFactorList) {
            if (df.list.size() <= 0) {
                DamageVs.add(MCH_ConfigPrm(df.itemName, "1.0"))
            } else {
                var foundCommon = false
                for (n in df.list) {
                    if (n.name.isEmpty()) {
                        foundCommon = true
                        break
                    }
                }
                if (!foundCommon) DamageVs.add(MCH_ConfigPrm(df.itemName, "1.0"))
            }
        }
        if (isNoDamageVsSetting) {
            DamageVs.add(MCH_ConfigPrm("DamageVsEntity", "3.0, flansmod"))
            DamageVs.add(MCH_ConfigPrm("DamageMCHeliAircraftByExternal", "0.5, flansmod"))
            DamageVs.add(MCH_ConfigPrm("DamageMCHeliVehicleByExternal", "0.5, flansmod"))
        }
    }

    fun newDamageEntity(s: String): DamageEntity {
        val splt = s.split("\\s*,\\s*".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        if (splt.size == 1) return DamageEntity(this, splt[0].toDouble(), "")
        return if (splt.size == 2) DamageEntity(this, splt[0].toDouble(), splt[1]) else DamageEntity(this, 1.0, "")
    }

    fun toInt255(s: String?): Int {
        val a = Integer.valueOf(s).toInt()
        return if (a < 0) 0 else if (a > 255) 255 else a
    }

    fun load() {
        val file = MCH_InputFile()
        this
        if (file.open(configFilePath)) {
            var str: String = file.readLine()
            while (str != null) {
                if (str.trim { it <= ' ' }.equals("McHeliOutputDebugLog", ignoreCase = true)) {
                    this
                    DebugLog = true
                } else {
                    readConfigData(str)
                }
                str = file.readLine()
            }
            file.close()
            MCH_Lib.Log("loaded " + file.file.getAbsolutePath(), arrayOfNulls<Any>(0))
        } else {
            this
            MCH_Lib.Log("" + File(configFilePath).getAbsolutePath() + " not found.", arrayOfNulls<Any>(0))
        }
        correctionParameter()
    }

    private fun readConfigData(str: String) {
        val s = str.split("=".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        if (s.size != 2) return
        s[0] = s[0].trim { it <= ' ' }
        s[1] = s[1].trim { it <= ' ' }
        if (s[0].equals("MOD_Version", ignoreCase = true)) {
            this
            configVer = s[1]
            return
        }
        if (s[0].equals("CommandPermission", ignoreCase = true)) CommandPermission.add(
            MCH_ConfigPrm(
                "CommandPermission",
                s[1]
            )
        )
        this
        for (item in DamageFactorList) {
            if (item.itemName.equalsIgnoreCase(s[0])) {
                this
                DamageVs.add(MCH_ConfigPrm(item.itemName, s[1]))
            }
        }
        this
        if (IgnoreBulletHitItem.compare(s[0])) {
            this
            IgnoreBulletHitList.add(s[1])
        }
        this
        for (p in KeyConfig) {
            this
            if (p != null && p.compare(s[0]) && p.isValidVer(configVer)) {
                p.setPrm(s[1])
                return
            }
        }
        this
        for (p in General) {
            this
            if (p != null && p.compare(s[0]) && p.isValidVer(configVer)) {
                p.setPrm(s[1])
                return
            }
        }
    }

    fun write() {
        val file = MCH_OutputFile()
        this
        if (file.open(configFilePath)) {
            writeConfigData(file.pw)
            file.close()
            MCH_Lib.Log("update " + file.file.getAbsolutePath(), arrayOfNulls<Any>(0))
        } else {
            this
            MCH_Lib.Log("" + File(configFilePath).getAbsolutePath() + " cannot open.", arrayOfNulls<Any>(0))
        }
    }

    private fun writeConfigData(pw: PrintWriter) {
        pw.println("[General]")
        pw.println("MOD_Name = mcheli")
        pw.println("MOD_Version = " + MCH_MOD.VER)
        pw.println("MOD_MC_Version = 1.7.10")
        pw.println()
        this
        if (DebugLog) {
            pw.println("McHeliOutputDebugLog")
            pw.println()
        }
        this
        for (p in General) {
            if (p != null) {
                if (!p.desc.isEmpty()) pw.println(p.desc)
                pw.println(p.name + " = " + p)
            } else {
                pw.println("")
            }
        }
        pw.println()
        this
        for (p in DamageVs) pw.println(p.name + " = " + p)
        pw.println()
        this
        for (s in IgnoreBulletHitList) {
            this
            pw.println(IgnoreBulletHitItem.name + " = " + s)
        }
        pw.println()
        pw.println(";CommandPermission = commandName(eg, modlist, status, fill...):playerName1, playerName2, playerName3...")
        this
        if (CommandPermission.size == 0) {
            pw.println(";CommandPermission = modlist :example1, example2")
            pw.println(";CommandPermission = status :  example2")
        }
        this
        for (p in CommandPermission) pw.println(p.name + " = " + p)
        pw.println()
        pw.println()
        pw.println("[Key config]")
        pw.println("http://minecraft.gamepedia.com/Key_codes")
        pw.println()
        this
        for (p in KeyConfig) pw.println(p.name + " = " + p)
    }

    companion object {
        var mcPath: String
        var configFilePath: String
        var DebugLog: Boolean
        var configVer: String
        var hitMarkColorRGB: Int
        var hitMarkColorAlpha: Float
        var bulletBreakableBlocks: MutableList<Block>
        val dummyBreakableBlocks: List<Block> = ArrayList<Block>()
        val dummyBreakableMaterials: List<Material> = ArrayList<Material>()
        var carNoBreakableBlocks: MutableList<Block>
        var carBreakableBlocks: MutableList<Block>
        var carBreakableMaterials: MutableList<Material>
        var tankNoBreakableBlocks: MutableList<Block>
        var tankBreakableBlocks: MutableList<Block>
        var tankBreakableMaterials: MutableList<Material>
        var KeyUp: MCH_ConfigPrm
        var KeyDown: MCH_ConfigPrm
        var KeyRight: MCH_ConfigPrm
        var KeyLeft: MCH_ConfigPrm
        var KeySwitchMode: MCH_ConfigPrm
        var KeySwitchHovering: MCH_ConfigPrm
        var KeyAttack: MCH_ConfigPrm
        var KeyUseWeapon: MCH_ConfigPrm
        var KeySwitchWeapon1: MCH_ConfigPrm
        var KeySwitchWeapon2: MCH_ConfigPrm
        var KeySwWeaponMode: MCH_ConfigPrm
        var KeyZoom: MCH_ConfigPrm
        var KeyCameraMode: MCH_ConfigPrm
        var KeyUnmount: MCH_ConfigPrm
        var KeyFlare: MCH_ConfigPrm
        var KeyExtra: MCH_ConfigPrm
        var KeyCameraDistUp: MCH_ConfigPrm
        var KeyCameraDistDown: MCH_ConfigPrm
        var KeyFreeLook: MCH_ConfigPrm
        var KeyGUI: MCH_ConfigPrm
        var KeyGearUpDown: MCH_ConfigPrm
        var KeyPutToRack: MCH_ConfigPrm
        var KeyDownFromRack: MCH_ConfigPrm
        var KeyScoreboard: MCH_ConfigPrm
        var KeyMultiplayManager: MCH_ConfigPrm
        var DamageVs: MutableList<MCH_ConfigPrm>
        var IgnoreBulletHitList: MutableList<String>
        var IgnoreBulletHitItem: MCH_ConfigPrm
        var DamageFactorList: Array<DamageFactor?>
        var DamageVsEntity: DamageFactor
        var DamageVsLiving: DamageFactor
        var DamageVsPlayer: DamageFactor
        var DamageVsMCHeliAircraft: DamageFactor
        var DamageVsMCHeliTank: DamageFactor
        var DamageVsMCHeliVehicle: DamageFactor
        var DamageVsMCHeliOther: DamageFactor
        var DamageAircraftByExternal: DamageFactor
        var DamageTankByExternal: DamageFactor
        var DamageVehicleByExternal: DamageFactor
        var DamageOtherByExternal: DamageFactor
        var CommandPermission: MutableList<MCH_ConfigPrm>
        var CommandPermissionList: MutableList<CommandPermission>
        var TestMode: MCH_ConfigPrm
        var EnableCommand: MCH_ConfigPrm
        var PlaceableOnSpongeOnly: MCH_ConfigPrm
        var HideKeybind: MCH_ConfigPrm
        var ItemDamage: MCH_ConfigPrm
        var ItemFuel: MCH_ConfigPrm
        var AutoRepairHP: MCH_ConfigPrm
        var Collision_DestroyBlock: MCH_ConfigPrm
        var Explosion_DestroyBlock: MCH_ConfigPrm
        var Explosion_FlamingBlock: MCH_ConfigPrm
        var BulletBreakableBlock: MCH_ConfigPrm
        var Collision_Car_BreakableBlock: MCH_ConfigPrm
        var Collision_Car_NoBreakableBlock: MCH_ConfigPrm
        var Collision_Car_BreakableMaterial: MCH_ConfigPrm
        var Collision_Tank_BreakableBlock: MCH_ConfigPrm
        var Collision_Tank_NoBreakableBlock: MCH_ConfigPrm
        var Collision_Tank_BreakableMaterial: MCH_ConfigPrm
        var Collision_EntityDamage: MCH_ConfigPrm
        var Collision_EntityTankDamage: MCH_ConfigPrm
        var LWeaponAutoFire: MCH_ConfigPrm
        var DismountAll: MCH_ConfigPrm
        var MountMinecartHeli: MCH_ConfigPrm
        var MountMinecartPlane: MCH_ConfigPrm
        var MountMinecartVehicle: MCH_ConfigPrm
        var MountMinecartTank: MCH_ConfigPrm
        var AutoThrottleDownHeli: MCH_ConfigPrm
        var AutoThrottleDownPlane: MCH_ConfigPrm
        var AutoThrottleDownTank: MCH_ConfigPrm
        var DisableItemRender: MCH_ConfigPrm
        var RenderDistanceWeight: MCH_ConfigPrm
        var MobRenderDistanceWeight: MCH_ConfigPrm
        var CreativeTabIcon: MCH_ConfigPrm
        var CreativeTabIconHeli: MCH_ConfigPrm
        var CreativeTabIconPlane: MCH_ConfigPrm
        var CreativeTabIconTank: MCH_ConfigPrm
        var CreativeTabIconVehicle: MCH_ConfigPrm
        var DisableShader: MCH_ConfigPrm
        var AliveTimeOfCartridge: MCH_ConfigPrm
        var InfinityAmmo: MCH_ConfigPrm
        var InfinityFuel: MCH_ConfigPrm
        var HitMarkColor: MCH_ConfigPrm
        var SmoothShading: MCH_ConfigPrm
        var EnableModEntityRender: MCH_ConfigPrm
        var DisableRenderLivingSpecials: MCH_ConfigPrm
        var PreventingBroken: MCH_ConfigPrm
        var DropItemInCreativeMode: MCH_ConfigPrm
        var BreakableOnlyPickaxe: MCH_ConfigPrm
        var InvertMouse: MCH_ConfigPrm
        var MouseSensitivity: MCH_ConfigPrm
        var MouseControlStickModeHeli: MCH_ConfigPrm
        var MouseControlStickModePlane: MCH_ConfigPrm
        var MouseControlFlightSimMode: MCH_ConfigPrm
        var SwitchWeaponWithMouseWheel: MCH_ConfigPrm
        var AllPlaneSpeed: MCH_ConfigPrm
        var AllHeliSpeed: MCH_ConfigPrm
        var AllTankSpeed: MCH_ConfigPrm
        var HurtResistantTime: MCH_ConfigPrm
        var DisplayHUDThirdPerson: MCH_ConfigPrm
        var DisableCameraDistChange: MCH_ConfigPrm
        var EnableReplaceTextureManager: MCH_ConfigPrm
        var DisplayEntityMarker: MCH_ConfigPrm
        var EntityMarkerSize: MCH_ConfigPrm
        var BlockMarkerSize: MCH_ConfigPrm
        var DisplayMarkThroughWall: MCH_ConfigPrm
        var ReplaceRenderViewEntity: MCH_ConfigPrm
        var StingerLockRange: MCH_ConfigPrm
        var DefaultExplosionParticle: MCH_ConfigPrm
        var RangeFinderSpotDist: MCH_ConfigPrm
        var RangeFinderSpotTime: MCH_ConfigPrm
        var RangeFinderConsume: MCH_ConfigPrm
        var EnablePutRackInFlying: MCH_ConfigPrm
        var EnableDebugBoundingBox: MCH_ConfigPrm
        var ItemID_Fuel: MCH_ConfigPrm
        var ItemID_GLTD: MCH_ConfigPrm
        var ItemID_Chain: MCH_ConfigPrm
        var ItemID_Parachute: MCH_ConfigPrm
        var ItemID_Container: MCH_ConfigPrm
        var ItemID_Stinger: MCH_ConfigPrm
        var ItemID_StingerMissile: MCH_ConfigPrm
        var ItemID_UavStation: Array<MCH_ConfigPrm>
        var ItemID_InvisibleItem: MCH_ConfigPrm
        var ItemID_DraftingTable: MCH_ConfigPrm
        var ItemID_Wrench: MCH_ConfigPrm
        var ItemID_RangeFinder: MCH_ConfigPrm
        var BlockID_DraftingTableOFF: MCH_ConfigPrm
        var BlockID_DraftingTableON: MCH_ConfigPrm
        var ItemRecipe_Fuel: MCH_ConfigPrm
        var ItemRecipe_GLTD: MCH_ConfigPrm
        var ItemRecipe_Chain: MCH_ConfigPrm
        var ItemRecipe_Parachute: MCH_ConfigPrm
        var ItemRecipe_Container: MCH_ConfigPrm
        var ItemRecipe_Stinger: MCH_ConfigPrm
        var ItemRecipe_StingerMissile: MCH_ConfigPrm
        var ItemRecipe_Javelin: MCH_ConfigPrm
        var ItemRecipe_JavelinMissile: MCH_ConfigPrm
        var ItemRecipe_UavStation: Array<MCH_ConfigPrm>
        var ItemRecipe_DraftingTable: MCH_ConfigPrm
        var ItemRecipe_Wrench: MCH_ConfigPrm
        var ItemRecipe_RangeFinder: MCH_ConfigPrm
        var KeyConfig: Array<MCH_ConfigPrm?>
        var General: Array<MCH_ConfigPrm?>
        fun applyDamageByExternal(target: Entity?, ds: DamageSource, damage: Float): Float {
            var damage = damage
            val list: List<DamageEntity>
            list = if (target is mcheli.helicopter.MCH_EntityHeli || target is mcheli.plane.MCP_EntityPlane) {
                DamageAircraftByExternal.list
            } else if (target is mcheli.tank.MCH_EntityTank) {
                DamageTankByExternal.list
            } else if (target is mcheli.vehicle.MCH_EntityVehicle) {
                DamageVehicleByExternal.list
            } else {
                DamageOtherByExternal.list
            }
            val attacker: Entity = ds.func_76346_g()
            val attackerSource: Entity = ds.func_76364_f()
            for (de in list) {
                if (de.name.isEmpty() || attacker != null && attacker.getClass().toString()
                        .indexOf(de.name) > 0 || attackerSource != null && attackerSource.getClass().toString()
                        .indexOf(de.name) > 0
                ) damage = (damage * de.factor) as Float
            }
            return damage
        }

        fun applyDamageVsEntity(target: Entity?, ds: DamageSource?, damage: Float): Float {
            var damage = damage
            val list: List<DamageEntity>
            if (target == null) return damage
            val targetName: String = target.getClass().toString()
            list = if (target is mcheli.helicopter.MCH_EntityHeli || target is mcheli.plane.MCP_EntityPlane) {
                DamageVsMCHeliAircraft.list
            } else if (target is mcheli.tank.MCH_EntityTank) {
                DamageVsMCHeliTank.list
            } else if (target is mcheli.vehicle.MCH_EntityVehicle) {
                DamageVsMCHeliVehicle.list
            } else if (targetName.indexOf("mcheli.") > 0) {
                DamageVsMCHeliOther.list
            } else if (target is EntityPlayer) {
                DamageVsPlayer.list
            } else if (target is EntityLivingBase) {
                DamageVsLiving.list
            } else {
                DamageVsEntity.list
            }
            for (de in list) {
                if (de.name.isEmpty() || targetName.indexOf(de.name) > 0) damage = (damage * de.factor) as Float
            }
            return damage
        }

        fun getBreakableBlockListFromType(n: Int): List<Block> {
            if (n == 2) return tankBreakableBlocks
            return if (n == 1) carBreakableBlocks else dummyBreakableBlocks
        }

        fun getNoBreakableBlockListFromType(n: Int): List<Block> {
            if (n == 2) return tankNoBreakableBlocks
            return if (n == 1) carNoBreakableBlocks else dummyBreakableBlocks
        }

        fun getBreakableMaterialListFromType(n: Int): List<Material> {
            if (n == 2) return tankBreakableMaterials
            return if (n == 1) carBreakableMaterials else dummyBreakableMaterials
        }
    }
}
