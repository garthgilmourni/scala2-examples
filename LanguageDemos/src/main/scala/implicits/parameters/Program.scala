package implicits.parameters

class Person(val name: String)

object MyDefaults {
  implicit val p: Person = new Person("Dave")
}

object Program {
  def foo(param1: Int)(implicit param2: Person) {
    printf(s"Foo called with number $param1 and person ${param2.name}\n")
  }

  def bar() {
    import MyDefaults._
    foo(789)
  }

  def main(args: Array[String]) {
    //foo(123)("Mary")  //will not compile
    foo(456)(new Person("Liza"))
    bar()
  }
}
