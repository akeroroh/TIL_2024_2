package com.tutorials.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice!")

    playerChoice = readln()

    val randomNumber = (1 .. 3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    while () {
        println("Enter your choice (rock, paper, or scissors):")
        playerInput = readLine().LowerCase()

        if (playerInput in validChoices) {
            println("You chose: $playerInput")
            break
        } else {
            println("Invalid choice. Please enter rock, paper, or scissors.")
        }
    }

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's a tie")
    } else {
        println("$winner won!")
    }
}