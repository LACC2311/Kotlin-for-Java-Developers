package com.example.accessmodifiers

/*In Kotlin the default visibility is public (everything can see and access the class)*/
fun main(args: Array<String>) {

    val emp = Employee()
    println(emp)

}

/*This class is visible to everything in the same file, so we should be able to use it from our main function*/
private class Employee {

}