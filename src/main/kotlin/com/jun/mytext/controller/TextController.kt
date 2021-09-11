package com.jun.mytext.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TextController {
    @RequestMapping("/text")
    fun getText(): String {
        return "text"
    }
}