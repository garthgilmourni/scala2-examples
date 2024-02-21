package methods

object StandardSyntax {
  //This is a procedure
  def method1(a: Int, b: Int) {
    println(a + b)
  }

  //This is a method
  def method2(a: Int, b: Int): Int = {
    return a + b
  }

  //Remove optional 'return'
  def method3(a: Int, b: Int): Int = {
    a + b
  }

  //Infer return type (bad idea)
  def method4(a: Int, b: Int) = {
    a + b
  }

  //Remove braces
  def method5(a: Int, b: Int): Int = a + b

  //A single expression function whose value is a match
  def method6(op: String, a: Int, b: Int): Int = op match {
    case "add" => a + b
    case "subtract" => a - b
    case _ => throw new IllegalArgumentException(op + " unknown!")
  }

  def main(args: Array[String]) {
    method1(3, 5)
    println(method2(3, 5))
    println(method3(3, 5))
    println(method4(3, 5))
    println(method5(3, 5))
    println(method6("add", 3, 5))
    println(method6("subtract", 3, 5))
  }
}
