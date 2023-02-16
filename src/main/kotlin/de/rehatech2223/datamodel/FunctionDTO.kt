package de.rehatech2223.datamodel

import de.rehatech2223.datamodel.util.RangeDTO

@kotlinx.serialization.Serializable
data class FunctionDTO(
    val functionName: String,
    val functionId: Long,
    val rangeDTO: RangeDTO? = null,
    val onOff : Boolean? = null,
    val outputValue: String? = null,
    val outputTrigger: Boolean? = null
)