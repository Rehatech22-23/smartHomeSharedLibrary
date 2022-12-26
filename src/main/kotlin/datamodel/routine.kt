package datamodel

import datamodel.hilfsclass.RoutineEvent
import datamodel.hilfsclass.TriggerEventByDevice
import datamodel.hilfsclass.TriggerTime

data class routine(
    var routineName: String,
    var routineId: Int,
    var triggerType: Int,
    var triggerEventByDevice: ArrayList<TriggerEventByDevice>? = null,
    var routineEvent: ArrayList<RoutineEvent>? = null,
    var triggerTime: ArrayList<TriggerTime>? = null,
)




