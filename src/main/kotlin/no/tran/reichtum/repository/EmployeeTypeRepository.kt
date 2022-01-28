package no.tran.reichtum.repository

import no.tran.reichtum.data.EmployeeType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeTypeRepository:JpaRepository<EmployeeType, Long> {
}
