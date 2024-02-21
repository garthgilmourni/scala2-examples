package comprehensions.advanced

object Program {
  private def demo1() {
    val results = for (x <- 1 to 10) yield x
    print("Demo 1: ")
    for (x <- results) {
      printf("%d ", x)
    }
    println
  }

  private def demo2() {
    val results = for (x <- 1 to 10) yield x * 10
    print("Demo 2: ")
    for (x <- results) {
      printf("%d ", x)
    }
    println
  }

  private def demo3() {
    val results = for (x <- 1 to 10 if x % 2 == 0) yield x
    print("Demo 3: ")
    for (x <- results) {
      printf("%d ", x)
    }
    println
  }

  private def demo4() {
    val results = for (x <- 1 to 10
                       if x % 2 == 0
                       if x > 5
                       ) yield x
    print("Demo 4: ")
    for (x <- results) {
      printf("%d ", x)
    }
    println
  }

  private def demo5() {
    val results = for (x <- 1 to 3; y <- 'a' to 'c') yield (x, y)
    print("Demo 5: ")
    for (item <- results) {
      printf("(%d,%s) ", item._1, item._2)
    }
    println
  }

  private def demo6() {
    val results = for (x <- 1 to 3; y <- 10 to 12) yield x * y
    print("Demo 6: ")
    for (x <- results) {
      printf("%d ", x)
    }
    println
  }

  def main(args: Array[String]) {
    demo1()
    demo2()
    demo3()
    demo4()
    demo5()
    demo6()
  }
}
