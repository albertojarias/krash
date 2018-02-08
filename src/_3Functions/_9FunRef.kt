package _3Functions

fun isEven(k: Int) = k % 2 == 0

fun Int.isOdd() = this % 2 == 1

fun main(args: Array<String>) {
    val digits = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Display only the even digits, filter using a function reference
    println(digits.filter(::isEven))

    digits.filter(Int::isOdd).forEach(::println)
}