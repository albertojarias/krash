package _5Miscellaneous

fun returnIntOrNull(): Int? {
    return null
}

fun main(args: Array<String>) {
    // The vars are not nullable by default
    var neverNull: String = "Hello"

    //nullable string:
    var couldBeNull: String? = "World"
    couldBeNull = null

    if (couldBeNull != null) {
        println(couldBeNull.length)
    }

    println("Using safe access operator:")
    println(couldBeNull?.length)

    println("Using the elvis operator:")
    println(couldBeNull?.length ?: 0)


    // Force operator: double exclamation mark = don't worry compiler I know what I am doing, go for it
    println("Using the force operator:")
    couldBeNull = "hello"
    println("The length is: " + couldBeNull!!.length)

    val userJava = UserJava(1, "Bob", true)
    println("userJava.name: " + userJava.name)
    userJava.name = null
    println("\nThe length of the userJava name is: ")
    println("userJava.name?.length: " + userJava.name?.length)

}
