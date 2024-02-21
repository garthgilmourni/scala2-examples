package generics.existential.types

object Program {
  def main(args: Array[String]): Unit = {
    val data1 = List(12, 34, 56)
    val data2 = List("abc", "def", "ghi", "jkl")

    println(demo(data1))
    println(demo(data2))
  }

  def demo(input: List[_]): Int = input.length
}
