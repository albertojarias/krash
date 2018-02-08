package _4Classes

// More about class properties

import java.time.LocalDate
import java.time.Month

class Person2(val id: Int, var name: String, var activeFlag: Boolean, val dateOfBirth: LocalDate) {
    // Read-only property
    val age: Int
        get() = dateOfBirth.until(LocalDate.now()).years

    override fun toString(): String {
        return "($id, $name)"
    }

    // Property with a setter
    // Health card, MUST be 10 chars long and start with a letter
    var healthCard: String = ""
        set(value) {
            if ((value.length != 10) || !value[0].isLetter()){
                throw IllegalArgumentException("Invalid code")
            }
            field = value.capitalize()
        }
}

fun main(args: Array<String>) {
    val rob = Person2(1, "Rob Smith", true, LocalDate.of(1985, Month.FEBRUARY, 1))
    println(rob.age)
    rob.healthCard = "w123456789"
    println(rob.healthCard)
}