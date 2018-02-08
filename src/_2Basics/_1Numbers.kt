package _2Basics

fun main(args: Array<String>) {
    // Numbers: Int, Long, Short, Byte, Double, Float

    // Int
    var counter = 10
    counter += 1
    println(counter.rem(3))

    val defaultColor: Int = 0xFF
    val address = 0b10001010_10110010
    println(defaultColor)  // Print 255

    // Long
    var bigNumber = -123_456_789_000L

    // Byte
    val position: Byte = -1
    bigNumber = position.toLong()


    // Double and Float
    val PI = 3.14159265
    val amount = 5_123.25F // Float
    val amount2 = bigNumber.toDouble()
    val distance: Double = 5.298e12
    println("Cosine of PI = ${Math.cos(PI)}")  // Print -1.0
}