package datamodel

import com.google.gson.Gson
import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.Assertions.*

class deviceTest{

    /**
     * Diese Funktion test das erstellen einer json string und das einlesen dieser.
     */
    @Test
    fun testgeneration()
    {
        val deviceName = "Test";
        val deviceId = 44;
        val functionId = ArrayList<Int>();
        functionId.add(33);
        functionId.add(44);
        val device1 = device(deviceName, deviceId, functionId)
        val Json = Gson().toJson(device1);
        println(Json)
        val device2 = Gson().fromJson(Json, device::class.java);
        assertEquals(device1.deviceName, device2.deviceName);
        assertEquals(device1.deviceId, device2.deviceId);
        assertEquals(device1, device2)
    }
}