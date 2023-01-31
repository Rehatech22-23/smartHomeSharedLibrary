package datamodel

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import datamodel.util.TriggerTime
import java.lang.reflect.Type
import java.time.LocalDateTime

class TriggerTimeDeserializer: JsonDeserializer<TriggerTime> {

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): TriggerTime {
        json as JsonObject;
        val time =LocalDateTime.parse( json.get("time").asString);
        val repeat = json.get("repeat").asBoolean;

        return TriggerTime(time = time, repeat = repeat);
    }
}