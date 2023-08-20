package jjfacotry.issueservice.issue.presentation

import jjfacotry.issueservice.common.response.CommonResponse
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
    fun get(@PathVariable id: Long): CommonResponse<IssueInfo.Main> {
        return CommonResponse(issueService.get(id))
    }

    @GetMapping
    fun getList(@RequestParam(required = false, defaultValue = "TODO") status: Issue.Status): CommonResponse<List<IssueInfo.Main>> {
        return CommonResponse(issueService.getList(status))
    }

    @PostMapping
    fun create(@RequestBody request: IssueDto.CreateRequest): CommonResponse<Long> {
        return CommonResponse(issueService.create(request))
    }
}