package com.example.myapplication

import kotlin.random.Random

class Greeting(listOf: List<String>) {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi!" else "Hello!")
        add("Guess what it is! > ${platform.name.reversed()}!")
    }
}