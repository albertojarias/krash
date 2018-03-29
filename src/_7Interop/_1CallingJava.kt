package _7Interop

import _5Miscellaneous.UserJava
import java.util.*

fun <T> swap(list: ArrayList<T>, i: Int, j: Int) {
    val x: T = list[i]
    // I can use indexed access
    list[i] = list[j]
    list[j] = x
}

fun main(args: Array<String>) {
    val set = HashSet<String>()
    set.add("Al")
    set.add("Tom")
    set.add("Tom")
    println("$set has ${set.size} items")

    val list = ArrayList<Int>()
    list.add(1)
    val s = list[0]
    //list.add(null)
    list.add(2)
    list.add(3)
    swap(list, 1, 2)
    println(list)

    // Using Java classes
    val user = UserJava(1, "Al", true)
    // I use "name" as a property, so I don't need to use getName nor setName
    user.name = "Carl"
    println(user.name)
}