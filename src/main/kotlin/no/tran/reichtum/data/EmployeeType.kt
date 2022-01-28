package no.tran.reichtum.data

import javax.persistence.*

@Entity
@Table(name = "EmployeeType")
class EmployeeType(
    @Id
    @GeneratedValue
    val employeeTypeID:Long?,

    @Column
    val name:String?
)
