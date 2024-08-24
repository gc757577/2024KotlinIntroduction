package com.example.bankaccountprogram

fun main() {
    println("이름과 잔액을 입력해 주세요.")
    val Name = readln()
    val Balance = readln().toDouble()
    val userBankAccount = BankAccount(Name, Balance)


    println("이름: ${userBankAccount.userName}   현재 잔액: ${userBankAccount.userBalance}")


    while(true) {
        println("입금을 원하시면 1번, 출금을 원하시면 2번, 잔액 확인을 원하시면 3번, 입출금 내역을 보려면 4번, 종료를 원하시면 5번을 눌러주세요")
        val selectNumber = readln().toInt()
        when (selectNumber) {
        1 -> userBankAccount.deposit()
        2 -> userBankAccount.withdrawal()
        3 -> userBankAccount.balancePossession()
        4 -> userBankAccount.acctBalance()
        5 -> break
        }
    }




}