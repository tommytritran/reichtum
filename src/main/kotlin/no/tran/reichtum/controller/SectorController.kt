package no.tran.reichtum.controller

import no.tran.reichtum.data.Sector
import no.tran.reichtum.service.SectorService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sector")
class SectorController(private val sectorService: SectorService) {

    @GetMapping("/sectors")
    fun getAllSectors():List<Sector> {
        return sectorService.getAllSectors()
    }

    @PostMapping
    fun addSector(@RequestBody sector: Sector):Sector {
        return sectorService.addSector(sector)
    }
}
