package jjfacotry.issueservice.user.domain

class UserInfo {
    data class Main(
        val id: Long,
        val name: String,
        val username: String,
        var phone: String
    )
}