package no.tran.reichtum.controller

import no.tran.reichtum.data.EmployeeType
import no.tran.reichtum.service.EmployeeTypeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employeetype")
class EmployeeTypeController(private val employeeTypeService: EmployeeTypeService) {
    @PostMapping
    fun addEmployeeType(@RequestBody employeeType: EmployeeType):EmployeeType {
        return employeeTypeService.addEmployeeType(employeeType)
    }

    @GetMapping("/employeetypes")
    fun getAllEmployeeTypes():List<EmployeeType> {
        return employeeTypeService.getAllEmployeeTypes()
    }
}
