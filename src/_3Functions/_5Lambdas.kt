package _3Functions

fun sum(x: Int, y: Int): Int = x + y

fun main(args: Array<String>) {
    // Using the normal function sum
    println("2+3 = ${sum(2,3)}")

    // using lambdas
    println("2+3 = ${{ x: Int, y: Int -> x + y }(2, 3)}")

    val sum2: (Int, Int) -> Int = { x, y ->
        println("sum2 statement....")
        x + y
    }

    println("2+3 = ${sum2(2,3)}")

    // Calling API functions and passing lambdas as parameters
    val words = listOf("Mark", "James", "123", "9-5", "Al", "Cool", "2A")
    // filtering
    println(words.filter { w -> w[0].isDigit() })
    println(words.filter { it[0].isDigit() })
}