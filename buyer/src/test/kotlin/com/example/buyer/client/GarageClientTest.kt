package com.example.buyer.client

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GarageClientTest {

    @Autowired
    private lateinit var client: GarageClient

    @Test
    fun test() {
        val listExpected = listOf("Маленький", "Средний", "Большой", "Очень Большой")
        val listActual = client.list()
        Assertions.assertEquals(listExpected, listActual)

        val title = "Средний"

        val testExpected = "Гараж $title говорит: Бррр"
        val testActual = client.testGarage(title)
        Assertions.assertEquals(testExpected, testActual)

        val buyExpected = "Вы купили гараж: $title"
        val buyActual = client.buyGarage(title)
        Assertions.assertEquals(buyExpected, buyActual)

        val expected = listOf("Маленький", "Большой", "Очень Большой")
        val actual = client.list()
        Assertions.assertEquals(expected, actual)
    }
}