package _3Functions

// Example of operator overloading
// Implementing a matrix of 2 x 2
// Matrix:    | a  b |
//            | c  d |

class Matrix(val a: Int, val b: Int, val c: Int, val d: Int) {
    operator fun plus(matrix: Matrix) = Matrix(a + matrix.a, b + matrix.b, c + matrix.c, d + matrix.d)

    override fun toString(): String {
        return "| $a  $b |\n| $c  $d|"
    }
}

fun main(args: Array<String>) {
    val m1 = Matrix(1, 2, 3, 4)
    val m2 = Matrix(5, 6, 7, 8)
    val m3 = m1.plus(m2)
    println(m3)
}