package _5Miscellaneous


// an alias for any Kotlin type, example using generic types
typealias FileTable<K,File> = MutableMap<K, MutableList<File>>

// an alias using a function type
typealias myFunType = (String, Int) -> Boolean

fun foo(p: myFunType) = p("alberto", 10)

fun validate(password: String, minLength: Int) = password.length >= minLength

val validate2: myFunType = { password, minLength -> password.length >= minLength }

fun main(args: Array<String>) {
    println(validate2("password123", 6))
    println(foo(validate2))
}