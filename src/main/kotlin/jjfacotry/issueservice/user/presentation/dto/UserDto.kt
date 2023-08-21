package jjfacotry.issueservice.user.presentation.dto

import jjfacotry.issueservice.user.domain.User

class UserDto {
    data class CreateRequest(
        val name: String,
        val username: String,
        var phone: String,
        val password: String
    ){
        fun toEntity(): User{
            return User(
                name = name,
                username = username,
                password = password,
                phone = phone
            )
        }
    }
}