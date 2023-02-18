package de.rehatech2223.datamodel

import de.rehatech2223.datamodel.util.RoutineEventDTO
import de.rehatech2223.datamodel.util.TriggerEventByDeviceDTO
import de.rehatech2223.datamodel.util.TriggerTimeDTO
import java.util.*

@kotlinx.serialization.Serializable
class RoutineDTO private constructor(
    val routineName: String,
    val routineId: Long? = null,
    val triggerType: Int,
    val triggerTime: TriggerTimeDTO? = null,
    val triggerEventByDeviceDTO: TriggerEventByDeviceDTO? = null,
    val routineEventDTO: ArrayList<RoutineEventDTO>
){
    data class Builder(
        val routineName: String,
        val triggerType: Int,
        val routineEventDTO: ArrayList<RoutineEventDTO>,
        var routineId: Long? = null,
        var triggerTime: TriggerTimeDTO? = null,
        var triggerEventByDeviceDTO: TriggerEventByDeviceDTO? = null
    ){
        fun routineId(routineId: Long) = apply { this.routineId = routineId }
        fun triggerTime(triggerTime: TriggerTimeDTO) = apply { this.triggerTime = triggerTime }
        fun triggerEventByDeviceDTO(triggerEventByDeviceDTO: TriggerEventByDeviceDTO) = apply { this.triggerEventByDeviceDTO = triggerEventByDeviceDTO }
        fun build() = RoutineDTO(routineName, routineId, triggerType, triggerTime, triggerEventByDeviceDTO, routineEventDTO)
    }
}


