package no.tran.reichtum.controller

import no.tran.reichtum.data.Occupation
import no.tran.reichtum.service.OccupationService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/occupation")
class OccupationController(private val occupationService: OccupationService) {
    @GetMapping("/occupations")
    fun getAllOccupations():List<Occupation> {
        return occupationService.getAllOccupations()
    }

    @PostMapping
    fun addOccupation(@RequestBody occupation: Occupation):Occupation {
        return occupationService.addOccupation(occupation)
    }
}
