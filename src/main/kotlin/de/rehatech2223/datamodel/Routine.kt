package de.rehatech2223.datamodel

import de.rehatech2223.datamodel.util.RoutineEvent
import de.rehatech2223.datamodel.util.TriggerEventByDevice
import de.rehatech2223.datamodel.util.TriggerTime

@kotlinx.serialization.Serializable
data class Routine(
    val routineName: String,
    val routineId: Long,
    val triggerType: Int,
    val triggerTime: TriggerTime? = null,
    val triggerEventByDevice: TriggerEventByDevice? = null,
    val routineEvent: ArrayList<RoutineEvent>
)


