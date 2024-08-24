package com.example.rockscissorspaper

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    var randomNumber = (1..3).random()
    println("Rock,Scissors and Paper? Enter your choice!")
    playerChoice = readln()

    while(playerChoice !in listOf("Rock", "Scissors", "Paper")){

        if (playerChoice in listOf("Rock", "Scissors", "Paper")) {
            break
        }

        println("올바른 선택을 입력해 주세요.")
        playerChoice = readln()
    }

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Scissors"
        }
        else -> {
            computerChoice = "Paper"
        }
    }



    println("당신의 선택: $playerChoice / 컴퓨터의 선택: $computerChoice")



    if(computerChoice == playerChoice) {
        println("비겼습니다.")
    }
    else if((playerChoice == "Rock" && computerChoice == "Scissors") || (playerChoice == "Scissors" && computerChoice == "Paper") || (playerChoice == "Paper" && computerChoice == "Rock")) {
        println("이겼습니다.")
    }
    else {
        println("패배했습니다.")
    }

}