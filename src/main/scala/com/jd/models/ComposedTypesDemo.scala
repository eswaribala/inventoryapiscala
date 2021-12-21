package com.jd.models

trait Computer {
  def model: String
  def storage: Int
  def ram: Int
}
class Laptop(val model: String,
             val storage: Int,
             val ram: Int ) extends Computer

trait Index extends Computer {
  def calculateIndex: Int =
    (ram*4) + (storage/3)
}
object ComposedTypesDemo extends App {
  val laptopWithIndex = new Laptop("Lenovo T430", 240, 4) with Index
  println("Performance index: " + laptopWithIndex.calculateIndex)
}