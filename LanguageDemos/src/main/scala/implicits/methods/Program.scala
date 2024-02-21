package implicits.methods

class A {
  def foo(): Unit = println("FOO")
  def bar(): Unit = println("BAR")
}

class B(obj: A) {
  println("Instance of B created...")

  def zed(): Unit = println("ZED")
}

object Program {
  implicit def convertAtoB(obj: A): B = new B(obj)

  def main(args: Array[String]) {
    val tst = new A()
    tst.foo()
    tst.bar()
    tst.zed()
  }
}
