package com.jd.tests

import com.jd.models.BankAccount
import org.scalatest.BeforeAndAfterAll
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class BankAccountFreeSpecTest extends AnyFreeSpec with Matchers with BeforeAndAfterAll{

  var bankAccount:BankAccount= _
  override def beforeAll()={
    bankAccount=new BankAccount(30)
  }

  "Bank Account" - {
    "When We add Money in Bank Account,balance Should be Updated" - {
      "Create Bank Account" in {
        bankAccount.accountBalance should equal(30)
      }
      "When Account added with $40" - {
        bankAccount.addAmount(40)
        bankAccount.accountBalance should equal(70)
      }

    }
  }
}
