package no.tran.reichtum.data

import javax.persistence.*

@Entity
@Table(name = "AgeRange")
class AgeRange(
    @Id
    @GeneratedValue
    val ageRangeID:Long?,

    @Column
    val name:String?
)
