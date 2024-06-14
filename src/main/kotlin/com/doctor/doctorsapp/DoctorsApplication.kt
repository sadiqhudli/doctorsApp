package com.doctor.doctorsapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DoctorsApplication

fun main(args: Array<String>) {
	runApplication<DoctorsApplication>(*args)

	println("hello")
}
