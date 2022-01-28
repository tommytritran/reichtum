package no.tran.reichtum.controller

import no.tran.reichtum.data.AgeRange
import no.tran.reichtum.service.AgeRangeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("agerange")
class AgeRangeController(private val ageRangeService: AgeRangeService) {
    @GetMapping("/ageranges")
    fun getAllAgeRanges():List<AgeRange> {
        return ageRangeService.getAllAgeRanges()
    }

    @PostMapping
    fun addAgeRange(@RequestBody ageRange: AgeRange):AgeRange {
        return ageRangeService.addAgeRange(ageRange)
    }
}
