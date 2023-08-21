package jjfacotry.issueservice.issue.domain.comment

import jakarta.persistence.*
import jjfacotry.issueservice.common.BaseEntity
import jjfacotry.issueservice.issue.domain.Issue

@Entity
class IssueComment(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    val issue: Issue,
    var userId: Long,
    var content: String
) : BaseEntity(){

    fun updateContent(content: String){
        this.content = content
    }
}
