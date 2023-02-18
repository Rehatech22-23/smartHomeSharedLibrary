package de.rehatech2223.datamodel.util

@kotlinx.serialization.Serializable
data class RoutineEventDTO(
    val routineEventId: Long? = null,
    val routineId: Long? = null,
    val deviceId: String,
    val functionId: Long,
    val functionValue: Float,
)
