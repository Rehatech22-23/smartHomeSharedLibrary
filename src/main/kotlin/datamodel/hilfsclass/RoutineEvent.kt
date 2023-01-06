package datamodel.hilfsclass

import datamodel.function

data class RoutineEvent(
    var deviceId: Int,
    var functionId: Int,
    var funct: function,
)
