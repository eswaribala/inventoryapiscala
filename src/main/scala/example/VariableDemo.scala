package example
import scala.io.StdIn.readLine
object VariableDemo extends App{

  //create variables
  //immutable
  val serviceTax=0.16
  //mutable
  var amount=5000
  //serviceTax=0.18 //reassignment not possible
  println(serviceTax)
  amount=25000
  println(amount)
  //to read the values
  var stock="0"

  print("Enter Stock Data")
  stock=readLine()


  println(stock)

}
