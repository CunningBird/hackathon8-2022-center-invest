package com.example.garage.controller

import com.example.garage.service.GarageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GarageController(
    private val service: GarageService
) {

    @GetMapping("/list")
    fun list(): List<String> {
        return service.getAllGarages()
    }

    @GetMapping("/test")
    fun testGarage(@RequestParam title: String): String {
        return service.testGarage(title)
    }

    @PostMapping("/buy")
    fun buyGarage(@RequestParam title: String): String {
        return service.buyGarage(title)
    }
}