package procedural

object Iteration {
  def main(args: Array[String]) {
    for (x <- 1 to 5) {
      println(x)
    }
    println("----")
    for (x <- 6.to(10)) {
      println(x)
    }
    println("----")
    var count = 11
    while (count <= 15) {
      println(count)
      count += 1
    }
    println("----")
    do {
      println(count)
      count += 1
    } while (count <= 20)
  }
}
