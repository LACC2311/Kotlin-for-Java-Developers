package com.example.datatypes.nullreferences

fun main(args: Array<String>) {

    /*
    *If we want a variable to be able to contain null, we have to explicitly tell the compiler that
    *by following the type name with a question mark (safe call operator)
    */
    val str: String? = null
    println("What happens when we do this: ${str?.toUpperCase()}")

    /*str2 can't be null because elvis operator assigns a default value when str is null*/
    val str2 = str?: "This is the default value"
    println(str2)

    val something: Any = arrayOf(1, 2, 3, 4)
    /*safe cast operator*/
    val str3 = something as? String
    /*if cast is not possible, we'll get null*/
    println(str3)
    println(str3?.toUpperCase())

    /*
    If we sure an expression can't evaluate to null and we want to tell the compiler because we want to stop
    using the safe call operator, we can follow the expression with two exclamation marks (not-null assertion)
    */
    val strNotNull: String? = "This isn't null"
    /*It'll throw a null pointer exception*/
    //val str4 = str!!.toUpperCase()
    val str4 = strNotNull!!.toUpperCase()

    /*
    val strA: String? = null
    val strB = strA!! //Exception thrown at this line because strB is non-nullable type
    val strC = strB.toUpperCase()
    */

    /*
    *If str is not null then let this function call go ahead
    *The let function uses the object that calls it as the parameter to the lambda
    */
    str?.let { printText(it) }
    strNotNull?.let{ printText(it) }

    val str5: String? = null
    val anotherString = "This isn't nullable"
    /*the equals operator is a safe operator*/
    println(str5 == anotherString)
}

fun printText(text: String) {
    println("printText function: $text")
}

