package com.tutorials.rockpaperscissors

fun main() {
    println("숫자를 입력해주세요: ")
    var inputString = readln()
    var inputNumber = inputString.toInt()

    var multiplier = 5

    println("연산 결과는 " + (multiplier*inputNumber))
}