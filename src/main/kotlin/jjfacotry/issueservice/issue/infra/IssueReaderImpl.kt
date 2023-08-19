package jjfacotry.issueservice.issue.infra

import jjfacotry.issueservice.common.exception.NotFoundException
import jjfacotry.issueservice.issue.domain.Issue
import jjfacotry.issueservice.issue.domain.IssueReader
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class IssueReaderImpl(
    private val issueRepository: IssueRepository
) : IssueReader {
    override fun get(id: Long): Issue {
        return issueRepository.findByIdOrNull(id) ?: throw NotFoundException("issue not found")
    }
}