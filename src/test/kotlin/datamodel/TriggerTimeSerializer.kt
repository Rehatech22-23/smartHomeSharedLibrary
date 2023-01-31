package datamodel

import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import datamodel.util.TriggerTime
import java.lang.reflect.Type
import java.util.logging.Logger

class TriggerTimeSerializer : JsonSerializer<TriggerTime> {

    override fun serialize(src: TriggerTime?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        val jsonObject = JsonObject()
        try {
            jsonObject.addProperty("time", src?.time.toString());
            jsonObject.addProperty("repeat", src?.repeat)

        } catch (e: Exception) {
            Logger.getLogger("Test");
        }
        return jsonObject;


    }
}