package jjfacotry.issueservice.issue.domain

import jjfacotry.issueservice.issue.domain.enums.IssuePriority
import jjfacotry.issueservice.issue.domain.enums.IssueType

class IssueInfo {
    data class Main(
        val id: Long? = null,
        var userId: Long,
        var summary: String,
        var description: String,
        val type: IssueType,
        val priority: IssuePriority,
        val status: Issue.Status
    )
}