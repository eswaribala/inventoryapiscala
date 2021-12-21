package com.jd.tests

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import com.jd.models.{Product, Regular, Seasonal}
import org.scalatest.matchers.should.Matchers
class ProductFeatureSpecTest extends AnyFeatureSpec with GivenWhenThen with Matchers{


  Feature("Create Product") {

    Scenario("productId should be positive") {

      Given("create product")
      val product = new Product()

      When("Product Id Assigned")
      product.set_productId(347965)
      Then("Should not throw Exception")
      assert(product.get_productId()>0)
    }
    Scenario("Product Type should be either Regular or Seasonal ") {

      Given("create product")
      val product = new Product()

      When("Product Id Assigned")
      product.productType=Seasonal
      Then("Should not throw Exception")
      product.productType should (equal (Regular) or equal (Seasonal))
    }


  }

}
