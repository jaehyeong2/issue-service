package jjfacotry.issueservice.issue.domain

interface IssueWriter {
    fun write(issue: Issue): Issue
    fun delete(id: Long)
}