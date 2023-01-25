package datamodel.hilfsclass

data class TriggerEventByDevice(
    var triggerEventByDeviceID: Long? = null,
    var routineID: Long? = null,
    var deviceId: Long,
    var functionId: Long,
    var functionValue: Long
)
