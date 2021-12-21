package com.jd.tests

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import com.jd.models.Product
class ProductFeatureSpecTest extends AnyFeatureSpec with GivenWhenThen {


  Feature("Create Product") {

    Scenario("productId should be positive") {

      Given("create product")
      val product = new Product()

      When("Product Id Assigned")
      product.set_productId(347965)
      Then("Should not throw Exception")
      assert(product.get_productId()>0)
    }



  }

}
