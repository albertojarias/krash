package _6Stdlib

import _4Classes.*

// Calls the specified function [block] with the given [receiver] as its receiver and returns its result.
// public inline fun <T, R> with(receiver: T, block: T.() -> R): R

fun main(args: Array<String>) {
    // Using with
    val account = BankAccount("Mark")
    val newBalance = with(account) {
        deposit(100.0)
        (1..10).forEach { withdraw(it.toDouble()) }
        println("Account id: $id, balance: $balance")
        balance
    }
    println(newBalance)
}