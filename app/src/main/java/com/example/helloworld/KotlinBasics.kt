package com.example.helloworld

fun main() {
//    immutable variable
//    TODO: Add new functionality
//    type string
    val myName = "Mairis"
//    type int
    var myAge = 30
    
//    Integer TYPES: Byte (8bit), Short (16bit), Int (32 bit), Long (64bit)
    val myByte: Byte = 13
    val myShort: Short = 12345
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300
    
//    Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846
    
    //    Booleans he type Boolean is used to represent logical values.
    //    It can have two possible values true and false
    var isSunny = true
    isSunny = false
    
    //    Characters
    val letterChar = "A"
    val digitChar = "1"
    
//    Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length -1]
    
//    print("Last Character " + lastCharInStr)
    
//    Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b
//    print(resultDouble)
    
//    Comparison operators ( ==, !=, <, >, <=, >= )
    val isEqual = 5==3
//    println("isEqual is $isEqual")
    
    val isNotEqual = 5!=5
    
//    string interpolation
//    println("isNotEqual is $isNotEqual")
//
//    println("is5greater3 ${-5>3}")
//    println("is5LowerEqual3 ${5 <= 3}")
//    Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
//    println("myNum is $myNum")
    
//    Increment & Decrement operators (++, --)
//    myNum++
//    println("myNum is $myNum")
//    println("myNum is ${myNum++}") /*runs after the line is finished */
//    println("myNum is ${++myNum}") /*runs at a beginning of a line */
//    println("myNum is ${--myNum}")
//
    var heightPerson1 = 170
    var heightPerson2 = 157
    
//    if(heightPerson1 > heightPerson2) {
//        println("use raw force")
//    } else if(heightPerson1 == heightPerson2) {
//        println("use your power technique 1337")
//    }
//    else {
//        println("use technique")
//    }
    
    /*if >=21 - you may drink in us
    else if >=18 - you may both
    else if <16 -older than 16 you may drive
    else non of these are true you are too young to drive
     */
//
//    var personAge1 = 13
//
//
//    if(personAge1 >= 21) {
//        println("you may drink in us ")
//    } else if (personAge1 >= 18) {
//        println("you may both")
//    } else if(personAge1 >= 16) {
//        println("you may drive")
//    } else {
//        println("you are too young to drive")
//    }
//
//    var name = "Mairis"
//
//    if(name == "Mairis") {
//        println("Welcome Home")
//    } else {
//        println("Who are you?")
//    }
//
//    val isRainy = true
//    if(isRainy){
//    println("It's rainy")
//    }
//
//    var season = 3
//    when(season) {
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("Winter")
//        else -> println("Invalid Season")
//    }
//
//    var month = 3
//    when(month) {
//        in 3..5 -> println("Spring")
//        in 6..8 -> println("Summer")
//        in 9..11 -> println("Fall")
//        12, 1, 2 -> println("Winter")
//        else -> println("Invalid Season")
//    }
//
//    var age = 31
//
//    when(age) {
//        !in 0..20 -> println("Now you may drink in USA")
//        in 18..20 -> println("You may vote now")
//        16, 17 -> println("You may drive now")
//        else -> println("You're too young")
//    }
//
//    var x : Any = "13.37f"
//    when(x) {
//        is Int -> println("$x is an Int")
//        !is Double -> println("$x is not a Double")
//        is String -> println("$x is a String")
//        else -> println ("$x is non of the above")
//    }
////    While Loop executes block of code repeatedly as long as a given condition is true
//    var y = 1
//    while(y <= 10) {
//        println("$y")
//        y++
//    }
//    println("While loop is done")
//
//    var z = 100
//    while(z >= 0) {
//        println("$z")
//        z -= 2
//    }
////   Do While loop
//    var q =100
//    while(q >=0 ) {
//        print("$q")
//        q -= 2
//    }
//    q = 15
//    do{
//        print("$q")
//    q++
//    }while(q <= 10)
//    println("\nDo while loop is done")

//    var feltTemp = "cold"
//    var roomTemp = 10
//    while (feltTemp == "cold") {
//        roomTemp++
//        if(roomTemp >= 20) {
//            feltTemp = "comfy"
//            println("it's comfy")
//        }
//    }

//    FOR LOOPS
//    for(num in 1..10) {
//        print("$num ")
//    }
//
//    for(i in 10 downTo 1 step 2) {
//        print("$i ")
//    }
    for (num in 1..10000) {
        if(num == 9001)
            print("IT'S OVER 9001")
    }
    
    var humidityLevel = 80
    var humidity = "humid"
    
    while (humidity == "humid") {
        humidityLevel-=5
        println("Humidity Decreased")
        if (humidityLevel < 60) {
            humidity = "comfy"
            println("it's comfy now")
        }
    }

}
