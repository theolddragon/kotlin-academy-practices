package main.kotlin.core.chapter08

data class EmailAddress(val email: String?)

data class User(
    val name: String?,
    val age: Int?,
    val email: EmailAddress?,
)

fun processUserInformation(user: User?): String {
    if (user == null) {
        return "Missing user information"
    }

    requireNotNull(user.name)
    if (user.email == null || user.email.email.isNullOrBlank()) {
        return "Missing email"
    }

    return "User ${user.name} is ${user.age ?: 0} years old, email: ${user.email.email}"
}

fun main() {
    println(processUserInformation(null))

    val user1 = User(
        "John",
        30,
        EmailAddress("john@example.com"),
    )
    println(processUserInformation(user1))

    val user2 = User(
        "Alice",
        null,
        EmailAddress("alice@example.com"),
    )
    println(processUserInformation(user2))

    val user3 = User(
        "Bob",
        25,
        EmailAddress(""),
    )
    println(processUserInformation(user3))

    val user6 = User(
        null,
        40,
        EmailAddress("jake@example.com"),
    )
    println(processUserInformation(user6))
}