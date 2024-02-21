package monads.trying

import scala.io.Source
import scala.util.{Success, Failure, Try}

object Program {
  def fileContent(path: String): Try[String] = {
    val readAll = (path: String) => {
      val sb = new StringBuilder()
      val source = Source.fromFile(path)
      for(line <- source.getLines()) {
        sb.append(s"$line ")
      }
      sb.toString()
    }
    Try(readAll(path))
  }

  def firstLine(path: String): Try[String] = {
    val readFirst = (path: String) => {
      val source = Source.fromFile(path)
      source.getLines()
        .find(_ => true)
        .getOrElse("")
    }
    Try(readFirst(path))
  }

  def main(args: Array[String]) {
    demoV1("data/input.txt")
    demoV1("data/false.txt")
    demoV2("data/input.txt")
    demoV2("data/false.txt")
    demoV3("data/path.txt")
    demoV3("data/false.txt")
  }

  def demoV1(path: String) {
    println("--------")
    fileContent(path) match {
      case Failure(ex) => println("Whoops: " + ex.getMessage)
      case Success(text) => println(text)
    }
  }

  def demoV2(path: String) {
    println("--------")
    val result = fileContent(path).getOrElse("Sorry")
    println(result)
  }

  def demoV3(path: String) {
    println("--------")
    val content = for {
      data1 <- firstLine(path)
      data2 <- fileContent(data1)
    } yield data2

    val result = content.getOrElse("Sorry")
    println(result)
  }
}
