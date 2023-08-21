package jjfacotry.issueservice.user.infra

import jjfacotry.issueservice.common.exception.NotFoundException
import jjfacotry.issueservice.user.domain.User
import jjfacotry.issueservice.user.domain.UserReader
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class UserReaderImpl(
    private val userRepository: UserRepository
) : UserReader {
    override fun get(id: Long): User {
        return userRepository.findByIdOrNull(id) ?: throw NotFoundException("user not found")
    }

    override fun getByPhone(phone: String): User {
        return userRepository.findByPhone(phone) ?: throw NotFoundException("user not found")
    }
}