package com.doctor.doctorsapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HomePage {

    @GetMapping("/")
    fun homeRoute():String{
        return "Hello App is Running "
    }
}