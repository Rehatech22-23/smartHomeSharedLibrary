package datamodel.hilfsclass

import datamodel.function

data class RoutineEvent(
    var routineEventID: Long? = null,
    var routineID: Long? = null,
    var deviceId: Long,
    var functionId: Long,
    var funct: function,
)
