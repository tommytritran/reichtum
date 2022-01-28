package no.tran.reichtum

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class ReichtumApplication

fun main(args: Array<String>) {
	runApplication<ReichtumApplication>(*args)
}
