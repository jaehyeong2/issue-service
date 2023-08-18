package jjfacotry.issueservice.common.exception

import mu.KotlinLogging
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    private val logger = KotlinLogging.logger {}

    @ExceptionHandler(InternalException::class)
    fun handleInternalException(ex: InternalException): ErrorResponse {
        logger.error { ex.message }

        return ErrorResponse(
            code = ex.code,
            message = ex.message
        )
    }

}