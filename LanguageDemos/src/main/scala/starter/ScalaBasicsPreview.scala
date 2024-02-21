package starter

import java.util.Scanner

object ScalaBasicsPreview {
  def main(args: Array[String]) {
    var numbers = List[Int]()
    val scanner = new Scanner(System.in)
    val endOfInput = "X{3}".r
    println("Enter some numbers or three 'X' to finish")

    var notDone = true
    while (scanner.hasNextLine && notDone) {
      if (scanner.hasNextInt()) {
        numbers = scanner.nextInt() :: numbers
      } else {
        if (scanner.hasNext(endOfInput.pattern)) {
          notDone = false
        } else {
          val mysteryText = scanner.nextLine()
          println(s"Ignoring $mysteryText")
        }
      }
    }
    //show support for FP
    val total1 = numbers.fold(0)(_ + _)
    println(s"Total of numbers is: $total1")
    //show simpler alternative in this case
    val total2 = numbers.sum
    println(s"Total of numbers is: $total2")
  }
}
