package datamodel.util

@kotlinx.serialization.Serializable
data class TriggerEventByDevice(
    val triggerEventByDeviceID: Long? = null,
    val routineID: Long? = null,
    val deviceId: Long,
    val functionId: Long,
    val functionValue: Long
)
