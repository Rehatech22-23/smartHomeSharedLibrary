package datamodel

@kotlinx.serialization.Serializable
data class Device(
    val deviceName: String,
    val deviceId: String,
    val functionIds: ArrayList<Long>
)
