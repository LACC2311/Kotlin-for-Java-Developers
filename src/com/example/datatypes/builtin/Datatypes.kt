package com.example.datatypes

import com.example.datatypes.javacode.DummyClass

fun main(args: Array<String>) {
    /*int is the default datatype for numbers*/
    val myInt = 10
    println("default datatype is Int? ${myInt is Int}")
    /*we can specify Long datatype adding L suffix*/
    var myLong = 22L

    /*
    there's not automatic widening of numbers in Kotlin
    myLong = myInt gives an error
    to fix this we call .toLong function
    */
    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val anotherInt = 5

    /*as in Java, double is the default datatype for floating point*/
    var myDouble = 65.984
    println("This is a Double: ${myDouble is Double}")

    /*we can use f suffix to specify Float*/
    val myFloat = 838.8492f
    println("This is a Float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    /*compiler can infer the type if it sees a single character and single quotes*/
    val char = 'b'
    /*
    we can't assign numeric values to a char variable, like we can in java
    val myChar: Char = 65
    we can't treat characters like numbers in Kotlin
    character have to be treated like characters
     */
    val myCharInt = 65
    println("Char $myCharInt is: ${myCharInt.toChar()}")

    val myBoolean = true
    val vacationTime = false
    /*Kotlin compiles classes to the primitive types, that's why the following code works*/
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)
}