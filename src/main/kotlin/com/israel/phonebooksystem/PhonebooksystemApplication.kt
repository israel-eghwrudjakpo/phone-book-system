package com.israel.phonebooksystem

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling

@OpenAPIDefinition(
	info = Info(
		title = "Phone Contact Service API",
		description = "Phone Contact Service API documentation",
		version = "1.0"
	)
)
@EnableAsync
@SpringBootApplication
@EnableScheduling
class PhonebooksystemApplication

fun main(args: Array<String>) {
	runApplication<PhonebooksystemApplication>(*args)
}
