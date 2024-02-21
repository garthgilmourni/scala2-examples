package operators

class Point(var no1 : Int, var no2 : Int) {
  def +(other : Point) : Point = {
    new Point(no1 + other.no1, no2 + other.no2)
  }
  def -(other : Point) : Point = {
    new Point(no1 - other.no1, no2 - other.no2)
  }
  def *(other: Point): Point = {
    new Point(no1 * other.no1, no2 * other.no2)
  }
  override def toString = s"$no1 $no2"
}
