package com.example.kotlinbasics




fun main() {
    val fruitsList = mutableListOf("사과","오렌지","바나나", "수박", "망고")
    //fruitsList.add("파인애플")
    fruitsList.remove("오렌지")

    if(fruitsList.contains("파인애플")) {
        println("파인애플이 리스트에 있음")
    }
    else {
        println("파인애플이 리스트에 없음")
    }
}