package com.example.challenge1

fun main(args: Array<String>) {

    //Declare two immutable String variables called hello1 and hello2. Assign "Hello" to both variables.
    val hello1 = "Hello"
    val hello2 = "Hello"

    //Using one line of code, test whether hello1 and hello2 are referentially equal and print the result
    println(hello1 === hello2)

    //Do the same thing as above, but test for structural equality
    println(hello1 == hello2)

    //Declare a mutable variable of type Int and assing it the value of 2988
    var mutable = 2988

    //Declare an immutable variable of type Any and assing it the string "The Any type is the root of the Kotlin class hierarchy"
    //Then, using a smart cast, print out uppercased string
    val immutable: Any = "The Any type is the root of the Kotlin class hierarchy"
    if(immutable is String) {
        println(immutable.toUpperCase())
    }

    //Using one line of code, print out the following. Make sure your code is nicely indented
    //    1
    //   11
    //  111
    // 1111
    println("""
        |   1
        |  11
        | 111
        |1111
    """.trimMargin())

    //Print the same string, but, using 1 as trim character
    println("""
        1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))
}