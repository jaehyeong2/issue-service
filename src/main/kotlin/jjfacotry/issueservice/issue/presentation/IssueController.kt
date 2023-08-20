package jjfacotry.issueservice.issue.presentation

import jjfacotry.issueservice.issue.domain.Issue
import jjfacotry.issueservice.issue.domain.IssueInfo
import jjfacotry.issueservice.issue.domain.IssueService
import jjfacotry.issueservice.issue.presentation.dto.IssueDto
import org.springframework.web.bind.annotation.*

@RestController
class IssueController(
    private val issueService: IssueService
) {
    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): IssueInfo.Main {
        return issueService.get(id)
    }

    @GetMapping
    fun getList(@RequestParam(required = false, defaultValue = "TODO") status: Issue.Status): List<IssueInfo.Main> {
        return issueService.getList(status)
    }

    @PostMapping
    fun create(@RequestBody request: IssueDto.CreateRequest): Long {
        return issueService.create(request)
    }
}