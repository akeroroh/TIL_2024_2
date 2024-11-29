package com.tutorials.kotlinbasics

fun main() {
    val fruitList = mutableListOf("Apple", "Banana", "Peach", "strawberry", "watermelon")
    println(fruitList)

    fruitList.add("melon")
    println(fruitList)

    fruitList.remove("strawberry")
    println(fruitList)

    val hasApple = fruitList.contains("Apple")
    if (hasApple) {
        println("Has Apple in the list")
    } else {
        println("Has no Apple in the list")
    }
}
