package _4Classes

// Using a primary constructor and a default parameter
class Car(val id: Int, var ownerName: String, var isActive: Boolean = true)

// Long version
class Car2 constructor(_id: Int, _ownerName: String, _isActive: Boolean = true) {
    val id: Int
    var ownerName: String
    var isActive: Boolean

    init {
        id = _id
        ownerName = _ownerName
        isActive = _isActive
    }
}

// Using secondary constructors
class Car3 {
    val id: Int
    var ownerName: String
    var isActive: Boolean

    constructor(_id: Int, _ownerName: String, _isActive: Boolean = true) {
        id = _id
        ownerName = _ownerName
        isActive = _isActive
    }

    constructor(_id: Int, _ownerFirstName: String, _ownerLastName: String, _isActive: Boolean = true) {
        id = _id
        ownerName = _ownerFirstName + " " + _ownerLastName
        isActive = _isActive
    }
}

fun main(args: Array<String>) {
    val lambo = Car(2, "Tom White")
    val mazda = Car2(_ownerName = "Mia Hamilton", _id = 12)
    println(lambo.ownerName)
    println(mazda.ownerName)

    val custom = Car3(3, "Leonardo", "Da Vinci")
    println(custom.ownerName)
}