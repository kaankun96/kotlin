package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four")

    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("a") })
    println(numbers.all { it.endsWith("e") })
/*
--------------------------------------------
        Result
--------------------------------------------
        true
        true
        false
--------------------------------------------
*/
}