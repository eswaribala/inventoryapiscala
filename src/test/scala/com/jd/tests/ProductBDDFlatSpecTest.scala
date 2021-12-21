package com.jd.tests

import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll, Tag}
import org.scalatest.flatspec.AnyFlatSpec
import com.jd.models.{BankAccount, Product}
import org.scalatest.matchers.should.Matchers
import org.scalatest.tagobjects.Slow

import scala.Console.in
import scala.util.Random
object DbTest extends Tag("com.jd.tags.DbTest")
class ProductBDDFlatSpecTest extends AnyFlatSpec with BeforeAndAfter with Matchers{

  def accounts:Seq[BankAccount]=Seq(new BankAccount(1,387586),
    new BankAccount(2,43959),new BankAccount(3,45435))

  def names:Seq[String]=Seq("TCS","HCL","Infosys")
  var product:Product=_
  before{
    product=new Product ()
    product.set_productId(Random.nextInt(10000))
    product.set_productName("Laptop")

  }
//ignore
  ignore should "be an Object" in {
    assert(product.isInstanceOf[Product])
  }
  it should "Product Id Should be positive number" taggedAs (Slow) in{
    assert(product.get_productId() > 0)
  }

  it should "Product Name should be Laptop" in{
    product.get_productName() should equal("Laptop")
  }

  it should "Account size equal to 3" taggedAs (DbTest) in (pending)
  /*
  {
    accounts should have size 3
  }
*/
  it should "contain Name" in{
     names should contain("TCS")
  }

}

