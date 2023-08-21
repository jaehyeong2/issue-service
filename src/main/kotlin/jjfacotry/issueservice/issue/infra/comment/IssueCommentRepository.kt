package jjfacotry.issueservice.issue.infra.comment

import jjfacotry.issueservice.issue.domain.comment.IssueComment
import org.springframework.data.jpa.repository.JpaRepository

interface IssueCommentRepository : JpaRepository<IssueComment, Long> {
    fun findAllByIssueId(issueId: Long): List<IssueComment>
}