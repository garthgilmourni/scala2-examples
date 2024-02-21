package matching.types

class MyClass(val value: Int) {}

object Program {
  def main(args: Array[String]) {
    process(123)
    process(4.56)
    process(7.89)
    process("Foobar")
    process(new MyClass(101))
    process(true)
  }

  def process(input: Any): Unit = input match {
    case i: Int => println(s"The integer: $i")
    case s: String => println(s"The string: $s")
    case d: Double if (d <= 6) => println("A small double: $d")
    case d: Double if (d > 6) => println("A big double: $d")
    case mc: MyClass => println(s"A MyClass object holding: ${mc.value}")
    case _ => println("Received an unknown value")
  }
}
