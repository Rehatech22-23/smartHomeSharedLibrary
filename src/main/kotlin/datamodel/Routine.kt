package datamodel

import datamodel.util.RoutineEvent
import datamodel.util.TriggerEventByDevice
import datamodel.util.TriggerTime

@kotlinx.serialization.Serializable
data class Routine(
    val routineName: String,
    val routineId: Long,
    val triggerType: Int,
    val triggerTime: ArrayList<TriggerTime>? = null,
    val triggerEventByDevice: ArrayList<TriggerEventByDevice>? = null,
    val routineEvent: ArrayList<RoutineEvent>? = null
)

/*
    Comments:
        triggerType can be omitted, because one of the 3 events (triggerEventByDevice, routineEvent oder triggerTime)
        will be non-null and therefore imply the triggerType

        Maybe routineEvent should also be required, because a routine is defined by its actions, a routine which does not do anything upon triggering is pointless

        according to the api-doc triggerTime is an Object only containing LocalDateTime and repeat: Boolean.
        It does not need additional ids. If you need those ids for storing them into the database thats okay (in the future i wont mention this again, but keep it in mind)
        Most of all, triggerTime should not be an Array! -> Same goes for triggerEventByDevice

        TriggerEventByDevice is according to the api documentation an Object only containing the deviceId and a function Object.
        functionValue: Long is not enough.
        unnecessary: triggerEventByDeviceID, routineID, functionId  <- why is it sometimes ID and sometimes Id?

        RoutineEvent:
            why is there a Function object and not in TriggerEventByDevice? where is functionValue?
            It seems like you swapped TriggerEventByDevice and RoutineEvent
            unnecessary: routineEventID, routineID <- ID again

        I did not double-check if the util-classes have proper non-null requirements


        I also want to refactor Routine and Function to use the Builder-Pattern in order to make a better distinction
       between required and non-required arguments and to reduce constructor size.
 */


