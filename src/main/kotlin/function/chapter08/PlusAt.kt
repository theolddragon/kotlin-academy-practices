package main.kotlin.function.chapter08

fun <T> List<T>.plusAt(index: Int, element: T): List<T> {
    require(index in 0..size)
    return this.take(index) + listOf(element) + this.drop(index)
}

fun main() {
    val list = listOf(1, 2, 3)
    println(list.plusAt(1, 4)) // [1, 4, 2, 3]
    println(list.plusAt(0, 5)) // [5, 1, 2, 3]
    println(list.plusAt(3, 6)) // [1, 2, 3, 6]

    val list2 = listOf("A", "B", "C")
    println(list2.plusAt(1, "D")) // [A, D, B, C]
}