package no.tran.reichtum.controller

import no.tran.reichtum.data.Region
import no.tran.reichtum.service.RegionService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/region")
class RegionController (private val regionService: RegionService) {

    @GetMapping("/regions")
    fun getAllRegions():List<Region> {
        return regionService.getAllRegion()
    }

    @PostMapping()
    fun addRegion(@RequestBody region:Region):Region {
        return regionService.addRegion(region)
    }
}
