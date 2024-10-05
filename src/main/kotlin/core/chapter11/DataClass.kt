package main.kotlin.core.chapter11

data class Person(
    val name: String,
    val age: Int,
)

fun main() {
    val john = Person("John", 30)
    println(john)

    val jane = john.copy(name = "Jane")
    val newJane = Person("Jane", 30)
    println(jane == newJane)

    println(john.hashCode())
    println(jane.hashCode())
    println(newJane.hashCode())

    val (name, age) = jane
    println(name)
    println(age)
}