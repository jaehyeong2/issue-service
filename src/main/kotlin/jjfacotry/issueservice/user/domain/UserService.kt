package jjfacotry.issueservice.user.domain

import jjfacotry.issueservice.user.presentation.dto.UserDto

interface UserService {
    fun get(id: Long): UserInfo.Main
    fun create(request: UserDto.CreateRequest): Long
    fun getList(): List<UserInfo.Main>
    fun delete(id: Long)
    fun getByPhone(phone: String): UserInfo.Main
}