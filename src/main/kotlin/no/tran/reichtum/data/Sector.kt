package no.tran.reichtum.data

import javax.persistence.*

@Entity
@Table(name = "Sector")
class Sector(
    @Id
    @GeneratedValue
    val sectorID:Long?,

    @Column
    val name:String?
)
