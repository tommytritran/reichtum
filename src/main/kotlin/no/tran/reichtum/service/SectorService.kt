package no.tran.reichtum.service

import no.tran.reichtum.data.Sector
import no.tran.reichtum.repository.SectorRepository
import org.springframework.stereotype.Service

@Service
class SectorService(private val sectorRepository: SectorRepository) {
    fun getAllSectors():List<Sector> {
        return sectorRepository.findAll()
    }

    fun addSector(sector: Sector):Sector {
        return sectorRepository.save(sector)
    }
}
