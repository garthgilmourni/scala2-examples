package operators

object Program {
  def main(args : Array[String]) {
    val p1 = new Point(10,20)
    val p2 = new Point(5,7)

    val p3 = p1 + p2
    println(p3)

    val p4 = p1 - p2
    println(p4)

    val p5 = p1 * p2
    println(p5)
  }
}
