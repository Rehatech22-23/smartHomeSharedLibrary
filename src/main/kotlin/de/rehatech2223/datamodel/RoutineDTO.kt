package de.rehatech2223.datamodel

import de.rehatech2223.datamodel.util.RoutineEventDTO
import de.rehatech2223.datamodel.util.TriggerEventByDeviceDTO
import de.rehatech2223.datamodel.util.TriggerTimeDTO
import java.util.*

@kotlinx.serialization.Serializable
data class RoutineDTO(
    val routineName: String,
    val routineId: Long,
    val triggerType: Int,
    val triggerTime: TriggerTimeDTO? = null,
    val triggerEventByDeviceDTO: TriggerEventByDeviceDTO? = null,
    val routineEventDTO: ArrayList<RoutineEventDTO>
)


