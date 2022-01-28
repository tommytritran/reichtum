package no.tran.reichtum.data

import javax.persistence.*

@Entity
@Table(name = "User")
class User (
    @Id
    @GeneratedValue
    val userID:Long?,

    @ManyToOne
    @JoinColumn(name = "regionID")
    val region:Region?,

    @ManyToOne
    @JoinColumn(name = "employeeTypeID")
    val employeeType: EmployeeType?,

    @ManyToOne
    @JoinColumn(name = "sectorID")
    val sector:Sector?,

    @ManyToOne
    @JoinColumn(name = "ageRangeID")
    val ageRange:AgeRange?,

    @Column
    val experience:Int?,

    @ManyToOne
    @JoinColumn(name = "occupationID")
    val occupation:Occupation?,

    @Column
    val salary:Double?,

    @Column
    val bonus:Boolean?
)
