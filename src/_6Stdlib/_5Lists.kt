package _6Stdlib

// Based on Java collections
// Mutable, immutable
// Operations: filter, map, Reduce, Fold

fun main(args: Array<String>) {
     // List: Ordered group of objects of the same type

    val amigos = mutableListOf("bob", "carl", "mark")
    println(amigos)
    println(amigos[0])
    println(amigos.indexOf("carl"))
    println(amigos.last())
    println(amigos.isEmpty())
    amigos.add(2, "tom")
    println(amigos)
    println(amigos.filter { it.length >= 4 }.count())

    val numbers = listOf(1, 2, 10, 20, 30)
    println(numbers.reduce({acc , i -> acc + i }))
    println(numbers.fold(100, {acc, i -> acc + i}))

    val children = listOf(Pair("Al", listOf("Dave", "Dan")),
        Pair("Ray", listOf("Nico", "Amy")),
        Pair("Tom", listOf("Steph", "Katty", "Steve")))
    println("The children: ${children.flatMap { it.second }}")
}