package no.tran.reichtum.repository

import no.tran.reichtum.data.AgeRange
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AgeRangeRepository:JpaRepository<AgeRange, Long> {
}
