package datamodel.util

import datamodel.Function

@kotlinx.serialization.Serializable
data class RoutineEvent(
    val routineEventID: Long? = null,
    val routineID: Long? = null,
    val deviceId: Long,
    val functionId: Long,
    val funct: Function
)
