package jjfacotry.issueservice.issue.domain.enums

enum class IssuePriority {
    LOW, MEDIUM, HIGH;

    companion object{
        operator fun invoke(type:String) = valueOf(type.uppercase())
    }
}
