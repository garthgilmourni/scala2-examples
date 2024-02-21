package typing

class MyClass

object Program {
  def main(args: Array[String]) {
    val myval1 = "ABC"
    val myval2 = "[a-z]{3}".r
    val myval3 = new MyClass
    val myval4 = new Array[MyClass](10)
    val myval5 = List("abc", "def", "ghi", "jkl")
    val myval6 = (123, "abc")

    printType(myval1)
    printType(myval2)
    printType(myval3)
    printType(myval4)
    printType(myval5)
    printType(myval6)
  }
  def printType(input: Any): Unit = println(input.getClass.getName)
}
