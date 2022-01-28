package no.tran.reichtum.repository

import no.tran.reichtum.data.Sector
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SectorRepository: JpaRepository<Sector, Long> {
}
