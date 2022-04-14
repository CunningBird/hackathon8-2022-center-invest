package com.example.cat.service

import org.springframework.stereotype.Service

@Service
class CatService {

    private val cats = mutableListOf(
        "Ricardo",
        "Van",
        "Billy",
        "Felix"
    )

    fun testCat(name: String): String {
        return if (cats.contains(name)) "Котик $name говорит: Мяу" else "Такого котика нет"
    }

    fun buyCat(name: String): String {
        return if (cats.contains(name)) {
            cats.remove(name)
            "Вы купили котика: $name"
        } else {
            "Такого котика нет"
        }
    }
}