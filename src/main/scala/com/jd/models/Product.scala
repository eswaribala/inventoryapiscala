package com.jd.models

class InvalidProductIdException(message:String) extends Exception(message){}
//enum
sealed trait ProductType
case object Regular extends ProductType
case object Seasonal extends ProductType

class Product{
  private var productId:Long=0
  private var productName:String=""
  private var productType:ProductType=Regular

  //setters
  def set_productId(value:Long): Unit ={
    if(value<0)
      throw new InvalidProductIdException("Product Id cannot be negative number")
    else
      productId=value;
  }
  def set_productName(value:String): Unit ={
    productName=value
  }

//getter
  def get_productId(): Long ={
    return productId
  }

  def get_productName():String={
   return productName
  }
}

object ProductDemo extends App{

  var product=new Product()
  try {
    product.set_productId(-55)
  }
  catch{
    case e : InvalidProductIdException => println("Exception Occurred : "+e.getMessage())
  }


}

