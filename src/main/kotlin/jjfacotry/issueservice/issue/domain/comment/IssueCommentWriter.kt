package jjfacotry.issueservice.issue.domain.comment

interface IssueCommentWriter {
    fun write(comment: IssueComment): IssueComment
    fun delete(id: Long)
}