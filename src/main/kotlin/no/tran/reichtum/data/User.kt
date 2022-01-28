package no.tran.reichtum.data

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@Table(name = "User")
class User (
    @Id
    @GeneratedValue
    val userID:Long?,

    @ManyToOne
    @JoinColumn(name = "regionID")
    val region:Region
)
