package jjfacotry.issueservice.common.response

import org.springframework.http.HttpStatus
import java.time.LocalDateTime

data class CommonResponse<T>(
    var status: Int = HttpStatus.OK.value(),
    var data: T?,
    val responseTime: LocalDateTime = LocalDateTime.now(),
) {
    constructor(data: T) : this(HttpStatus.OK.value(), data, LocalDateTime.now())
}
