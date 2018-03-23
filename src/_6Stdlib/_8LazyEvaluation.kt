package _6Stdlib

// Lazy evaluation

fun main(args: Array<String>) {
    val range = 1..100_000_000_000
    range.asSequence().filter { it < 10 }.map { it * it }.forEach { println(it) }

    val selected2 = range.asSequence().take(10).map { it * 2 }
    selected2.forEachIndexed { index, n -> println("$index - $n") }

    val seq = generateSequence (1) { it + it }
    seq.take(10).forEach { print("$it, ") }

    val d: Double by lazy { Math.cos(0.5) }
    // In the following line the d is calculated
    println(d)
}