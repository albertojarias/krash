package _3Functions

@JvmOverloads fun circleArea(radius: Double = 1.0) = 3.1415 * radius * radius

fun printHello(name: String) {
    println("Hello $name")
}

fun min(x: Int, y: Int) = if (x < y) x else y

val topLevelProperty = 10

fun main(args: Array<String>) {
    printHello("World")
    println(circleArea())
    println(min(10, 40))

    fun foo(age: Int, factor: Double, message: String): Double {
        println(message)
        return age * factor
    }

    fun foo(age: Int, increment: Int, message: String): Double {
        print(message)
        return (age + increment).toDouble()
    }

    println(foo(message = "25 + 2 = ", age = 25, factor = 2.0))
}