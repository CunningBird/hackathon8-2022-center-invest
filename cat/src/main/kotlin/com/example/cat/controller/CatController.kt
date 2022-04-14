package com.example.cat.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CatController {

    private val cats = mutableListOf(
        "Ricardo",
        "Van",
        "Billy",
        "Felix"
    )

    @GetMapping("/test")
    fun testCat(@RequestParam name: String): String {
        return if (cats.contains(name)) "Котик $name говорит: Мяу" else "Такого котика нет"
    }

    @PostMapping("/buy")
    fun buyCat(@RequestParam name: String): String {
        return if (cats.contains(name)) {
            cats.remove(name)
            "Вы купили котика: $name"
        } else {
            "Такого котика нет"
        }
    }
}