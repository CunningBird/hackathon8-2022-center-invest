package com.example.cat.service

import com.example.cat.entity.Cat
import com.example.cat.repository.CatRepository
import org.springframework.stereotype.Service

@Service
class CatService(
    private val repository: CatRepository
) {

    init {
        repository.save(Cat(1, "Ricardo", 25.0))
        repository.save(Cat(2, "Billy", 25.0))
        repository.save(Cat(3, "Van", 25.0))
        repository.save(Cat(4, "Felix", 25.0))
    }

    fun getAllCats(): List<String> {
        val cats = mutableListOf<String>()

        repository.findAll().forEach { cat ->
            if (cat.name != null) {
                cats.add(cat.name)
            }
        }

        return cats
    }

    fun testCat(name: String): String {
        val cat = repository.findByName(name)
        return if (cat != null) "Котик ${cat.name} говорит: Мяу" else "Такого котика нет"
    }

    fun buyCat(name: String): String {
        val cat = repository.findByName(name)

        return if (cat != null) {
            repository.delete(cat)
            "Вы купили котика: ${cat.name}"
        } else {
            "Такого котика нет"
        }
    }
}