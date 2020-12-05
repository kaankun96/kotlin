package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    var name : String? = "Kaan"
    var nameNull : String? = null
    name.let{
        println("$it")
    }

    nameNull.let {
        print("Null")
    }
/*
--------------------------------------------
        Result
--------------------------------------------
        Kaan
--------------------------------------------
*/
}

