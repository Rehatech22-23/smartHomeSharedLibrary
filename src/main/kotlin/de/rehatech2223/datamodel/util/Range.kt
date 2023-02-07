package de.rehatech2223.datamodel.util

@kotlinx.serialization.Serializable
data class Range(
    val minValue: Double,
    val maxValue: Double,
    val currentValue: Double
)
