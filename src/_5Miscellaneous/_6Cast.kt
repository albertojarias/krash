package _5Miscellaneous

// Unsafe cast operator
fun bar(o: Any?) {
    val str: String? = o as String?  // if the cast is not possible it will throw an exception
    println(str)
}


// Safe cast operator
fun bar2(o: Any) {
    val str: String? = o as? String  // if the cast is not possible it will assign null
    println(str)
}

fun main(args: Array<String>) {
    bar(null)
    bar2(1)
}
