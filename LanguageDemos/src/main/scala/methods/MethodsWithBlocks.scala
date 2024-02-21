package methods

object MethodsWithBlocks {
  def main(args: Array[String]): Unit = {
    demo1 {
      println("Demo1 called")
    }

    demo2 { (num: Int) =>
      println(s"Demo2 called with $num")
    }

    demo3(42) { (num: Int) =>
      println(s"Demo3 called with $num")
    }
  }

  def demo1(input: => Unit): Unit = {
    input
  }

  def demo2(input: Int => Unit): Unit = {
    input(12)
  }

  def demo3(input1: Int)(input2: Int => Unit): Unit = {
    input2(input1)
  }
}
