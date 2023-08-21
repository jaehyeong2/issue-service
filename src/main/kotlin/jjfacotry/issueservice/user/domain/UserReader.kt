package jjfacotry.issueservice.user.domain

interface UserReader {
    fun get(id: Long): User
    fun getByPhone(phone: String): User
}