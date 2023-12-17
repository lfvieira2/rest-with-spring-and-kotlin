package br.com.estudo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestWithSpringAndKotlinApplication

fun main(args: Array<String>) {
	runApplication<RestWithSpringAndKotlinApplication>(*args)
}
