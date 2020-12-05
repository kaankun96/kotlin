package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    val numbers = listOf("oneoneone", "two", "three", "four")
    val filteredNot = numbers.filterNot { it.length <= 3 }

    println(filteredNot)

/*
--------------------------------------------
        Result
--------------------------------------------
        [oneoneone, three, four]
--------------------------------------------
*/
}