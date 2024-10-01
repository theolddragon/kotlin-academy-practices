package core.chapter12

class Pizza(
    val toppings: List<String>,
) {
    companion object {
        fun hawaiian(): Pizza = Pizza(listOf("ham", "pineapple"))
        fun margherita(): Pizza = Pizza(listOf("tomato", "mozzarella"))
    }
}

fun main() {
    val hawaiian = Pizza.hawaiian()
    println(hawaiian.toppings)

    val margherita = Pizza.margherita()
    println(margherita.toppings)
}