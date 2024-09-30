package core.chapter09

class Product(
    val name: String,
    val price: Double,
    initQuantity: Int
) {
    var quantity: Int = initQuantity
        set(value) {
            field = if (value < 0) 0 else value
        }

    fun calculateTotalValue(): Double {
        return price * quantity
    }

    fun restock(addQuantity: Int) {
        if (addQuantity > 0) {
            this.quantity += addQuantity
        }
    }
}

fun main() {
    val laptop = Product("Laptop", 999.99, 5)

    println(laptop.name)
    println(laptop.quantity)
    println(laptop.calculateTotalValue())

    laptop.restock(3)

    println(laptop.quantity)
    println(laptop.calculateTotalValue())

    laptop.quantity = -2

    println(laptop.quantity)
    println(laptop.calculateTotalValue())

    laptop.quantity = 10

    println(laptop.quantity)
    println(laptop.calculateTotalValue())
}