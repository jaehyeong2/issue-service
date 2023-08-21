package jjfacotry.issueservice.issue.domain.comment

import org.springframework.stereotype.Component

@Component
class IssueCommentMapper {
    fun of(comment: IssueComment): IssueCommentInfo.Main{
        with(comment){
            return IssueCommentInfo.Main(
                id = id!!,
                userId = userId,
                issueId = issue.id!!,
                content = content
            )
        }
    }

}