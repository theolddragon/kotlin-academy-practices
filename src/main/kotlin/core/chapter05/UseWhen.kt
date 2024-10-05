package main.kotlin.core.chapter05

private val magicNumbers = listOf(7, 13)

fun name(a: Any?): String = when (a) {
    null -> "Nothing"
    1, 2, 3 -> "Small number"
    in magicNumbers -> "Magic number"
    in 4..100 -> "Big number"
    is String -> "String: $a"
    is Int, is Long -> "Int or Long: $a"
    else -> "No idea, really"
}

fun main() {
    println(name(1))
    println(name("A"))
    println(name(null))
    println(name(5))
    println(name(100))
    println(name('A'))
    println(name("1"))
    println(name(-1))
    println(name(101))
    println(name(1L))
    println(name(-1))
    println(name(7))
    println(name(3))
    println(name(3.0))
    println(name(100L))
}