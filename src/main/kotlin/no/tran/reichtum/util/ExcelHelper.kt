package no.tran.reichtum.util

import org.springframework.stereotype.Component

@Component
class ExcelHelper {
    fun parseAgeRange(range:String):String{
        return range.substring(0, range.length-3)
    }
    fun parseEmployeeType(type:String):String {
       return when {
            type.lowercase().contains("konsulent") -> "konsulent"
            type.lowercase().contains("in-house") -> "in-house"
            type.lowercase().contains("frilans") -> "frilans"
            else -> "annet"
        }
    }
    fun parseSector(sector:String):String {
        return when {
            sector.lowercase().contains("ikke") -> "annet"
            else -> sector.lowercase()
        }
    }
}
