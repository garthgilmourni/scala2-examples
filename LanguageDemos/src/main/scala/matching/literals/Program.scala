package matching.literals

object Program {
  def process1(str: String) {
    str match {
      case "Flintstones" => println("Fred")
      case "Simpsons" => println("Homer")
      case _ => println("Dave")
    }
  }

  def process2(str: String) {
    println(str match {
      case "Flintstones" => "Fred"
      case "Simpsons" => "Homer"
      case _ => "Dave"
    })
  }

  def process3(str: String): Unit = println(str match {
    case "Flintstones" => "Fred"
    case "Simpsons" => "Homer"
    case _ => "Dave"
  })

  def main(args: Array[String]) {
    process1("Flintstones")
    process1("Simpsons")
    process1("Foobar")

    println("---")
    process2("Flintstones")
    process2("Simpsons")
    process2("Foobar")

    println("---")
    process3("Flintstones")
    process3("Simpsons")
    process3("Foobar")
  }
}
