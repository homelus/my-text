package com.jun.mytext.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
class TextController {
    @GetMapping("/text")
    fun getText(): String {
        println("text!!")
        return "text"
    }
}