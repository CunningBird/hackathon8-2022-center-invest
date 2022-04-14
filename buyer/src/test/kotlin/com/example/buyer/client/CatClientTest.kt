package com.example.buyer.client

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CatClientTest {

    @Autowired
    private lateinit var client: CatClient

    @Test
    fun test() {
        val listExpected = listOf("Ricardo", "Billy", "Van", "Felix")
        val listActual = client.list()
        Assertions.assertEquals(listExpected, listActual)

        val name = "Ricardo"

        val testExpected = "Котик $name говорит: Мяу"
        val testActual = client.testCat(name)
        Assertions.assertEquals(testExpected, testActual)

        val buyExpected = "Вы купили котика: $name"
        val buyActual = client.buyCat(name)
        Assertions.assertEquals(buyExpected, buyActual)
    }
}