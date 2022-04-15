package com.example.buyer.client

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GatewayClientTest {

    @Autowired
    private lateinit var client: GatewayClient

    @Test
    fun testGarage() {
        val listExpected = listOf("Маленький", "Средний", "Большой", "Очень Большой")
        val listActual = client.garageList()
        Assertions.assertEquals(listExpected, listActual)

        val title = "Средний"

        val testExpected = "Гараж $title говорит: Бррр"
        val testActual = client.testGarage(title)
        Assertions.assertEquals(testExpected, testActual)

        val buyExpected = "Вы купили гараж: $title"
        val buyActual = client.buyGarage(title)
        Assertions.assertEquals(buyExpected, buyActual)

        val expected = listOf("Маленький", "Большой", "Очень Большой")
        val actual = client.garageList()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun testCats() {
        val listExpected = listOf("Ricardo", "Billy", "Van", "Felix")
        val listActual = client.catsList()
        Assertions.assertEquals(listExpected, listActual)

        val name = "Ricardo"

        val testExpected = "Котик $name говорит: Мяу"
        val testActual = client.testCat(name)
        Assertions.assertEquals(testExpected, testActual)

        val buyExpected = "Вы купили котика: $name"
        val buyActual = client.buyCat(name)
        Assertions.assertEquals(buyExpected, buyActual)

        val expected = listOf("Billy", "Van", "Felix")
        val actual = client.catsList()
        Assertions.assertEquals(expected, actual)
    }
}