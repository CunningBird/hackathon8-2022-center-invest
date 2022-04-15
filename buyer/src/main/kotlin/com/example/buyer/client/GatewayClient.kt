package com.example.buyer.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(value = "gateway", url = "http://localhost:8079/")
interface GatewayClient {

    @GetMapping("cat/list")
    fun catsList(): List<String>

    @GetMapping("cat/test")
    fun testCat(@RequestParam name: String): String

    @PostMapping("cat/buy")
    fun buyCat(@RequestParam name: String): String

    @GetMapping("garage/list")
    fun garageList(): List<String>

    @GetMapping("garage/test")
    fun testGarage(@RequestParam title: String): String

    @PostMapping("garage/buy")
    fun buyGarage(@RequestParam title: String): String
}