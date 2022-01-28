package no.tran.reichtum.service

import no.tran.reichtum.data.EmployeeType
import no.tran.reichtum.repository.EmployeeTypeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeTypeService(private val employeeTypeRepository: EmployeeTypeRepository) {
    fun addEmployeeType(employeeType: EmployeeType):EmployeeType {
        return employeeTypeRepository.save(employeeType)
    }

    fun getAllEmployeeTypes():List<EmployeeType> {
        return employeeTypeRepository.findAll()
    }
}
