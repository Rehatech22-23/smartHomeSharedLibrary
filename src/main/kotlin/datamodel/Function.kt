package datamodel

import datamodel.util.Range

@kotlinx.serialization.Serializable
data class Function(
    val functionName: String,
    val functionId: Long,
    val range: Range? = null,
    val onOff : Boolean? = null,
    val outputValue: String? = null,
    val outputTrigger: Boolean? = null
)