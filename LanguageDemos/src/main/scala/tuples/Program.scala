package tuples

object Program {
  def main(args: Array[String]) {
    val tuple1 = Tuple1(123)
    val tuple2 = (123, "abc")
    val tuple3 = (123, "abc", 4.56)
    val tuple4 = (((123, "abc"), 4.56), true)
    val tuple5 = 123 -> "abc" -> 4.56 -> true

    printf("First tuple %d\n", tuple1._1)
    printf("Second tuple %d %s\n", tuple2._1, tuple2._2)
    printf("Third tuple %d %s %.2f\n", tuple3._1, tuple3._2, tuple3._3)
    printf("Fourth tuple %d %s %.2f %b\n", tuple4._1._1._1,
      tuple4._1._1._2,
      tuple4._1._2,
      tuple4._2)
    printf("Fifth tuple %d %s %.2f %b\n", tuple5._1._1._1,
      tuple5._1._1._2,
      tuple5._1._2,
      tuple5._2)
  }
}
