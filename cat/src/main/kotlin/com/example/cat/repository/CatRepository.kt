package com.example.cat.repository

import com.example.cat.entity.Cat
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CatRepository : JpaRepository<Cat, Long> {
    fun findByName(name: String): Cat?
}