package _4Classes

import java.time.LocalDate

/*
  Interfaces are "contracts" that classes may inherit and implement
  They are reusable components that can have properties and functions.
  The properties must be either abstract or they can have getter and/or setters, so an interface cannot store state.
  The functions can be abstract or a complete implementation.
  The abstract members do not need the abstract modifier.
  A class may implement one or more interfaces.
  A class cannot extend more than one class like Java and C#
  All the members are implicitly open for implementation or to be overridden
 */

open class Human(var name: String, var isAlive: Boolean, val dateOfBirth: LocalDate)

interface Employee {
    val dateHired: LocalDate
    var salary: Double
    val numberOfDays: Int get() = dateHired.until(LocalDate.now()).days

    fun increaseSalary(percentage: Double) {
        salary *= ( 100 + percentage ) / 100
    }

    fun magicNumber(seed: Int): Double
}

interface AnotherInterface {
    val aProperty: String
}

class BankEmployee(name: String, isAlive: Boolean, dateOfBirth: LocalDate):
    Human(name, isAlive, dateOfBirth),
    Employee,
    AnotherInterface {
    override val dateHired: LocalDate = LocalDate.now()
    override var salary: Double = 50000.0
    override val aProperty: String = "Whatever"

    override fun magicNumber(seed: Int): Double {
        return 1.0
    }
}

fun main(args: Array<String>) {
    val rob = BankEmployee("Rob", true, LocalDate.of(1975, 11, 12))
    rob.increaseSalary(10.0)
    println(rob.salary)
}




