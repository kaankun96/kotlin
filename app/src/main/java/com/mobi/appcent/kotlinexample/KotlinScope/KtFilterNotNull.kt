package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    val numbers = listOf(null, "one", "two", null)
    numbers.filterNotNull().forEach {
        println(it)
    }
/*
--------------------------------------------
        Result
--------------------------------------------
        one
        two
--------------------------------------------
*/
}