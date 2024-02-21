package companions

class Point(var x: Int, var y: Int) {
  override def toString: String = s"Point holding $x and $y"
}

object Point {
  def swap(p1: Point, p2: Point) {
    val tmpX = p1.x
    val tmpY = p1.y

    p1.x = p2.x
    p1.y = p2.y

    p2.x = tmpX
    p2.y = tmpY
  }

  def add(p1: Point, p2: Point): Point = {
    new Point(p1.x + p2.x, p1.y + p2.y)
  }

  def apply(num: Int): Point = new Point(num, num + 1)
}

object Program {
  def main(args: Array[String]) {
    val first = new Point(12, 34)
    val second = new Point(56, 78)

    println(first)
    println(second)

    Point.swap(first, second)
    println(first)
    println(second)

    val third = Point.add(first, second)
    println(third)

    val fourth = Point(56)
    println(fourth)
  }
}
