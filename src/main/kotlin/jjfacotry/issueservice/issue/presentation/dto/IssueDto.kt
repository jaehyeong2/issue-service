package jjfacotry.issueservice.issue.presentation.dto

import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jjfacotry.issueservice.issue.domain.Issue
import jjfacotry.issueservice.issue.domain.enums.IssuePriority
import jjfacotry.issueservice.issue.domain.enums.IssueType

class IssueDto {
    data class CreateRequest(
        var userId: Long,
        var summary: String,
        var description: String,
        val type: IssueType,
        val priority: IssuePriority,
    ){
        fun toEntity(): Issue{
            return Issue(
                userId = userId,
                summary = summary,
                description = description,
                type = type,
                priority = priority
            )
        }
    }
}