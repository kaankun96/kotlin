package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

/*
--------------------------------------------
        Result
--------------------------------------------
        [three, four]
--------------------------------------------
*/
}