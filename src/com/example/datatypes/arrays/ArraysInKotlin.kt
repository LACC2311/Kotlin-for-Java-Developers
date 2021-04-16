package com.example.datatypes.arrays

import com.example.datatypes.javacode.DummyClass
import java.math.BigDecimal

fun main (args: Array<String>) {

    /*In Kotlin Arrays are actually Collections*/
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    /*Two ways to declare an array of Longs
     *1 - include the L suffix for all the numbers
     *2 - specify the type
     */
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    /*If we don't specify the type, it will be an array of Integers */
    val longs3 = arrayOf(1, 2, 3, 4)

    println("========== Array type comparison ==========")
    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    /*this gives an error*/
    //println(longs3 is Array<Long>)
    println(longs3 is Array<Int>)
    /*Collections use the usual array indexing*/
    println(longs1[2])

    /*Use of Array constructor and initialising with a lambda expression*/
    val evenNumbers = Array(16){ i -> i * 2 }
    /*The original for loop isn't even available in Kotlin*/
    println("========== Iteration through an Array ==========")
    for(number in evenNumbers) {
        println(number)
    }
    /*Initializes numbers from 1 to 100,000*/
    val lotsOfNumbers = Array(100_000) { i -> i + 1 }
    /*Initializes an array full of zeroes*/
    val allZeroes = Array(100) { 0 }

    println("========== Int Array ==========")
    /*If we don't initialise the array at declaration time, we have to explicitly tell the compiler what type we want*/
    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for(number in someArray){
        println(number)
    }

    println("========== Reassigned Array ==========")
    /*the lambda expression to initialise an Array can be used whenever we want*/
    someArray = Array(6) { i -> (i + 1) * 10 }
    for(number in someArray){
        println(number)
    }

    println("========== Mixed Array ==========")
    /*We can mix datatypes in an Array (is actually an array of Any)*/
    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for(element in mixedArray) {
        println(element)
    }

    val myIntArray = arrayOf(3, 9, 434, 2, 33)
    /*We can't just call Java methods that want primitive arrays without having to do anything special*/
    //DummyClass().printNumbers(myIntArray)

    println("========== Primitive type Array ==========")
    val myPrimitiveIntArray = intArrayOf(3, 9, 434, 2, 33)
    DummyClass().printNumbers(myPrimitiveIntArray)

    println("========== Defined size Array ==========")
    /*We can specify the array size if we use an array of primitive types*/
    var someOtherArray = IntArray(5)
    /*they're initialises automatically with the default value for the primitive type*/
    for(number in someOtherArray) {
        println(number)
    }

    println("========== Converted Arrays ==========")
    /*From general to primitive*/
    DummyClass().printNumbers(evenNumbers.toIntArray())
    /*From primitive to general*/
    val convertedIntArray = myPrimitiveIntArray.toTypedArray()
}