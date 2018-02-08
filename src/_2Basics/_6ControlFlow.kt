package _2Basics

fun main(args: Array<String>) {
    var age = 21
    if (age >= 19) println("Old enough")

    // if as an expression
    age = 14
    val group = if (age <= 12) "kid" else if (age < 20) "teenager" else "adult"
    println(group)

    // when is like the switch in c-like languages, the break is not necessary
    val feedback = when (age) {
        1, 2 -> {
            "Baby"
        }
        in 3..12 -> {
            "Kiddo"
        }
        33 -> {
            println("This is a statement")
            println("You might have a multi-statement block here")
            "Lucky age"
        }
        is Int -> {
            println("Correct data type")
            "It's an integer."
        }
        else -> {
            "Something is wrong"
        }
    }
    println(feedback)
}