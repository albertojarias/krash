package _3Functions

// Given some items of any type, generate a string with all the items separated by comma and a space
fun <T> asString(vararg items: T): String {
    val result = StringBuilder("")
    for ( t in items) result.append("$t, ")
    return result.toString()
}

fun main(args: Array<String>) {
    println(args[0])
    val list = listOf(*args)
    println(list)

    val digits = arrayOf(1, 2, 3)
    val str = asString(-1, -2, *digits, 100, 1000)
    println(str)

}