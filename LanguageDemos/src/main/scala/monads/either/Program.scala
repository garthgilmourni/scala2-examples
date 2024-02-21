package monads.either

import scala.io.{BufferedSource, Source}

object Program {
  def fileContent(path: String): Either[String, BufferedSource] = {
    try {
      Right(Source.fromFile(path))
    } catch {
      case ex: Exception => Left(ex.getMessage)
    }
  }

  def main(args: Array[String]) {
    showSuccess()
    showFailure()
  }

  private def showSuccess() {
    println("Using Either with valid path")
    fileContent("data/input.txt") match {
      case Left(s) => println("Whoops: " + s)
      case Right(source) => source.getLines().foreach(println)
    }
  }

  private def showFailure() {
    println("Using Either with invalid path")
    fileContent("data/foobar.txt") match {
      case Left(s) => println("Whoops: " + s)
      case Right(source) => source.getLines().foreach(println)
    }
  }
}
