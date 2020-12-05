package com.mobi.appcent.kotlinexample.String

fun main(args: Array<String>) {
    val text = "Merhaba Ben Kaan KÜN"
    val splitArray = text.split(" ")
    println(splitArray.size)
    splitArray.forEach {
        println(it)
    }
/*
--------------------------------------------
        Result
--------------------------------------------
        4
        Merhaba
        Ben
        Kaan
        KÜN
--------------------------------------------
*/
}