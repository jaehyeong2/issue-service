package jjfacotry.issueservice.issue.domain.comment

class IssueCommentInfo {
    data class Main(
        val id: Long? = null,
        val issueId: Long,
        var userId: Long,
        var content: String
    )
}