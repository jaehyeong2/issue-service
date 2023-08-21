package jjfacotry.issueservice.issue.domain.comment

import jjfacotry.issueservice.common.exception.UnAuthorizedException
import jjfacotry.issueservice.issue.domain.IssueReader
import jjfacotry.issueservice.issue.presentation.dto.comment.CommentDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueCommentServiceImpl(
    private val commentReader: IssueCommentReader,
    private val commentWriter: IssueCommentWriter,
    private val issueReader: IssueReader,
    private val commentMapper: IssueCommentMapper
) : IssueCommentService {
    @Transactional(readOnly = true)
    override fun getListByIssueId(issueId: Long): List<IssueCommentInfo.Main> {
        return commentReader.getList(issueId).map { commentMapper.of(it) }
    }

    @Transactional
    override fun create(issueId: Long, request: CommentDto.CreateRequest): Long {
        val issue = issueReader.get(issueId)
        return commentWriter.write(request.toEntity(issue)).id!!
    }

    @Transactional
    override fun delete(id: Long) {
        commentWriter.delete(id)
    }

    @Transactional
    override fun modify(id: Long, request: CommentDto.UpdateRequest) {
        val comment = commentReader.get(id)
        if(comment.userId != request.userId) throw UnAuthorizedException()

        comment.updateContent(request.content)
    }
}