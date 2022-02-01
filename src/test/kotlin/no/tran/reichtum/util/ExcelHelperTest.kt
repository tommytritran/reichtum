package no.tran.reichtum.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ExcelHelperTest{
    private val excelHelper:ExcelHelper = ExcelHelper()

    @Test
    fun parseAgeRangeTest(){
        val range = "20-24 år"
        val result = excelHelper.parseAgeRange(range)
        assertEquals("20-24", result)
    }

    @Test
    fun parseEmployeeTypeTest(){
        val type = "frilans / selvstendig næringsdrivende"
        val result = excelHelper.parseEmployeeType(type)
        assertEquals("frilans", result)
    }

    @Test
    fun parseSectorTest(){
        val sector = "ikke oppgitt"
        val result = excelHelper.parseSector(sector)
        assertEquals("annet", result)
    }
}
