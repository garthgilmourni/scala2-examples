package privacy

object Program {
  def main(args : Array[String]) {
    val p1 = new Point(12,23,34)
    val p2 = new Point(45,56,78);
    
    p1.swap(p2)
    println(p1)
    println(p2)
  }
}
