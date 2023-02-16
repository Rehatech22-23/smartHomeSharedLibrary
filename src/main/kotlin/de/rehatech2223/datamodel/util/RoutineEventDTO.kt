package de.rehatech2223.datamodel.util

@kotlinx.serialization.Serializable
data class RoutineEventDTO(
    val routineEventID: Long? = null,
    val routineID: Long? = null,
    val deviceId: String,
    val functionId: Long,
    val functionValue: Float,
)
