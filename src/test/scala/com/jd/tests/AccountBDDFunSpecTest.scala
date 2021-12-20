package com.jd.tests

import com.jd.models.BankAccount
import org.scalatest.{BeforeAndAfter, GivenWhenThen}
import org.scalatest.funspec.AnyFunSpec

class AccountBDDFunSpecTest extends AnyFunSpec with GivenWhenThen with BeforeAndAfter{

  var bankAccount:BankAccount=_

  describe("Bank Account"){
    it("Money Added To Account"){
      Given("the bank account has a balance of $30")
         bankAccount=new BankAccount(30)
      When("$40 is added to the account balance")
        bankAccount.addAmount(40)
      Then("there should be $70 in the account")
        assert(bankAccount.accountBalance == 70)
    }
  }

}
