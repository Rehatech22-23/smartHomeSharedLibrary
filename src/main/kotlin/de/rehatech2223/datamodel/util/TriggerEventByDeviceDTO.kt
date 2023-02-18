package de.rehatech2223.datamodel.util

import de.rehatech2223.datamodel.FunctionDTO

@kotlinx.serialization.Serializable
data class TriggerEventByDeviceDTO(
    val deviceId: String,
    val functionDTOExpectation: FunctionDTO,
    val triggerEventByDeviceId: Long? = null,
    val routineId: Long? = null
)
