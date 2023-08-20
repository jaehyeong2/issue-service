package jjfacotry.issueservice.issue.infra

import jjfacotry.issueservice.issue.domain.Issue
import jjfacotry.issueservice.issue.domain.IssueWriter
import org.springframework.stereotype.Component

@Component
class IssueWriterImpl(
    private val issueRepository: IssueRepository
) : IssueWriter {
    override fun write(issue: Issue): Issue {
        return issueRepository.save(issue)
    }

    override fun delete(id: Long) {
        issueRepository.deleteById(id)
    }
}