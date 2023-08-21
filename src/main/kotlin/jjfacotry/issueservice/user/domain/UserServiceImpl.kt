package jjfacotry.issueservice.user.domain

import jjfacotry.issueservice.user.presentation.dto.UserDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserServiceImpl(
    private val userReader: UserReader,
    private val userWriter: UserWriter,
    private val userMapper: UserMapper
) : UserService {
    @Transactional(readOnly = true)
    override fun get(id: Long): UserInfo.Main {
        return userMapper.of(userReader.get(id))
    }

    @Transactional(readOnly = true)
    override fun getByPhone(phone: String): UserInfo.Main {
        return userMapper.of(userReader.getByPhone(phone))
    }

    @Transactional
    override fun create(request: UserDto.CreateRequest): Long {
        return userWriter.write(request.toEntity()).id!!
    }

    @Transactional(readOnly = true)
    override fun getList(): List<UserInfo.Main> {
        return userReader.getList().map { userMapper.of(it) }
    }

    @Transactional
    override fun delete(id: Long) {
        userWriter.delete(id)
    }
}