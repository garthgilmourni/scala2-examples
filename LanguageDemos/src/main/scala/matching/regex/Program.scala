package matching.regex

object Program {
  def demo(data: String) {
    val regex1 = "[A-Z]{3}[0-9]{3}".r
    val regex2 = "[a-z]{3}[0-9]{3}".r
    val regex3 = "([A-Z]{3})([a-z]{3})".r

    data match {
      case regex1() => println("Match for regex one")
      case regex2() => println("Match for regex two")
      case regex3(a, b) => println(s"Match for regex three holding $a and $b")
      case _ => println("No regex matches input!")
    }
  }

  def main(args: Array[String]) {
    demo("ABC123")
    demo("abc123")
    demo("ABCabc")
    demo("abcABC")
  }
}
