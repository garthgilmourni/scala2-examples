package generics.context.bounds

class Person(val name: String)

object MyDefaults {
  implicit val things: List[Person] = List(new Person("Jane"))
}

class Demo[T : List](value: T) {
  def runDemo(implicit items: List[T]): List[T] = value :: items
}

object Program {
  def main(args: Array[String]): Unit = {
    import MyDefaults._

    val demo = new Demo(new Person("Dave"))
    val results = demo.runDemo
    println(results.map(_.name))
  }
}
