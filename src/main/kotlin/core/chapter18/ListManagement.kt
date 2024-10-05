package main.kotlin.core.chapter18

class Inventory {
    private val products = mutableListOf<Product>()
    private val productIdToProducer = mutableMapOf<String, String>()
    private val sellers = mutableSetOf<String>()

    fun addProduct(product: Product, producer: String) {
        products.add(product)
        productIdToProducer[product.id] = producer
    }

    fun removeProduct(product: Product) {
        products.remove(product)
        productIdToProducer.remove(product.id)
    }

    fun getProductsCount(): Int = products.size

    fun hasProduct(product: Product): Boolean = products.contains(product)

    fun hasProducts(): Boolean = products.isNotEmpty()

    fun getProducer(product: Product): String? = productIdToProducer[product.id]

    fun addSeller(seller: String) {
        sellers.add(seller)
    }

    fun removeSeller(seller: String) {
        sellers.remove(seller)
    }

    fun produceInventoryDisplay(): String {
        var result = "Inventory:\n"
        products.forEach { product ->
            result += "${product.name} (${product.category}) - \$${product.price}\n"
            result += "Produced by: ${productIdToProducer[product.id]}\n"
        }
        result += "Sellers : ${sellers}"
        return result
    }
}

class Product(
    val id: String,
    val name: String,
    val price: Double,
    val category: String,
)

fun main() {
    val inventory = Inventory()
    println(inventory.hasProducts())

    val p1 = Product("P1", "Phone", 599.99, "Electronics")
    val p2 = Product("P2", "Laptop", 1199.99, "Electronics")
    val p3 = Product("P3", "Shirt", 29.99, "Clothing")

    inventory.addProduct(p1, "TechCompany")
    inventory.addProduct(p2, "TechCompany")
    inventory.addProduct(p3, "ClothingCompany")

    inventory.addSeller("Seller1")
    inventory.addSeller("Seller2")

    println(inventory.getProductsCount())
    println(inventory.hasProduct(p1))
    println(inventory.hasProducts())
    println(inventory.getProducer(p1))

    println(inventory.produceInventoryDisplay())

    inventory.removeProduct(p2)
    inventory.addSeller("Seller1")
    inventory.removeSeller("Seller2")

    println(inventory.getProductsCount())
    println(inventory.hasProduct(p1))
    println(inventory.hasProduct(p2))
    println(inventory.hasProducts())
    println(inventory.getProducer(p2))

    println(inventory.produceInventoryDisplay())

}