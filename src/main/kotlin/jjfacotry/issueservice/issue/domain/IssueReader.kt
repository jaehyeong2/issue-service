package jjfacotry.issueservice.issue.domain

interface IssueReader {
    fun get(id: Long): Issue
}