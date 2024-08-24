package com.example.bankaccountprogram

class BankAccount(val userName : String, var userBalance : Double) {


    var record = mutableListOf<String>()


    fun deposit() {
        println("입금할 금액을 입력해 주세요")
        var account = readln().toDouble()
        userBalance += account
        println("${account}원이 입급되었습니다.")
        record.add("${account}원이 입급되었습니다.")
    }

    fun withdrawal() {
        println("출금할 금액을 입력해 주세요")
        var account = readln().toDouble()
        userBalance -= account
        println("${account}원이 출금되었습니다.")
        record.add("${account}원이 출금되었습니다.")
    }

    fun balancePossession() {
        println("현재 보유 잔액은 ${userBalance}원 입니다.")
    }

    fun acctBalance() {
        for(count in 0 until record.size) {
            println(record[count])
        }
    }
}

