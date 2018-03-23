package _6Stdlib

fun main(args: Array<String>) {
    print("Enter your age: ")
    val userInput: String? = readLine()

    /**
     * Using "let"
     * public inline fun <T, R> T.let(block: (T) -> R): R
     *
     * Calls the specified function [block] with `this` value as its argument and returns its result.
     */

    val r = userInput?.let {
        println("Got it")
        if (it.isNullOrBlank()) 0 else it.toInt()
    }
    println(r)
}