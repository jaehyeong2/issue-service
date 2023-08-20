package jjfacotry.issueservice.issue.infra

import jjfacotry.issueservice.issue.domain.Issue
import org.springframework.data.jpa.repository.JpaRepository

interface IssueRepository : JpaRepository<Issue, Long>{
    fun findAllByStatusOrderByCreateDtDesc(status: Issue.Status) : List<Issue>
}