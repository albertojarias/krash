package _5Miscellaneous

/**
 * Tuples:
 * Pairs and Triples
 * Pair and Triple are data classes that are part of the Kotlin Standard Library
 * Pair represents two generic types
 */

fun nameAndAge(id: Long): Pair<String, Int> =
    when (id) {
        1L ->   Pair("Mike", 35)
        2L ->  "Charles" to 29
        else -> Pair("Tom", 46)
    }

fun main(args: Array<String>) {
    val p = Pair("Al", 40)

    val p2 = nameAndAge(12)
    println(p2.second)  // Prints 46

    val t = Triple("Word", 23, true)
    println(t.third)  // Prints true

    val (personName, personAge) = p2  // Deconstructing a pair
    println(personName)  // Prints Tom

    val myList = listOf(Pair("Mike", 35), "Charles" to 29, Pair("Tom", 46))

    println("\nThe list of names is:")
    // deconstructing in the for loop
    for((n, a) in myList) {
        println("- $n")  // Prints the name
    }
}