package no.tran.reichtum.service

import no.tran.reichtum.data.Occupation
import no.tran.reichtum.repository.OccupationRepository
import org.springframework.stereotype.Service

@Service
class OccupationService(private val occupationRepository: OccupationRepository) {
    fun getAllOccupations():List<Occupation> {
        return occupationRepository.findAll()
    }

    fun addOccupation(occupation: Occupation):Occupation {
        return occupationRepository.save(occupation)
    }
}
