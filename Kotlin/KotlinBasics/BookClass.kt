package com.tutorials.kotlinbasics

fun main() {
    var myBook = Book()
    println(myBook.author)
    var customBook = Book("you", "are", 24)
    println("${customBook.title} ${customBook.author} ${customBook.yearPublished}")
}