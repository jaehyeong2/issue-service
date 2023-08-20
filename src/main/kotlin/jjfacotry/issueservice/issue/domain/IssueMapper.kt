package jjfacotry.issueservice.issue.domain

import org.springframework.stereotype.Component

@Component
class IssueMapper {
    fun of(issue: Issue) : IssueInfo.Main{
        return IssueInfo.Main(
            userId = issue.userId,
            summary = issue.summary,
            description = issue.description,
            type = issue.type,
            priority = issue.priority,
            status = issue.status
        )
    }
}