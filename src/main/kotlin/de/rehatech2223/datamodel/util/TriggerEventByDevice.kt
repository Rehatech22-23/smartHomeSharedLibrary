package de.rehatech2223.datamodel.util

import de.rehatech2223.datamodel.Function

@kotlinx.serialization.Serializable
data class TriggerEventByDevice(
    val triggerEventByDeviceID: Long? = null,
    val routineID: Long? = null,
    val deviceId: String,
    val functionExpectation: Function
)
