package jjfacotry.issueservice.issue.domain

interface IssueWriter {
    fun write(issue: Issue): Issue
}