package jjfacotry.issueservice.user.infra

import jjfacotry.issueservice.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByPhone(phone: String): User?
    fun findAllByOrderByCreateDtDesc(): List<User>
}