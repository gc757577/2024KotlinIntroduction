package com.example.rockscissorspaper

fun main() {
    println("숫자를 입력해 주세요.")
    var inputString = readln().toInt()
    val multiplier = 5
    val total = inputString + multiplier
    println("결과는 $total")
}