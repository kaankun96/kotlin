package com.mobi.appcent.kotlinexample.KotlinScope

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {
    val student = Student2().apply{
        fullName = "${name} ${surName}"
    }.also{
        println("Student year of birth ${LocalDate.now().year - it.age!!}")
    }

    print(student.fullName)
/*
--------------------------------------------
        Result
--------------------------------------------
        Student year of birth 1995
        Kaan KÜN
--------------------------------------------
*/
}

//Student Class
data class Student2(
    var name : String? = "Kaan",
    var surName : String? ="KÜN",
    var fullName : String? = null,
    var age :Int? = 25
)