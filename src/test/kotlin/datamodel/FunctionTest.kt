package datamodel

import com.google.gson.Gson
import datamodel.util.Range
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FunctionTest {

    @Test
    fun functionGenerate() {
        val functionName = "Test";
        val functionId: Long = 2;
        val range = Range(1.3, 5.9, 4.0);
        val onOff = true;

        val function1 = Function(functionName, functionId, range, onOff);
        val Json = Gson().toJson(function1);
        println(Json)
        val function2 = Gson().fromJson(Json, Function::class.java);
        assertEquals(function1, function2)
    }
}