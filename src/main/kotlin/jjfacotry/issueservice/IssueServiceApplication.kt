package jjfacotry.isssueservice

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableBatchProcessing
@SpringBootApplication
class IssueServiceApplication

fun main(args: Array<String>) {
    runApplication<IssueServiceApplication>(*args)
}
