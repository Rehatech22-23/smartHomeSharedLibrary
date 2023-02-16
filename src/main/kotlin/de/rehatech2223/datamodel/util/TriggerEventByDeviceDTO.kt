package de.rehatech2223.datamodel.util

import de.rehatech2223.datamodel.FunctionDTO

@kotlinx.serialization.Serializable
data class TriggerEventByDeviceDTO(
    val triggerEventByDeviceID: Long? = null,
    val routineID: Long? = null,
    val deviceId: String,
    val functionDTOExpectation: FunctionDTO
)
