package _2Basics

// Char and String
fun main(args: Array<String>) {
    // Char
    val myInitial = 'A'
    val myInt: Int = myInitial.toInt()

    // String
    var name = "Ricky Smith"
    println(name[0])
    for (c in name) println(c)

    val headLine = "\tCanada news!\n" // Using escaped chars
    var header = headLine + " Toronto, Jan 5, 2018"  // Concatenation
    println(header)

    // Multi-line string, raw string, no escaping of characters
    val header2 = """  Fake news
    a big challenge\n
      NY, Jan 15"""
    println(header2)

    // String interpolation
    var age = 30
    val message = "Ricky's age is $age"
    val anotherMessage = "Ricky is turning ${age + 1 } years old"

    println(message)
    println(anotherMessage)

    // Strings are immutable
    name = "RICHARD SMITH"  // invalid: name[0] = "X"

    // String builder, when we need to mutate a large string
    val mutable = StringBuilder("b123456e")
    val theLength = mutable.length
    for (i in 0..theLength/2) mutable[i] = mutable[theLength - i - 1]
    println(mutable)
}
