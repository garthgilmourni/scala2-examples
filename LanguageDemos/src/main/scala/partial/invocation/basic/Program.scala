package partial.invocation.basic

object Program {
  def addNormally(no1: Int, no2: Int): Int = {
    no1 + no2
  }

  def addV1(no1: Int): (Int) => Int = {
    return (no2: Int) => no1 + no2
  }

  def addV2(no1: Int): Int => Int = {
    (no2: Int) => no1 + no2
  }

  def addV3(no1: Int): Int => Int = (no2: Int) => no1 + no2

  def addV4(no1: Int)(no2: Int): Int = no1 + no2

  def main(args: Array[String]) {
    println(addNormally(12, 7))

    println(addV1(12)(7))
    println(addV2(12)(7))
    println(addV3(12)(7))
    println(addV4(12)(7))

    val func1 = addV1(12)
    val func2 = addV2(12)
    val func3 = addV3(12)
    val func4 = addV4(12) _

    println(func1(7))
    println(func2(7))
    println(func3(7))
    println(func4(7))
  }
}
