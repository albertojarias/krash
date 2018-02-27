package _5Miscellaneous

// Any: Supertype of non-nullable types, corresponds to java.lang.Object
// Unit: Same like void in Java, it's a data type
// Nothing: Special return type for functions that never end or never return a value, it does not have values

//This function returns Unit
fun hello() { print("hello") }

interface Parser<T> {
    fun printer(): T
}

class TestParser : Parser<Unit> {
    override fun printer() {}
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(args: Array<String>) {
    var obj: Any = 10

    // Unit is data type with only one value: Unit
    val u: Unit = Unit

}