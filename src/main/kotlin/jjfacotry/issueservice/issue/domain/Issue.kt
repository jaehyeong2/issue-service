package jjfacotry.issueservice.issue.domain

import jakarta.persistence.*
import jjfacotry.issueservice.common.BaseEntity
import jjfacotry.issueservice.issue.domain.comment.IssueComment
import jjfacotry.issueservice.issue.domain.enums.IssuePriority
import jjfacotry.issueservice.issue.domain.enums.IssueType

@Entity
class Issue(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @OneToMany(mappedBy = "issue", cascade = [CascadeType.REMOVE])
    val comments: List<IssueComment> = ArrayList(),

    var userId: Long,
    var summary: String,
    var description: String,

    @Enumerated(EnumType.STRING)
    val type: IssueType,
    @Enumerated(EnumType.STRING)
    val priority: IssuePriority,
    @Enumerated(EnumType.STRING)
    val status: Status = Status.TODO

) : BaseEntity() {
    enum class Status {
        TODO, IN_PROGRESS, RESOLVED;

        companion object {
            operator fun invoke(type: String) = valueOf(type.uppercase())
        }
    }
}
