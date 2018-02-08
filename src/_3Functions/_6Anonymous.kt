package _3Functions

fun main(args: Array<String>) {
    val numbers = listOf<Int>(11, -45, 100, -6, -10, 33, 1, -99)
    println(numbers.filter (fun(n) = n > 0))

    // using closures
    var counter = 0
    numbers.filter { it > 0}.forEach { counter += 1 }
    println(counter)

}