package _2Basics

fun main(args: Array<String>) {
    // Arithmetic
    var counter  = 6
    val result = (((10 + 2 - counter) / 2) * 4) % 3
    println(result)

    // The arithmetic operations are overloaded to handle conversions
    val aLong = 12345678L + 2
    println(aLong)

    // Logical operators. Equality and Comparison operators, the if-else expression
    val s = "Rob"
    val s2 = "Rob"
    val label = if ((3 < counter) && (s === s2)) "Yes" else "No"

    // Bitwise operations, bitwise or the shift two bits to the right, then invert the bits
    val theInt = ((0b10101010_00001111 and 0b01010101_11110000) shl 2).inv()
    println(theInt)

    // Assignment operator
    counter = 1
    counter +=2  // counter = counter + 2
    counter *= 2
    println(counter)

    // Lambda expression
    val friends = listOf("Bob", "Ariana", "Carl", "Arthur")
    val chosenFriends = friends.filter { x ->  x.startsWith("A") }
    println(chosenFriends)
}