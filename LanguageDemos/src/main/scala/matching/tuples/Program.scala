package matching.tuples

object Program {
  def main(args: Array[String]) {
    val t1 = (12, 13)
    val t2 = ("abc", 14)
    val t3 = ("def", 15, true)

    process(t1)
    process(t2)
    process(t3)
  }

  def process(theTuple: Any) {
    theTuple match {
      case (a: Int, b: Int) => println(s"Int/Int tuple holding $a, $b")
      case (a: Int, b: String) => println(s"Int/String tuple holding $a, $b")
      case (a: String, b: Int) => println(s"String/Int tuple holding $a, $b")
      case (a, b, c) => println(s"Tuple3 holding $a, $b, $c")
      case _ => println("Received an unknown value")
    }
  }
}
