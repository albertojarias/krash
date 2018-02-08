package _3Functions

// calculates the fixed point of cosine
// c is a fixed point of the function f(x) if and only if f(c) = c
private fun cosineFixedPoint(): Double {
    var x = 1.0
    var y = Math.cos(x)
    while (true) {
        if (x == y) return y
        x = y
        y = Math.cos(x)
    }
}

tailrec fun cosineFixedPoint2(x: Double = 1.0): Double = if (x == Math.cos(x)) x else cosineFixedPoint2(Math.cos(x))

fun main(args: Array<String>) {
    println(cosineFixedPoint())
    println(cosineFixedPoint2())
}
