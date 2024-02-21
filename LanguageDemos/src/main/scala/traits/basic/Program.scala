package traits.basic

trait Printable {
  def print(): Unit = {
    println("Default print implementation")
  }
}

class Document extends Printable

class Picture

class Painting extends Picture with Printable

class Photograph extends Picture with Printable {
  override def print(): Unit = {
    println("Print implementation in photograph");
  }
}

object Program {
  def main(args: Array[String]) {
    val obj1 = new Document
    val obj2 = new Painting
    val obj3 = new Photograph

    obj1.print()
    obj2.print()
    obj3.print()
  }
}
