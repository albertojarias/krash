package _4Classes

enum class MaritalStatus {
    SINGLE,
    MARRIED {
        override fun toString(): String {
            return "*** Married ***"
        }
    },
    DIVORCED,
    WIDOWED
}
// Enum with a property and a function
enum class MaritalStatus2(val code: Int) {
    SINGLE(10),
    MARRIED(20),
    DIVORCED(30),
    WIDOWED(40);

    fun message() = when (code) {
        10 -> "Never married"
        20 -> "Under marriage"
        30 -> "Marriage is finished"
        40 -> "Spouse has died"
        else -> "Invalid code"
    }
}

fun main(args: Array<String>) {
    val status = MaritalStatus.DIVORCED
    println(status)
    println(status.ordinal)

    val status2 = MaritalStatus.MARRIED
    println(status2)
    println(status2.ordinal)

    val status3 = MaritalStatus2.WIDOWED
    println("The marital status is ${status3.code} defined as ${status3.message()}")

    println("\nList of all the marital statuses: ")
    MaritalStatus.values().forEach { println(it) }


}