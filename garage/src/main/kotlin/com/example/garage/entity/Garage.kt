package com.example.garage.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Garage(
    @Id
    val id: Long? = null,

    val title: String? = null,
    val price: Double? = null
)