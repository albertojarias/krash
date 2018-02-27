package _4Classes

class MyPair<F: Any,S>(val first: F, val second: S) {
    override fun toString(): String {
        return "($first, $second)"
    }
}

fun <T: Any> MyPair<T, T>.toList(): List<T> = listOf(first, second)


fun main(args: Array<String>) {
    val p = MyPair(1, "hi")
    val p2 = MyPair(10, 20)
    val l = p2.toList()
    println(p)
    println(l)
}