package comprehensions.basic

object Program {
  private def demo1() {
    print("Demo 1: ")
    for (x <- 1 to 10) {
      printf("%d ", x)
    }
    println
  }

  private def demo2() {
    print("Demo 2: ")
    for (x <- 'd' to 'm') {
      printf("%s ", x)
    }
    println
  }

  private def demo3() {
    print("Demo 3: ")
    for (x <- List("abc", "def", "ghi", "jkl", "mno")) {
      printf("%s ", x)
    }
    println
  }

  def main(args: Array[String]) {
    demo1()
    demo2()
    demo3()
  }
}
