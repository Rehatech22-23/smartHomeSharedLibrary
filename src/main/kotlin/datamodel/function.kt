package datamodel

import datamodel.hilfsclass.Range

data class function(
    var functionName: String,
    var functionId: Long,
    var onOff : Boolean? = null,
    var outputTrigger: Boolean? = null,
    var outputValue: String? =null,
    var range: Range? = null,
)
