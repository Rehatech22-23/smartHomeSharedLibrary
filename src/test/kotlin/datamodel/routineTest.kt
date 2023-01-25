package datamodel

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import datamodel.hilfsclass.TriggerTime
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class routineTest {

    val gson = GsonBuilder().registerTypeAdapter(TriggerTime::class.java, TriggerTimeSerializer()).create();
    val gson2 = GsonBuilder().registerTypeAdapter(TriggerTime::class.java, TriggerTimeDeserializer()).create();
    @Test
    fun routineTest()
    {
        var routineName: String = "Test";
        var routineId: Long = 42;
        var triggerType: Int = 2;
        val routine1 = routine(routineName, routineId, triggerType);
        val Json = gson.toJson(routine1);

        val routine2 = gson2.fromJson(Json, routine::class.java);
        assertEquals(routine1, routine2);
    }

    @Test
    fun routineTriggerTimeTest()
    {
        var routineName: String = "Test";
        var routineId: Long = 42;
        var triggerType: Int = 2;
        var triggerTime = TriggerTime(null, null,LocalDateTime.now(), true);
        var triggerT = ArrayList<TriggerTime>();
        triggerT.add(triggerTime);
        triggerT.add(TriggerTime(null, null, LocalDateTime.of(2002,11,4,3,11), true))
        val routine1 = routine(routineName, routineId, triggerType,  triggerTime=triggerT );
        val Json = gson.toJson(routine1);

        val routine2 = gson2.fromJson(Json, routine::class.java);
        assertEquals(routine1, routine2);
    }
}