package com.tutorials.bankaccountprogram

fun main() {
    val deniesBankAccount = BankAccount("Denis Panjuta", 1338.20)
    deniesBankAccount.deposit(200.0)
    deniesBankAccount.withdraw(1200.00)
    deniesBankAccount.deposit(3000.00)
    deniesBankAccount.deposit(2000.00)
    deniesBankAccount.withdraw(3333.15)

    deniesBankAccount.displayTransactionHistory()
    println("${deniesBankAccount.accountHolder}'s balance is ${deniesBankAccount.acctBalance()}")

    val sarahBankAccount = BankAccount("Sarah", 0.0)
    sarahBankAccount.deposit(100.00)
    sarahBankAccount.withdraw(10.00)
    sarahBankAccount.deposit(300.00)

    sarahBankAccount.displayTransactionHistory()
    println("${sarahBankAccount.accountHolder}'s balance is ${sarahBankAccount.acctBalance()}")
}