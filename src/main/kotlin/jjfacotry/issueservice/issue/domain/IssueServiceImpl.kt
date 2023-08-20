package jjfacotry.issueservice.issue.domain

import jjfacotry.issueservice.issue.presentation.dto.IssueDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueServiceImpl(
    private val issueReader: IssueReader,
    private val issueWriter: IssueWriter,
    private val issueMapper: IssueMapper
) : IssueService {

    @Transactional(readOnly = true)
    override fun get(id: Long): IssueInfo.Main {
        return issueMapper.of(issueReader.get(id))
    }

    @Transactional(readOnly = true)
    override fun getList(status: Issue.Status): List<IssueInfo.Main> {
        return issueReader.getAllByStatus(status).map {
            issueMapper.of(it)
        }
    }

    @Transactional
    override fun create(request: IssueDto.CreateRequest): Long {
        return issueWriter.write(request.toEntity()).id!!
    }

    @Transactional
    override fun delete(id: Long) {
        issueWriter.delete(id)
    }

    @Transactional
    override fun update(id: Long): Long {
        val issue = issueReader.get(id)


        return issue.id!!
    }
}