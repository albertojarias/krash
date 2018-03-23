package _6Stdlib

// Based on the Map<K, out V> interface

fun main(args: Array<String>) {
    val namesAndAges = mutableMapOf<String, Int?>(Pair("Al", null),
        Pair("Ray", 35),
        Pair("Tina", 26))
    namesAndAges["Al"] = 41
    namesAndAges["Tom"] = 15
    for ((k, v) in namesAndAges) println("($k, $v)")
}