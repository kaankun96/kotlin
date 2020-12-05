package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    val number : Int = 120
    println(number.takeIf{it.rem(3) == 0})

    val numberSec : Int = 121
    println(numberSec.takeIf{it.rem(3) == 0})
/*
--------------------------------------------
        Result
--------------------------------------------
        120
        null
--------------------------------------------
*/
}