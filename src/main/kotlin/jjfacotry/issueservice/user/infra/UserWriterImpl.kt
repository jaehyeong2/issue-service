package jjfacotry.issueservice.user.infra

import jjfacotry.issueservice.user.domain.User
import jjfacotry.issueservice.user.domain.UserWriter
import org.springframework.stereotype.Component

@Component
class UserWriterImpl(
    private val userRepository: UserRepository
) : UserWriter {
    override fun write(user: User): User {
        return userRepository.save(user)
    }

    override fun delete(id: Long) {
        userRepository.deleteById(id)
    }
}