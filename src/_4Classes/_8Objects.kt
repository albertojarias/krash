package _4Classes

import java.time.LocalDate

/**
 * Singletons, Classes with companion objects, and Object expressions
 */

// Singleton
object Keys {
    val userId = "fr12346"
    val key1 = "2342345"
    val key2 = "AR78erT"
    var counter = 1
    fun getCurrentDate() = LocalDate.now()
}

// Class with companion object
class Account(val name: String) {
    val id = Account.sequenceNext()
    private var balance = 0.0
    fun deposit(amount: Double) { balance += amount }
    // ... more methods here

    companion object {
        private var lastNumber = 0

        fun sequenceNext() = ++lastNumber
    }
}


fun main(args: Array<String>) {
    // Using the singleton Keys
    println(Keys.key1)
    Keys.counter++
    println(Keys.counter)
    println(Keys.getCurrentDate())

    // Creating two accounts
    val myAccount = Account("Alberto")
    myAccount.deposit(300.0)
    val herAccount = Account("Amy")
    println("Amy's account id is = ${herAccount.id}")
    println("The next number in the sequence is ${Account.sequenceNext()}")

    //Object expression or anonymous objects
    val bobby = object {
        val name = "Bob"
        var age =43
        fun foo() = name.length
    }
    bobby.age++
    println("Older Bobby will be ${bobby.age} years old, and his name is ${bobby.foo()} letters long")
}