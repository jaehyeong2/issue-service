package jjfacotry.issueservice.issue.domain.comment

import jjfacotry.issueservice.issue.domain.IssueInfo
import jjfacotry.issueservice.issue.presentation.dto.comment.CommentDto

interface IssueCommentService {
    fun getListByIssueId(issueId: Long): List<IssueCommentInfo.Main>
    fun delete(id: Long)
    fun modify(id: Long, request: CommentDto.UpdateRequest)
    fun create(issueId: Long, request: CommentDto.CreateRequest): Long
}