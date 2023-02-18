package de.rehatech2223.datamodel.util

import de.rehatech2223.datamodel.FunctionDTO

@kotlinx.serialization.Serializable
data class TriggerEventByDeviceDTO(
    val triggerEventByDeviceId: Long? = null,
    val routineId: Long? = null,
    val deviceId: String,
    val functionDTOExpectation: FunctionDTO
)
