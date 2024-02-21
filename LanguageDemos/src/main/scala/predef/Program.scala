package predef

import scala.io.StdIn.readInt

object Program {
  def main(args: Array[String]) {
    var numbers = Set[Int]() //Available via Predef
    try {
      println("Enter an integer") //Available via Predef
      numbers = numbers + readInt() //Imported from StdIn
      println("Enter another")
      numbers = numbers + readInt()
      printf("Total is %d\n", numbers.sum)
    } catch {
      case _: NumberFormatException => println("That wasn't a number!")
    }
  }
}
