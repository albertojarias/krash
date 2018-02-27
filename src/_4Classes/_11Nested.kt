package _4Classes

/*
  Nested and inner classes
  A nested class with no inner modifier cannot reference the container class
  A nested class with the inner modifier can reference the container class, and access its members.
  We instantiate a nested class via the container class
*/

class Outer {
    private val bar: Int = 3

    class Nested {
        fun foo() = Outer().bar
    }
}

val outer = Outer.Nested().foo()

class OuterWithInner {
    private val bar: Int = 1

    inner class Inner {
        fun foo() = bar
        fun refToOuter() = this@OuterWithInner
    }
}

val outerWithInner = OuterWithInner().Inner().foo()

fun main(args: Array<String>) {
    println(outer)
    println(outerWithInner)
}