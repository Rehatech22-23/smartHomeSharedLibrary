package de.rehatech2223.datamodel.util

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

object LocalTimeAsStringSerializer : KSerializer<LocalTime> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Time", PrimitiveKind.STRING)
    override fun serialize(encoder: Encoder, value: LocalTime) {
        val string: String = value.toString()
        encoder.encodeString(string)
    }

    override fun deserialize(decoder: Decoder): LocalTime {
        val string = decoder.decodeString()
        return LocalTime.parse(string, DateTimeFormatter.ISO_TIME)
    }
}
@Serializable
data class TriggerTimeDTO(
    @Serializable(with = LocalTimeAsStringSerializer::class)
    val time: LocalTime,
    val repeat: Boolean,
    val triggerTimeId: Long? = null,
    val routineId: Long? = null
)
