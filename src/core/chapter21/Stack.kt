package core.chapter21

class Stack<T> {
    private val data = mutableListOf<T>()

    fun push(item: T) {
        data.add(item)
    }

    fun pop(): T? {
        if (data.isEmpty()) return null
        return data.removeLast()
    }

    fun peek(): T? {
        if (data.isEmpty()) return null
        return data.last()
    }

    fun isEmpty(): Boolean = data.isEmpty()

    fun size(): Int = data.size
}

fun main() {
    val intStack = Stack<Int>()
    intStack.push(1)
    intStack.push(2)
    intStack.push(3)

    val stringStack = Stack<String>()
    stringStack.push("A")
    stringStack.push("B")
    stringStack.push("C")

    println(intStack.peek())
    while (!intStack.isEmpty()) {
        println(intStack.pop())
    }
    println(intStack.peek())
    println(intStack.isEmpty())

    println(stringStack.size())
    while (!stringStack.isEmpty()) {
        println(stringStack.pop())
    }
}