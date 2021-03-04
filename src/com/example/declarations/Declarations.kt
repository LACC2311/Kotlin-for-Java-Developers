package com.example.declarations

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

}

class Employee(var name: String, val id: Int) {

}