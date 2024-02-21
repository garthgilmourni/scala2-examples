package monads.option.basic

object Program {
  def fetchSystemProperty(name: String): Option[String] = {
    val result = System.getProperty(name)
    if (result eq null) None else Some(result)
  }

  def main(args: Array[String]) {
    println(fetchSystemProperty("java.vendor") getOrElse "No Such Property!")
    println(fetchSystemProperty("java.version") getOrElse "No Such Property!")
    println(fetchSystemProperty("wibble") getOrElse "No Such Property!")
  }
}
