package _4Classes

// By default classes and members are final, you have to put the modifier open to extend
open class Base {
    open fun v() {}
    fun v2() {
        println("Base.v2()")
    }
}

class Derived: Base() {
    override fun v() {}
}

fun main(args: Array<String>) {
    val derived = Derived()
    derived.v2()
}