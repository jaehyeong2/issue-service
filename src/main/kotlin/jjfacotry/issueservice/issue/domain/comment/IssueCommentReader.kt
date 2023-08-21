package jjfacotry.issueservice.issue.domain.comment

interface IssueCommentReader {
    fun get(id: Long): IssueComment
    fun getList(issueId: Long): List<IssueComment>
}