package no.tran.reichtum.service

import no.tran.reichtum.data.Region
import no.tran.reichtum.repository.RegionRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class RegionService (private val regionRepository: RegionRepository) {

    private val log = LoggerFactory.getLogger(this.javaClass)

    fun getAllRegion():List<Region> {
        log.info("About to get all region")
        return regionRepository.findAll()
    }

    fun addRegion(region:Region):Region{
        log.info("About to save region")
        return regionRepository.save(region)
    }
}
