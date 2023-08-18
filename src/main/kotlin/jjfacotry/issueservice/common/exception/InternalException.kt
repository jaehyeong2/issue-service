package jjfacotry.issueservice.common.exception

sealed class InternalException(
    val code: Int,
    override val message: String
) : RuntimeException(message)

data class NotFoundException(
    override val message: String
) : InternalException(404, message)

data class UnAuthorizedException(
    override val message: String = "can't authorize"
) : InternalException(401, message)


