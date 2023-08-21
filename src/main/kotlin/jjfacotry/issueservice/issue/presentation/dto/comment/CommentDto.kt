package jjfacotry.issueservice.issue.presentation.dto.comment

import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jjfacotry.issueservice.issue.domain.Issue
import jjfacotry.issueservice.issue.domain.comment.IssueComment
import jjfacotry.issueservice.issue.domain.enums.IssuePriority
import jjfacotry.issueservice.issue.domain.enums.IssueType

class CommentDto {
    data class CreateRequest(
        var userId: Long,
        var content: String,
    ){
        fun toEntity(issue: Issue): IssueComment{
            return IssueComment(
                userId = userId,
                issue = issue,
                content = content
            )
        }
    }

    data class UpdateRequest(
        var userId: Long,
        var content: String,
    )
}