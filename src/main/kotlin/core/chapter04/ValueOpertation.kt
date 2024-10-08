package main.kotlin.core.chapter04

fun main() {
    println(1 + 2 * 3)
    println(10 % 3)
    println(-1 % 3)

    println(8.8 / 4)
    println(10 / 3)

    println(11.toFloat())
    println(10.10.toInt())

    var a = 10
    a += 5
    println(a)
    a -= 3
    println(a)
    println(a++)
    println(a)
    println(--a)
    println(a)

    println(true && false)
    println(true || false)
    println(!!!!true)

    println('A'.code)
    println('A' + 1)
    println('C'.code)

    println("A + B")
    println("A" + "B")
    println("A" + 1)
    println("A" + 1 + 2)
}