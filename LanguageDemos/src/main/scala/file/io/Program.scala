package file.io

import scala.io.Source

object Program {
  def main(args: Array[String]) {
    val source = Source.fromFile("./data/input.txt")
    for (line <- source.getLines()) {
      println(line)
    }
  }
}
