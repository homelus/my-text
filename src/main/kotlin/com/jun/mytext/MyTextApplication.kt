package com.jun.mytext

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyTextApplication

fun main(args: Array<String>) {
    runApplication<MyTextApplication>(*args)
}
