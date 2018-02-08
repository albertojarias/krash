package _4Classes

// Visibility modifiers
open class Mom {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4 // public by default

    fun foo() = a
}

class Son : Mom() {
    // a is not visible here
    // b, c and d are visible

    override val b = 5 // 'b' is protected

    fun getLabel() = "Values of parent class 'Mom' available, b= $b, c= $c, d= $d"
}

class Unrelated(private val m: Mom) {
    // only o.c and o.d are visible (same module)
    fun getLabel() = "Only c= ${m.c} & d= ${m.d} are visible"
}

fun main(args: Array<String>) {
    val mom = Mom()
    println(mom.c)  // Access to c or d, but not to a or b
    println(mom.foo()) // Indirect access to a
    val son = Son()
    println(son.getLabel())

    val son2 = Unrelated(son)
    println(son2.getLabel())
}