package generics.variance

class Employee
class Manager extends Employee
class Director extends Manager

class WrapperA[T](var value: T) {
  def getter(): T = value
  def setter(x: T): Unit = value = x
}

class WrapperB[+T](val value: T) {
  def getter(): T = value
  //def setter(x: T) = null
}

class WrapperC[-T]() {
  //def getter(): T = new T()
  def setter(x: T): Int = 1
}

object Program {
  def main(args: Array[String]): Unit = {
    val w1 = new WrapperA(new Employee())
    val w2 = new WrapperA(new Manager())
    val w3 = new WrapperA(new Director())

    val w4 = new WrapperB(new Employee())
    val w5 = new WrapperB(new Manager())
    val w6 = new WrapperB(new Director())

    val w7 = new WrapperC[Employee]
    val w8 = new WrapperC[Manager]
    val w9 = new WrapperC[Director]

    demo1(w1)
    //demo1(w2)
    //demo1(w3)

    //demo2(w4)
    demo2(w5)
    demo2(w6)

    demo3(w7)
    demo3(w8)
    //demo3(w9)
  }

  def demo1(input: WrapperA[Employee]): Unit = {}
  def demo2(input: WrapperB[Manager]): Unit = {}
  def demo3(input: WrapperC[Manager]): Unit = {}
}
