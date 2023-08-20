package jjfacotry.issueservice.issue.domain

import org.springframework.stereotype.Component

@Component
class IssueMapper {
    fun of(issue: Issue) : IssueInfo.Main{
        with(issue){
            return IssueInfo.Main(
                userId = userId,
                summary = summary,
                description = description,
                type = type,
                priority = priority,
                status = status
            )
        }
    }
}