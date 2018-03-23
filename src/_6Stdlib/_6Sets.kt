package _6Stdlib

// Sets, are unordered group of unique objects

data class Asset(val id: Int, val name: String, val price: Double, val active: Boolean)

fun main(args: Array<String>) {

    val assets = setOf(Asset(1, "Car", 12500.00, true),
        Asset(3, "iPhone", 550.00, false),
        Asset(2, "Laptop", 1200.00, true),
        Asset(3, "iPhone", 550.00, false))
    println(assets)

    // Total in assets that are active
    println(assets.filter { it.active }.map { it.price }.sum())
}