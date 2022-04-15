package com.example.buyer.client

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(value = "cat", url = "http://localhost:8078/")
interface GarageClient {

    fun
}