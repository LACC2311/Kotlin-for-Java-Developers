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

    /*to use alias outside this file, you have to import it*/
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
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            return name == obj.name && id == obj.id
        }
        return false
    }

}