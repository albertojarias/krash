package _4Classes

import java.time.LocalDate

// Data classes, equals, copy, destructuring
data class Vehicle(val id: Int, var licensePlate: String, var ownerId: Int, val dateRegistered: LocalDate)

fun main(args: Array<String>) {
    val car1 = Vehicle(1, "CAEE 111", 1, LocalDate.of(2017, 12, 15))
    println(car1)

    val car2 = Vehicle(1, "CAEE 111", 1, LocalDate.of(2017, 12, 15))
    // Equality, using the Equals
    if (car1 == car2) println("car1 and car2 have the same property values")

    // Referential equality, no equal
    if (car1 !== car2) println("car1 and car2 have different address in memory")

    // Copy method to clone an object
    val car3 = car1.copy(licensePlate = "NEW PLATE 123")

    // Destructuring an object, example of destructuring declaration
    val (id, lp, _, dateReg) = car3
    println("My new car has id $id, with license plate $lp, and it was registered on $dateReg")
}