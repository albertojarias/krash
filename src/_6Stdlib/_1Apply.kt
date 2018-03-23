package _6Stdlib

//Using Apply
//Calls the specified function [block] with `this` value as its receiver and returns `this` value.
//public inline fun <T> T.apply(block: T.() -> Unit): T
fun intArray(size: Int, initial: Int) = IntArray(size).apply { fill(initial) }

fun intArray2(size: Int, initial: Int): IntArray {
    val arr = IntArray(size)
    arr.fill(initial, 0, size-1)
    return arr
}

fun main(args: Array<String>) {
    val arr = intArray(3, 10)
    arr.forEach { print("$it, ") }

    println("\narr2:")

    val arr2 = intArray2(3, 10)
    arr.forEach { print("$it, ") }
}