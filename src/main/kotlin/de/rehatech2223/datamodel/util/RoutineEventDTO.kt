package de.rehatech2223.datamodel.util

@kotlinx.serialization.Serializable
data class RoutineEventDTO(
    val deviceId: String,
    val functionId: Long,
    val functionValue: Float,
    val routineEventId: Long? = null,
    val routineId: Long? = null
)
