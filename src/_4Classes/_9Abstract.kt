package _4Classes

/*
  Abstract classes are meant to be extended (they are open by default) and cannot create objects from them
  may have properties and functions that can be abstract or not
  If the member is abstract must be overridden and implemented in the subclass.
  A abstract member is implicitly open.
  So that means that the abstract class can have implementations and store state
 */

abstract class TemplateAccount {
    val id = TemplateAccount.sequenceNext()
    var isActive = true
    private var balance = 0.0
    abstract val accountNumber: String

    fun deposit(amount: Double) { balance += amount }
    fun withdraw(amount: Double) { balance -= amount }
    abstract fun xyz() : String


    companion object {
        private var lastNumber = 0

        fun sequenceNext() = ++lastNumber
    }
}

class BankAccount(val clientName: String): TemplateAccount() {
    val bouncedChequesCounter = 0
    override val accountNumber = "xxx-xxxx"
    override fun xyz() = "TODO"
}

fun main(args: Array<String>) {
    val acc = BankAccount("Alberto")
    println(acc.id)
}