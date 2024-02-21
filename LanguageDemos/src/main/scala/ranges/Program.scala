package ranges

object Program {
  def main(args: Array[String]): Unit = {
    val range1 = 1 to 5
    val range2 = 1 until 5
    val range3 = 1 to 20 by 5
    val range4 = 'a' to 'f'

    val allRanges = List(range1, range2, range3, range4)
    allRanges.map(r => r.mkString(" "))
      .foreach(println)
  }
}
