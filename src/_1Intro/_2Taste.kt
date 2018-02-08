package _1Intro
// From the lesson: "What is Kotlin and Why Kotlin?", in module 1

// Given an integer, we want to add it to the numbers in an array of any size.
fun Int.addTo(vararg arr: Int) = this + arr.sum()

fun main(args: Array<String>) {
    // Test: print to the console the result of adding 3 to (1, 2, 3)
    println("3 added to 1, 2, and 3 = ${3.addTo(1, 2, 3)}")
}