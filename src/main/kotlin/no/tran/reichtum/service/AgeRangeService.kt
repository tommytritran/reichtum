package no.tran.reichtum.service

import no.tran.reichtum.data.AgeRange
import no.tran.reichtum.repository.AgeRangeRepository
import org.springframework.stereotype.Service

@Service
class AgeRangeService(private val ageRangeRepository: AgeRangeRepository) {
    fun getAllAgeRanges():List<AgeRange> {
        return ageRangeRepository.findAll()
    }

    fun addAgeRange(ageRange: AgeRange):AgeRange {
        return ageRangeRepository.save(ageRange)
    }
}
