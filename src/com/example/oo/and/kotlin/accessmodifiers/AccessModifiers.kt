package com.example.oo.and.kotlin.accessmodifiers

import java.awt.Stroke

/*In Kotlin the default visibility is public (everything can see and access the class)*/
fun main(args: Array<String>) {

    /*The compiler generates an empty constructor*/
    //val emp = Employee()
    val emp = Employee("John")
    println(emp.firstName)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)

}

/*All the classes in Kotlin are public and final by default*/
/*The long way to declare a constructor, the property and init block*/
//class Employee constructor(firstName: String){
//    val firstName: String
//    /*We don't need the initializer block*/
//    init {
//        this.firstName = firstName
//    }
//    /*We can just combine the declaration and initialization*/
//    val firstName: String = firstName
//}

/*Or we can just do this, declare the property in the signature for the primary constructor*/
/*if we want to change the visibility of the constructor we've got to explicitly include the constructor keyword*/
//class Employee (val firstName: String){
//
//    /*We also need to declare property in the class*/
//    var fullTime: Boolean = true
//
//    /*We need to delegate the first assignment to the primary constructor*/
//    constructor(firstName: String, fullTime: Boolean): this(firstName) {
//        this.fullTime = fullTime
//    }
//}

/*fullTime default value will be true*/
class Employee(val firstName: String, var fullTime: Boolean = true) {

}

/*We don't need to have a primary constructor*/
class Demo {
    val dummy: String

    constructor() {
        dummy = "hello"
    }
}