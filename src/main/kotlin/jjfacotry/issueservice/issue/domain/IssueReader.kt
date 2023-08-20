package jjfacotry.issueservice.issue.domain

interface IssueReader {
    fun get(id: Long): Issue
    fun getAllByStatus(status: Issue.Status): List<Issue>
}