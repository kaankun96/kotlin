package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four")
    val (match, rest) = numbers.partition { it.length > 3 }

    println(match)
    println(rest)

/*
--------------------------------------------
        Result
--------------------------------------------
        [three, four]
        [one, two]
--------------------------------------------
*/
}