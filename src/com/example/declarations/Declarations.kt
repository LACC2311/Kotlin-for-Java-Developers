package com.example.declarations

import java.lang.StringBuilder

/*Assign an alias to an existing data type */
typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    /*
    The compiler infer the data type but it can't be changed on the fly
     */

    /*val value is assigned once, is equivalent to final in java*/
    val number = 25
    /*type declaration variableName: dataType */
    val numberI: Int
    numberI = 10
    /*var variables are mutable*/
    var numberV: Int
    /*numberV is underlined because it's mutable, kotlin recommends to use var instead of val as a good practice*/
    numberV = 10
    numberV = 20

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    /* there is no error because employee2 will be assigned just once*/
    if(numberV < number2){
        employee2 = Employee("Jane Smith", 400)
    } else {
        employee2 = Employee("Mike Watson", 150)
    }

    /*to use alias outside this file, we have to import it*/
    val employee: EmployeeSet

    println("================= Equality in Kotlin =================")
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println("====== Structural equality ======")
    /*the use of double equality is equivalent to calling .equals function*/
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    //println(employeeOne.equals(employeeTwo))
    //println(employeeTwo.equals(employeeThree))

    println("====== Referential equality ======")
    /*kotlin use triple equality to check referential equality*/
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo)

    println("====== Not equals ======")
    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)

    println("================= Bit Operators and Smart Casting =================")
    val x = 0x00101101
    val y = 0x11011011
    /*Operators | & don't exist in kotlin*/
    //x | y
    //x & y
    /*we use or and instead*/
    x or y
    x and y

    /*Any can hold any kotlin object*/
    val something: Any = employeeFour
    /*we use operator is instead instanceof*/
    if(something is Employee){
        /*Kotlin use as operator to cast, in this case cast is no needed because Smart casting*/
        val newEmployee = something as Employee
        println(newEmployee.name)
        /*we can use directly something.name because the compiler is doing the casting for us*/
        println(something.name)
    }

    println("================= String templates =================")
    println(employee1)

    val change = 4.22
    println("To show the value of change, we use \$change")
    println("Your change is $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    println("The employee's id is ${employee1.id}")
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        /*Kotlin use $ to print the value of a variable within a string*/
        return "Employee(name=$name, id=$id)"
    }


}