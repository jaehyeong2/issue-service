package jjfacotry.issueservice.user.domain

import org.springframework.stereotype.Component

@Component
class UserMapper {

    fun of(user: User): UserInfo.Main {
        with(user){
            return UserInfo.Main(
                id = id!!,
                name = name,
                username = username,
                phone = phone
            )
        }
    }
}