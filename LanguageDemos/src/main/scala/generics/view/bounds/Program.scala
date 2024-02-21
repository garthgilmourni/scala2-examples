package generics.view.bounds

class Thing(val value: Int)
class OtherThing(original: Thing) {
  val originalValue: Int = original.value
}

object Program {
  implicit def myConvert(input: Thing): OtherThing = new OtherThing(input)

  def main(args: Array[String]): Unit = {
    val data = new Thing(101)
    demo(data)
  }

  def demo[T <% OtherThing](input: T): Unit = println(input.originalValue)
}
