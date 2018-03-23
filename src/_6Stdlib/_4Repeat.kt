package _6Stdlib

fun main(args: Array<String>) {
    /**
     * Using repeat
     * public inline fun repeat(times: Int, action: (Int) -> Unit)
     *
     * Executes the given function [action] specified number of [times].
     * A zero-based index of current iteration is passed as a parameter to [action].
     */
    println("Using repeat:")
    repeat(3) { println(it) }
}
