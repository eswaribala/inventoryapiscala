package com.jd.tests

import com.jd.models.BankAccount
import org.scalatest.BeforeAndAfterAll
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class BankAccountFreeSpecTest extends AnyFreeSpec with Matchers with BeforeAndAfterAll{

  var bankAccount:BankAccount= _
  override def beforeAll()={
    //informers
    info("Bank Account Created")
    bankAccount=new BankAccount(30)
  }

  "Bank Account" - {
    "When We add Money in Bank Account,balance Should be Updated" - {
      "Create Bank Account" in {
        info("Bank Account Testing Started.....")
        bankAccount.accountBalance should equal(30)
      }
    }

    "When We update Money in Bank Account,balance Should be Updated" - {
      "Update Bank Account" in {
        bankAccount.addAmount(40)
        bankAccount.accountBalance should equal(70)
        pending
      }
    }
  }

  info("That's it all the test case executed")
}
