package jjfacotry.issueservice.issue.infra.comment

import jjfacotry.issueservice.common.exception.NotFoundException
import jjfacotry.issueservice.issue.domain.comment.IssueComment
import jjfacotry.issueservice.issue.domain.comment.IssueCommentReader
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class IssueCommentReaderImpl(
    private val commentRepository: IssueCommentRepository
) : IssueCommentReader {
    override fun get(id: Long): IssueComment {
        return commentRepository.findByIdOrNull(id) ?: throw NotFoundException("issue not found")
    }

    override fun getList(issueId: Long): List<IssueComment> {
        return commentRepository.findAllByIssueId(issueId)
    }
}