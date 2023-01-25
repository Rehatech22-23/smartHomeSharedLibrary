package datamodel.hilfsclass

import java.time.LocalDateTime

data class TriggerTime(
    var triggerTimeID: Long? = null,
    var routineID: Long? = null,
    var time: LocalDateTime,
    var  repeat: Boolean,
)
