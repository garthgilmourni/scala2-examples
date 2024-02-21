package privacy

class Point(var x : Int,  var y : Int) {
  private[this] var z : Int = 0

  def this(x : Int, y : Int, z : Int) {
    this(x,y)
    this.z = z
  }
  def swap(p : Point) {
    val tmpX = p.x
    val tmpY = p.y
    //val tmpZ = p.z //will not compile
    p.x = x
    p.y = y
    //p.z = z //will not compile
    x = tmpX
    y = tmpY
  }
  override def toString = s"Point holding $x, $y, $z"
}
