package de.rehatech2223.datamodel

import de.rehatech2223.datamodel.util.RangeDTO

@kotlinx.serialization.Serializable
class FunctionDTO private constructor(
    val functionName: String,
    val functionId: Long,
    val rangeDTO: RangeDTO? = null,
    val onOff : Boolean? = null,
    val outputValue: String? = null,
    val outputTrigger: Boolean? = null,
    val isPlayer: Boolean = false
){
    data class Builder(
        val functionName: String,
        val functionId: Long,
        var rangeDTO: RangeDTO? = null,
        var onOff : Boolean? = null,
        var outputValue: String? = null,
        var outputTrigger: Boolean? = null,
        var isPlayer: Boolean = false
    ){
        fun rangeDTO(rangeDTO: RangeDTO) = apply { this.rangeDTO = rangeDTO }
        fun onOff(onOff: Boolean) = apply { this.onOff = onOff }
        fun outputValue(outputValue: String) = apply { this.outputValue = outputValue }
        fun outputTrigger(outputTrigger: Boolean) = apply { this.outputTrigger = outputTrigger }
        fun isPlayer(isPlayer: Boolean) = apply { this.isPlayer = isPlayer }
        fun build() = FunctionDTO(functionName, functionId, rangeDTO, onOff, outputValue, outputTrigger, isPlayer)
    }
}