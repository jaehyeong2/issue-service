package jjfacotry.issueservice.user.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jjfacotry.issueservice.common.BaseEntity

@Entity
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,
    val username: String,

    var password: String,

    var phone: String
) : BaseEntity()