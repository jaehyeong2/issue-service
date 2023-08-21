package jjfacotry.issueservice.issue.infra.comment

import jjfacotry.issueservice.issue.domain.comment.IssueComment
import jjfacotry.issueservice.issue.domain.comment.IssueCommentWriter
import org.springframework.stereotype.Component

@Component
class IssueCommentWriterImpl(
    private val commentRepository: IssueCommentRepository
) : IssueCommentWriter {
    override fun write(comment: IssueComment): IssueComment {
        return commentRepository.save(comment)
    }

    override fun delete(id: Long) {
        commentRepository.deleteById(id)
    }
}