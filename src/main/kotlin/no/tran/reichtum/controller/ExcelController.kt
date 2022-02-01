package no.tran.reichtum.controller

import no.tran.reichtum.util.ExcelReaderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ExcelController(private val excelReaderService: ExcelReaderService) {
    @GetMapping("/excel")
    fun readFile(@RequestParam path:String):Map<String, Any> {
        return excelReaderService.mapExcelToDB(path)
    }
}
