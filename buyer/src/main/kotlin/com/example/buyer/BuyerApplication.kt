package com.example.buyer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class BuyerApplication

fun main(args: Array<String>) {
    runApplication<BuyerApplication>(*args)
}
