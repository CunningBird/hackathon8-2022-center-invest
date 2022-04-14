package com.example.cat.controller

import com.example.cat.service.CatService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CatController(
    private val service: CatService
) {

    @GetMapping("/test")
    fun testCat(@RequestParam name: String): String {
        return service.testCat(name)
    }

    @PostMapping("/buy")
    fun buyCat(@RequestParam name: String): String {
        return service.buyCat(name)
    }
}