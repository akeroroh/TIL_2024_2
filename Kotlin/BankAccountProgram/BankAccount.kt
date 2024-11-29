package com.tutorials.bankaccountprogram

class BankAccount (var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun acctBalance(): Double {
        return balance
    }
    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            println("You don't have the funds to withdra $$amount")
        }
    }
    fun displayTransactionHistory() {
        println("Transactionhistory for $accountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }
}