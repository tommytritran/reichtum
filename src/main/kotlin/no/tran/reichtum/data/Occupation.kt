package no.tran.reichtum.data

import javax.persistence.*

@Entity
@Table(name = "Occupation")
class Occupation(
    @Id
    @GeneratedValue
    val occupationID:Long?,

    @Column
    val name:String?
)
