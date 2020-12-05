package com.mobi.appcent.kotlinexample.KotlinScope

fun main(args: Array<String>) {
    val student = Student().apply{
        fullName = "$name $surName"
    }

    print(student.fullName)
/*
--------------------------------------------
        Result
--------------------------------------------
        Kaan KÜN
--------------------------------------------
*/
}

data class Student(
    var name : String? = "Kaan",
    var surName : String? ="KÜN",
    var fullName : String? = null,
    var age :Int? = 22
)