package com.tutorials.kotlinbasics



fun main() {
//    var myAge : Long = 35
//    println(myAge)
//    myAge = 36
//    println(myAge)

//    var pi = 3.14f
//    println(pi)
//    pi = 3.1415926535f
//    println(pi)

//    var age : UShort = 35u
//    println(age)

//    val myTrue : Boolean = true
//    val myFalse : Boolean = false
//
//    println(myTrue || myFalse) // true
//    println(myTrue && myFalse) // false
//    println(!myTrue) // false

//    val myChar = '\\'
//    println(myChar)

//    var firstName = "Denis"
//    var lastName = "Panjuta"
////    name = "Very LONG paragraphs can be stored inside of strings"
//    println(firstName + "\n" + lastName)

//    greater than >
//    lower than <
//    greater equal >=
//    lower equal <=
//    equal ==

//    var age = 0
//    println("Please enter your age as a whole number")
//
////    read what the user has entered into the console
//    val enteredValue = readln()
////    convert the strign variable into an int variable
//    age = enteredValue.toInt()
//
//    if (age >= 18 && age < 40) {
//        println("You can go into the club")
//    } else if (age >= 40){
//        println("You are too old")
//    } else {
//        println("You are too young to go into the club!")
//    }

//    var count = 0
//    while (count < 3) {
//        println("Count is $count")
//        count++
//        //so long this content will be executed
//    }
//    println("Loop is done!")

//    var userInput = readln()
//    while (userInput == "1") {
//        println("While loop executed")
//        userInput = readln()
//    }
//    println("Loop is done!")

//    println("Who is this coffee for?")
//    val name = readln()
//    println("How many pieces of sugar do you want?")
//    val sugarCount = readln()
//    val sugarCountInt = sugarCount.toInt()
//    makeCoffee(sugarCountInt, name)

//    println("Enter number 1")

//    val num1Str = readln()
//    val num1D = num1Str.toDouble()
//    println("Enter number 2")
//    val num2Str = readln()
//    val num2D = num2Str.toDouble()

//    var myResult = add(num1Int, num2Int)
//    var myResult = divide(num1D, num2D)
//    println("The result is $myResult")

    // Creating an object/instance of the class Dog
//    var daisy = Dog("Daisy", "Dwarf poodle", 1)
//    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
//    println("A year has passed!")
//
//    daisy.age = 2
//    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

//    val coffeeForDenis = CoffeeDetails(0, "denis", "xxl", 0)
//    makeCoffee(coffeeForDenis)

//    Immutable List - you cannot add items after the initilization
//    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

//    mutable list - you can add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    println(shoppingList)
    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(2, "RAM")
    println(shoppingList[3])

    shoppingList[3] = "Graphics Card RX 7080XT"
    println(shoppingList)

    shoppingList.set(1, "Water Cooling")
    println(shoppingList)

    val hasRAM = shoppingList.contains("RAM")
    if (hasRAM) {
        println("Has RAM in the list")
    } else {
        println("No RAM in the list")
    }

    for (index in 0 until shoppingList.size) {
        println("item ${shoppingList[index]} is at index $index")
//        if (item == "RAM") {
//            shoppingList.removeLast()
//            break
//        }
    }

    println(shoppingList)
}

data class CoffeeDetails (
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

//fun divide(num1: Double, num2: Double):Double {
//    val result = num1 / num2
//    return result
//}
//
//fun add(num1: Int, num2: Int): Int {
//    val result  = num1 + num2
//    return result
//}

/*
fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    // Call Function
    // makeCoffee(sugarCountInt, name)
}

//Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    } else if (coffeeDetails.sugarCount == 0) {
        println("Coffee with no sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }
}
*/