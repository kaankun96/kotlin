package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    val numbers = listOf(null, 1, "two", 3.0, "four")
    println("All String elements in upper case:")
    numbers.filterIsInstance<String>().forEach {
        println(it.toUpperCase())
    }
/*
--------------------------------------------
        Result
--------------------------------------------
        All String elements in upper case:
        TWO
        FOUR
--------------------------------------------
*/
}