package function.chapter07

inline fun <reified T> Iterable<*>.anyOf(): Boolean {
    return this.any { it is T }
}

inline fun <reified T> Iterable<*>.firstOfOrNull(): Any? {
    return this.firstOrNull { it is T }
}

inline fun <reified T, reified R> Map<*, *>.filterValuesInstanceOf(): Map<Any?, Any?> {
    return this.filter { it.key is T && it.value is R }
}

fun main() {
    val list = listOf(1, "A", 3, "B")
    println(list.anyOf<Int>()) // true
    println(list.anyOf<String>()) // true
    println(list.anyOf<Double>()) // true

    println(list.firstOfOrNull<String>()) // A
    println(list.firstOfOrNull<Int>()) // 1
    println(list.firstOfOrNull<Double>()) // null

    val map = mapOf(1 to 2, 2 to "A", 3 to 4, "B" to "C")
    println(map.filterValuesInstanceOf<Int, String>()) // {2=A}
    println(map.filterValuesInstanceOf<String, String>()) // {B=C}
    println(map.filterValuesInstanceOf<Int, Int>()) // {1=2, 3=4}
    println(map.filterValuesInstanceOf<String, Int>()) // {}
}