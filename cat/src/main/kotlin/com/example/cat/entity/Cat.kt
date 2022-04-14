package com.example.cat.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Cat(
    @Id
    val id: Long? = null,

    val name: String? = null,
    val price: Double? = null
)
