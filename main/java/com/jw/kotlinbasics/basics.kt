package com.jw.kotlinbasics

fun main () {
    // Immutable variable
    // TODO: Add new functionality
    /* This is
        a multi line comment
     */

    // type String
//    val myName = "JW"
    // type Int
//    var myAge= 31

    // Integer TYPES: Byte (8-bit), Short (16-bit), Int (32-bit), Long (64-bit)
    // NOT NEEDED
//    val myByte: Byte = 13
//    val myShort: Short = 235
//    val myint: Int = 123123123
//    val myLong: Long = 39_812_823_236_232_932

//    // type Float: Float (32 bit), Double (64 bit)
//    val myFloat: Float = 13.37F
//    val myDouble: Double = 3.14159265359
//
//    // Booleans
//    var isSunny = true
//    isSunny = false
//
//    // Characters
//    val letterChar = 'A'
//    val digitChar = '1'
//    val symbolChar = '$'
//
//    // strings
//    val myStr = "Hello World"
//    var firstCharInStr = myStr[0]
//    var lastCharInStr = myStr[myStr.length - 1]
//    var myLength = myStr.length
//    println ("Last Character $lastCharInStr and the length of the string is ${myStr.length}")


//    val name: String = "Android Masterclass"
//    val decimal: Float = 13.37F
//    val pi: Double = 3.14159265358979
//    val age: Byte = 25
//    val year: Short = 2020
//    val serialNo: Long = 18881234567
//    val boolean: Boolean = true
//    val firstChar: Char = 'a'
//    println("hello $myName")

//    // Arithmetic operators (+, -, *, /, %)
//    var result = 5+3
//    val a = 5.0
//    val b = 3
//    var resultDouble: Double
//    resultDouble = a/b
////    println(resultDouble)
//
//    // Comparison operators (==, !=, <, >, <=, >=)
//    val isEqual = 5==3
////    println("isEqual is $isEqual")
//
//    val isNotEqual = 5!=5
//    println("isNotEqual is $isNotEqual")

//    println("is-5Greater3 ${-5>3}")
//    println("is 5LowerEqual3 ${5 <= 3}")
//    println("is 5GreaterEqual3 ${5 >= 3}")

    // Assignment operators (+=, -=, *=, /=, %=)
//    var myNum = 5
//    myNum += 3
//    println("myNum is $myNum")
//    myNum *= 4
//    println("myNum is $myNum")

    // Increment and decrement operators (++, --)
//    println("myNum is ${myNum++}")
//    println("myNum is ${myNum--}")
//    println("myNum is ${--myNum}")

//    var heightPerson1 = 170
//    var heightPerson2 = 159
//
//    if(heightPerson1 > heightPerson2) {
//        println("Use raw force!")
//    } else if (heightPerson1 == heightPerson2){
//        println("Use your power technique 1337")
//    } else {
//        println("Use technique!")
//    }
//
//    var age = 30
//
//    if(age >= 30)
//        println("your old")
//
//    if (age >= 16 && age < 70) {
//        println("You may drive!")
//    } else if (age >= 70){
//        println("Drive carefully")
//    } else {
//        println("You're too young")
//    }

//    var name = "Denis"
//    if (name == "Denis") {
//        println("Welcome home $name")
//    } else {
//        println("Who are you?")
//    }
//
//    var isRainy = true
//    if(isRainy) {
//        println("It's rainy")
//    }

//    var season = 3
//    when (season) {
//        1 -> println("It's Spring!")
//        2 -> println("It's Summer!")
//        3 -> {
//            println("It's Fall!")
//            println("It's Autumn!")
//        }
//        4 -> println("It's Winter!")
//        else -> println("Invalid Season")
//    }
//
//    var month = 3
//    when(month) {
//        in 3..5 -> println("spring")
//        in 6..8 -> println("summer")
//        in 9..11 -> println("fall")
//        12, 1, 2 -> println("Winter")
//        else -> println("Invalid Month")
//    }
//
//    var age = 30
//    when(age) {
//        !in 0..20 -> println("You can drink")
//        in 18..20 -> println("You may vote now")
//        16, 17 -> println("You may drive now")
//        else -> println("You're too young")
//    }
//
//    var x: Any = "Jidwe"
//    when (x) {
//        is Int -> println("$x is an int")
//        !is Double -> println("$x is not a Double")
//        is String -> println("$x is a String")
//        else -> println("$x is none of the above")
//    }

//    var x = 100
//    while(x >= 0) {
//        print("$x ")
//        x-= 2
//    }
//
//    println("\nWhile loop is done")

//    var x = 15
//    do{
//        println("$x")
//        x++
//    } while (x <= 10)
//    println("\nDo While loop is done")
//
//    var feltTemp = "cold"
//    var roomTemp = 10
//    while (feltTemp == "cold") {
//        roomTemp++
//        if (roomTemp >= 20) {
//            feltTemp = "comfy"
//            println("It's comfy now")
//        }
//    }

//    for (num in 1 .. 10) {
//        print("$num ")
//    }
//
//    for (i in 1 until 10) {
//        print("$i ")
//    }
//
//    for (i in 10 downTo  1 step 2) {
//        print("$i ")
//    }

//    for (temp in 0..10000) {
//        if (temp > 9000) {
//            println("$temp")
//            println("It's over 9000!!!")
//        }
//    }
//
//    var humidity = 80
//    var humidityLevel = "humid"
//    while (humidityLevel == "humid") {
//        humidity -= 5
//        if (humidity < 60) {
//            humidityLevel = "comfy"
//            println("It's comfy now")
//        }
//    }

//    // Break: Stop the loop totally
//    // Continue: Skip the current iteration and goes to the next iteration
//    for (i in 1 until 20) {
//
//        if (i/2 == 5) {
//            continue
//        }
//        print("$i ")
//        // Skips 11 because 11/2 = 5.5 but truncates to whole no. because it is an integer
//    }

    var result = getAvg(5.3, 3.2932)
    println(result)

}

// Method - a Method is a Function within a class
// Parameter
fun addUp (a: Int, b: Int): Int{
    return a + b
}

fun myFunction () {
    print("Called from myFunction")
}

fun getAvg (a: Double, b: Double): Double {
    var sum = a + b
    return sum/2
}