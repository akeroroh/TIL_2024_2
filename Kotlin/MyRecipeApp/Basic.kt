package com.tutorials.myrecipeapp

fun main() {
    var number: Int
    println("please enter a number")
    try {
        number = readln().toInt()
        println("User entered $number")
    } catch (e: Exception) {
        println("Error ${e.message}")
    } finally {
//        println("This will be execute regardles. Error or no error")
        number = 0
    }





}