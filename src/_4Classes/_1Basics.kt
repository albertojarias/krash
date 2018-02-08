package _4Classes

import java.time.LocalDate
import java.time.Month

class Person(val id: Int, var name: String, var activeFlag: Boolean, val dateOfBirth: LocalDate) {
    init {
        name = name.toUpperCase()
    }

    fun getAge(): Int = dateOfBirth.until(LocalDate.now()).years

    override fun toString(): String {
        return "($id, $name)"
    }
}

fun main(args: Array<String>) {
    val rob = Person(1, "Rob Smith", true, LocalDate.of(1985, Month.FEBRUARY, 1))
    println(rob.name)
    println(rob.toString())

    println(rob.getAge())
}