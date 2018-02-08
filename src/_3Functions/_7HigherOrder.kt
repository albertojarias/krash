package _3Functions

// Higher order functions example
// my own map function versus the built-in map

fun <T, R> List<T>.map2(transform: (T) -> R): List<R> {
    val r = arrayListOf<R>()
    for (item in this) r.add(transform(item))
    return r
}

fun main(args: Array<String>) {
    val friends = listOf<String>("Bob", "Carlos", "MJ", "Arnold Schwarzenegger")
    println(friends.map{ it.toUpperCase() }) // displays: [BOB, CARLOS, MJ, ARNOLD SCHWARZENEGGER]
    println(friends.map2{ it.toUpperCase() })
}