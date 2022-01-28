package no.tran.reichtum.data

import javax.persistence.*

@Entity
@Table(name = "Region")
class Region(
    @Id
    @GeneratedValue
    val regionID:Long?,

    @Column
    val name:String?
)
