package com.jd.tests

import com.jd.models.BankAccount
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
/*
BankAccountSpec:
A BankAccount
  when
  - should have initial Balance of $30

  when Balance Updated
  - should have updated balance of $70

 */
class AccountBDDWordSpecTest  extends AnyWordSpec with Matchers {

  "A Bank Account" when {
    "Created" should {
      "should have initial Balance of $30" in{
        assert(new BankAccount(30).accountBalance == 30)
      }
    }

    "A Bank Account" when {
      "Updated" should {
        "should have updated balance of $70" in{
         var bankAccount=new BankAccount(30)
         bankAccount.addAmount(40)
          assert(bankAccount.accountBalance == 70)
        }

        }
      }

  }

}
