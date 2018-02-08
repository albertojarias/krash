package _3Functions

fun String.yell(): String = this.toUpperCase()+ "!"

// Adding a new property to the class StringBuilder
var StringBuilder.firstChar: Char
    get() = get(0)
    set(value: Char) {
        this.setCharAt(0, value)
    }

infix fun String.repeat(times: Int): String {
    val result = StringBuilder("")
    for (i in 1..times) result.append(this)
    return result.toString()
}


fun main(args: Array<String>) {
    println("Rob".yell())

    val name = StringBuilder("Rob")
    println(name.firstChar)
    name.firstChar = 'B'
    println(name)

    println("*".repeat(35))
    println("*" repeat 35)
}