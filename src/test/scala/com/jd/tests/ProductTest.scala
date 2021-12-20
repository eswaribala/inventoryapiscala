package com.jd.tests

import com.jd.models.Product
import com.jd.models.InvalidProductIdException
import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll}
import org.scalatest.funsuite.AnyFunSuite

//TDD
class ProductTest extends AnyFunSuite with BeforeAndAfterAll {
  //create product instance
  var product:Product=_

  override def beforeAll{
    product=new Product()
    product.set_productId(7809909)
  }

/*before{
  product=new Product()
  product.set_productId(7809909)
}*/

  test("Product Instance Existence Test"){
      assert(product.isInstanceOf[Product])
  }


  test("Product Id must be greater than zero"){
    assert(product.get_productId() > 0)
  }

  test("Product Id less than 0 must throw Exception"){
    assertThrows[InvalidProductIdException]{
      product.set_productId(-957858)
    }
  }

  test("When ProductId less than zero catch message"){
    val caught =
      intercept[InvalidProductIdException] {
        // Result type: InvalidProductIdException
        product.set_productId(-478687)
      }
    assert(caught.getMessage.equals("Product Id cannot be negative number"))
  }




}
