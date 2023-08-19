package jjfacotry.issueservice.issue.domain

import jakarta.persistence.*
import jjfacotry.issueservice.issue.domain.enums.IssuePriority
import jjfacotry.issueservice.issue.domain.enums.IssueType

@Entity
class Issue(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var userId: Long,
    var summary: String,
    var description: String,

    @Enumerated(EnumType.STRING)
    val type: IssueType,
    @Enumerated(EnumType.STRING)
    val priority: IssuePriority,
    @Enumerated(EnumType.STRING)
    val status: Status

) : BaseEntity() {
    enum class Status {
        TODO, IN_PROGRESS, RESOLVED;

        companion object {
            operator fun invoke(type: String) = valueOf(type.uppercase())
        }
    }
}
