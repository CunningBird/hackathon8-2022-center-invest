package com.example.buyer.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(value = "cat", url = "http://localhost:8077/")
interface CatClient {

    @GetMapping("/list")
    fun list(): List<String>

    @GetMapping("/test")
    fun testCat(@RequestParam name: String): String

    @PostMapping("/buy")
    fun buyCat(@RequestParam name: String): String
}