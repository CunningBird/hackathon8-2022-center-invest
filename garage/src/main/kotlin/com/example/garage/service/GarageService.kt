package com.example.garage.service

import com.example.garage.entity.Garage
import com.example.garage.repository.GarageRepository
import org.springframework.stereotype.Service

@Service
class GarageService(
    private val repository: GarageRepository
) {

    init {
        repository.save(Garage(0, "Маленький", 1000.00))
        repository.save(Garage(1, "Средний", 1500.00))
        repository.save(Garage(2, "Большой", 2000.00))
        repository.save(Garage(3, "Очень Большой", 2500.00))
    }

    fun getAllGarages(): List<String> {
        val garages = mutableListOf<String>()

        repository.findAll().forEach { garage ->
            if (garage.title != null) {
                garages.add(garage.title)
            }
        }

        return garages
    }

    fun testGarage(title: String): String {
        val garage = repository.findByTitle(title)
        return if (garage != null) "Гараж ${garage.title} говорит: Бррр" else "Такого гаража нет"
    }

    fun buyGarage(title: String): String {
        val garage = repository.findByTitle(title)

        return if (garage != null) {
            repository.delete(garage)
            "Вы купили гараж: ${garage.title}"
        } else {
            "Такого гаража нет"
        }
    }
}