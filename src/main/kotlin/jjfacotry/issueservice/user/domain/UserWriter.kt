package jjfacotry.issueservice.user.domain

interface UserWriter {
    fun write(user: User): User
    fun delete(id: Long)
}