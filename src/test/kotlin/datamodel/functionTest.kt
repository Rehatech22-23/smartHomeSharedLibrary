package datamodel

import com.google.gson.Gson
import datamodel.hilfsclass.Range
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class functionTest{

    @Test
    fun functionGenerat()
    {
        val functionName = "Test";
        val functionId = 2;
        val range = Range(1.3,5.9,4.0);
        val onOff = true;

        val function1 = function(functionName,functionId,onOff, range = range);
        val Json = Gson().toJson(function1);
        println(Json)
        val function2 = Gson().fromJson(Json, function::class.java);
        assertEquals(function1, function2)


    }
}