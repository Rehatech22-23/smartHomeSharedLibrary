package datamodel.hilfsclass

import datamodel.function

data class RoutineEvent(
    var deviceId: Long,
    var functionId: Long,
    var funct: function,
)
