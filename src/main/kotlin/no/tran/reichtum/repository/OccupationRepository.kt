package no.tran.reichtum.repository

import no.tran.reichtum.data.Occupation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OccupationRepository: JpaRepository<Occupation, Long> {
}
