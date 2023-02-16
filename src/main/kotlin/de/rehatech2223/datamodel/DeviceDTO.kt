package de.rehatech2223.datamodel

@kotlinx.serialization.Serializable
data class DeviceDTO(
    val deviceName: String,
    val deviceId: String,
    val functionIds: ArrayList<Long>
)
