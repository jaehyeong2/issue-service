package jjfacotry.issueservice.issue.domain

import jjfacotry.issueservice.issue.presentation.dto.IssueDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueServiceImpl(
    private val issueReader: IssueReader,
    private val issueWriter: IssueWriter
) : IssueService {

    @Transactional(readOnly = true)
    override fun get(id: Long): IssueInfo.Main {
        TODO("Not yet implemented")
    }

    @Transactional(readOnly = true)
    override fun getList(): List<IssueInfo.Main> {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun create(request: IssueDto.CreateRequest): Long {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun update(id: Long): Long {
        TODO("Not yet implemented")
    }
}