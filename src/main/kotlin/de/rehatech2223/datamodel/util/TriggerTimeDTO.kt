package de.rehatech2223.datamodel.util

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object LocalDateTimeAsStringSerializer : KSerializer<LocalDateTime> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("DateTime", PrimitiveKind.STRING)
    override fun serialize(encoder: Encoder, value: LocalDateTime) {
        val string: String = value.toLocalTime().toString() //Do we need date? I thought we agreed upon only using time
        encoder.encodeString(string)
    }

    override fun deserialize(decoder: Decoder): LocalDateTime {
        val string = decoder.decodeString()
        return LocalDateTime.parse(string, DateTimeFormatter.ISO_TIME) //todo test this
    }
}
@Serializable
data class TriggerTime(
    val triggerTimeID: Long? = null,
    val routineID: Long? = null,
    @Serializable(with = LocalDateTimeAsStringSerializer::class)
    val time: LocalDateTime,
    val repeat: Boolean,
)
