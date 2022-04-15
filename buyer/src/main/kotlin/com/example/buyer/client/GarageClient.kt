package com.example.buyer.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(value = "garage", url = "http://localhost:8078/")
interface GarageClient {

    @GetMapping("/list")
    fun list(): List<String>

    @GetMapping("/test")
    fun testGarage(@RequestParam title: String): String

    @PostMapping("/buy")
    fun buyGarage(@RequestParam title: String): String
}