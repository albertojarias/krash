package _5Miscellaneous

fun foo(o: Any) {
    if (o is String) println(o.length)
}

fun foo2(o: Any) {
    if (o !is String) return
    println(o.length)
}

fun foo3(o: Any) {
    if (o is String && o.length > 0) println(o.length)
}

fun foo4(o: Any) {
    when(o) {
        is Int -> print(o * 2)
        is IntArray -> print(o.sum())
    }
}