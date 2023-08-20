package jjfacotry.issueservice.common.exception

import org.springframework.http.HttpStatus
import java.time.LocalDateTime

class ErrorResponse(
    var status: Int = HttpStatus.INTERNAL_SERVER_ERROR.value(),
    var code: String? = status.toString(),
    var message: String?,
    val responseTime: LocalDateTime = LocalDateTime.now(),
)