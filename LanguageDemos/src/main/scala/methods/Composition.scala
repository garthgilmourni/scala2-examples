package methods

object Composition {
  def half(input: Int):Double = input / 2

  def main(args: Array[String]): Unit = {
    val convert: String => Int = _.toInt
    val square: Int => Double = num => num * num

    val f1: String => Double = square compose convert
    val f2: String => Double = convert andThen square
    val f3: String => Double  = half _ compose convert
    val f4: String => Double  = convert andThen half

    println(f1("10"))
    println(f2("12"))
    println(f3("14"))
    println(f4("16"))
  }
}
