package com.jd.models



class BankAccount(var accountBalance:Int){

  // Auxiliary Constructor
  def this(accountNo:Long=0,accountBalance: Int) {
    this(accountBalance)
    }



  def addAmount(amount:Int){
    accountBalance=accountBalance+amount
  }
}

object BankAccountApp extends App{

  var bankAccount=new BankAccount(123,30);
  println(this.bankAccount.accountBalance)
    bankAccount.addAmount(40)
  println(bankAccount.accountBalance)
}