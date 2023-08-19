package jjfacotry.issueservice.issue.domain

import jjfacotry.issueservice.issue.presentation.dto.IssueDto

interface IssueService {
    fun get(id: Long): IssueInfo.Main
    fun getList(): List<IssueInfo.Main>
    fun create(request: IssueDto.CreateRequest): Long
    fun delete(id: Long)
    fun update(id: Long): Long
}