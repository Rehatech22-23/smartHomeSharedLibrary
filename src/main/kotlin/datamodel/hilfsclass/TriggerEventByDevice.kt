package datamodel.hilfsclass

data class TriggerEventByDevice(
    var deviceId: Long,
    var functionId: Long,
    var functionValue: Long
)
