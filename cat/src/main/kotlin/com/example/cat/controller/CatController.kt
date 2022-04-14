package com.example.cat.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CatController {

    @GetMapping("/test")
    fun testCat(@RequestParam name: String): String {
        return "Котик $name говорит: Мяу"
    }

    @PostMapping("/buy")
    fun buyCat(@RequestParam name: String): String {
        return "Вы купили котика: $name"
    }
}