package datamodel.hilfsclass

import java.time.LocalDateTime

data class TriggerTime(
    var time: LocalDateTime,
    var  repeat: Boolean,
)
