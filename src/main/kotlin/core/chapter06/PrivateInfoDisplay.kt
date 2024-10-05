package main.kotlin.core.chapter06

fun formatPersonDisplay(
    name: String? = null,
    surname: String? = null,
    age: Int? = null,
): String {
    return (name?.let { "$it " }  ?: "") + (surname?.let { "$it " }  ?: "") + (age?.let { "($it)" }  ?: "")
}

fun main() {
    println(formatPersonDisplay("John", "Smith", 42))
    println(formatPersonDisplay("Alex", "Simonson"))
    println(formatPersonDisplay("Peter", age = 25))
    println(formatPersonDisplay(surname = "Johnson", age = 18))
}