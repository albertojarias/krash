package _4Classes

//import java.time.LocalDate
//import java.time.Month
import java.time.*

class Person(val id: Int, var name: String, var activeFlag: Boolean, val dateOfBirth: LocalDate) {
    init {
        name = name.toUpperCase()
    }

    fun getAge(): Int = dateOfBirth.until(LocalDate.now()).years

    // Property with a setter
    // Health card, MUST be 10 chars long and start with a letter
    var healthCard: String = ""
        set(value) {
            if ((value.length != 10) || !value[0].isLetter()){
                throw IllegalArgumentException("Invalid code")
            }
            field = value.capitalize()
        }

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