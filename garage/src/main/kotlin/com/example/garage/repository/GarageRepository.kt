package com.example.garage.repository

import com.example.garage.entity.Garage
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GarageRepository : JpaRepository<Garage, Long> {
    fun findByTitle(name: String): Garage?
}