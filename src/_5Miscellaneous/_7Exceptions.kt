package _5Miscellaneous

class InvalidCodeException(message: String): Throwable(message)

fun isCodeValid(code: String) = (code.length == 12) && (code[0].isLetter())


fun main(args: Array<String>) {
    val success =  try {
        if (!isCodeValid("12345")) throw InvalidCodeException("The code must be 12 char long and start with a letter")
        1
    }
    catch (e: InvalidCodeException) {
        println(e.message)
        -1
    }
    finally {
        println("Thanks for coming!")
    }
    println(success)
}
