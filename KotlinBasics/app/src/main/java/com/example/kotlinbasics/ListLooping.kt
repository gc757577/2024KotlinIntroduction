package com.example.kotlinbasics

fun main() {
    val numbers = mutableListOf(23,24,25,12,11)
    for(count in  0 until numbers.size) {
        numbers[count] = numbers[count] * 2
    }
    println(numbers)
}