package _4Classes
/*
  Sealed classes are used for representing restricted class hierarchies,
  when a value can have one of the types from a limited set, but cannot have any other type.
  A sealed class is abstract by itself, it cannot be instantiated directly and can have abstract members.
 */

sealed class Expression

data class Number(val value: Int) : Expression()
data class Addition(val left: Expression, val right: Expression) : Expression()

fun eval(e: Expression): Int =
    when (e) {
        is Number -> e.value
        is Addition -> eval(e.right) + eval(e.left)
    // else no required
    }

fun main(args: Array<String>) {
    val number = Number(3)
    val number2 = Number(7)
    val addition = Addition(number, number2)
    println(eval(addition))
}