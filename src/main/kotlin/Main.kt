//Kotlin Flow Control
//Kotlin if expression

//if....code to be executed if the test expression is true.
//else...code to be executed if the test expression if false.

//Example1

fun main() {
    val game = "netball"
    if (game == "football") {
        println(true)
    } else {
        println(false)
    }


//NB....the "else" branch is a must when using "if" as an expression

//Example2 when "if" has more than one expression
    val a = 9
    val b = 3
    if (a < b) {
        println("$a is less than $b")
        println("the maximum variable holds the value of $b")
    } else {
        println("$b is greater than $a")
        println("the minimum value holds the value of $b")
    }

//    kotlin(if...else if..else ladder)
//    Example3
    val number = -1
    if (number > 0) {
        println("positive")
    } else if (number < 0) {
        println("negative")
    } else {
        println("zero")
    }
//Example4
//Kotlin program to check a leap year using "if" expression
    val year = 2023
    val leap = false
    if (year % 4 == 0) {
        println(" leap year")

    } else {
        println("not leap year")
    }
//    Example5
//    Kotlin programme to check whether a number is odd or even
    val num = 9
    if (num % 2 == 0) {
        println("even")
    } else {
        println("odd")
    }


//    kotlin Object Oriented Programming
//    classes and objects are the main objects of "OPP"

//    Kotlin classes and objects
//    Create a class
    val t1 = MathTeacher(25, "Jack")
    t1.teachMaths()

    println()

    val f1 = Footballer(29, "Christiano")
    f1.playFootball()
}

open class Person(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Person(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String): Person(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}

