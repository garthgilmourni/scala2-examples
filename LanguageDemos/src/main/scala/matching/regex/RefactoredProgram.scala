package matching.regex

object RefactoredProgram {
  def demo(data: String) {
    val regex1 = "[A-Z]{3}[0-9]{3}".r
    val regex2 = "[a-z]{3}[0-9]{3}".r
    val regex3 = "([A-Z]{3})([a-z]{3})".r

    println(data match {
      case regex1() => "Match for regex one"
      case regex2() => "Match for regex two"
      case regex3(a, b) => s"Match for regex three holding $a and $b"
      case _ => "No regex matches input!"
    })
  }

  def main(args: Array[String]) {
    demo("ABC123")
    demo("abc123")
    demo("ABCabc")
    demo("abcABC")
  }
}
