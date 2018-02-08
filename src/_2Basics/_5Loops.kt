package _2Basics

fun main(args: Array<String>) {
    val range = 1..10 step 2
    for(i in range) println(i)

    val odds = 19 downTo 1 step 2
    odds.forEach { println(it) }

    // For loop on a list
    val towns = listOf("Toronto", "London", "Vancouver", "Montreal")
    println("\nList of towns:")
    towns.forEach { println(it) }

    // The while loop, example for 5 iterations
    var i = 5
    while (i > 0) {
        // Do computations here
        i--
    }

    // do while loop, example for 12 iterations, the break does not happen
    val flag = false
    var counter = 1
    do {
        // Do computations here
        if (flag) break
        counter++
    } while (counter <= 12)

    // Using break, continue and labels to jump out of loops
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if ((i / j) == 3) {
                println("$i divided by $j = 3 ")
                if ((i + j) > 8)
                    break@loop
                continue
            }
            println("I am in the inner loop")
        }
    }
}
