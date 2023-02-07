package de.rehatech2223.datamodel.util

@kotlinx.serialization.Serializable
data class RoutineEvent(
    val routineEventID: Long? = null,
    val routineID: Long? = null,
    val deviceId: Long,
    val functionId: Long,
    val functionValue: Float,
)
