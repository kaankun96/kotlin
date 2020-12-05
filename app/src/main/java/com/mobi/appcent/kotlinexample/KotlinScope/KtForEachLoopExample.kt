package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    var peopleNameList:List<String> = listOf<String>("Kaan","Arda","Hasan")
    peopleNameList.forEach {
        println(it)
    }
/*
--------------------------------------------
        Result
--------------------------------------------
        Kaan
        Arda
        Hasan
--------------------------------------------
*/
}