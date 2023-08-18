package jjfacotry.issueservice.common.exception

import com.auth0.jwt.exceptions.TokenExpiredException
import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.lang.Exception

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

    @ExceptionHandler(TokenExpiredException::class)
    fun handleTokenExpiredException(ex: TokenExpiredException): ErrorResponse {
        logger.error { ex.message }

        return ErrorResponse(
            code = 401,
            message = "expired token.."
        )
    }

    @ExceptionHandler(Exception::class)
    fun handleException(ex: Exception): ErrorResponse {
        logger.error { ex.message }

        return ErrorResponse(
            code = HttpStatus.INTERNAL_SERVER_ERROR.value(),
            message = "Internal Server error"
        )
    }

}