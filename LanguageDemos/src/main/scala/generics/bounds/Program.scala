package generics.bounds

import scala.collection.mutable.ListBuffer

class Employee
class Manager extends Employee
class Director extends Manager

object Program {
  def main(): Unit = {
    val employees = new ListBuffer[Employee]()
    val managers = new ListBuffer[Manager]()
    val directors = new ListBuffer[Director]()

    demo1(employees)
    //demo1(managers)
    //demo1(directors)

    //demo2(employees)
    demo2(managers)
    demo2(directors)

    demo3(employees)
    demo3(managers)
    //demo3(directors)
  }

  def demo1(input: ListBuffer[Employee]): Unit = {
    input += new Employee()
    input += new Manager()
    input += new Director()

    val first: Employee = input.head
  }

  def demo2[T <: Manager](input: ListBuffer[T]): Unit = {
    //input += new Employee()
    //input += new Manager()
    //input += new Director()

    val first: Manager = input.head
  }

  def demo3[T >: Manager](input: ListBuffer[T]): Unit = {
    //input += new Employee()
    input += new Manager()
    input += new Director()

    val first: Any = input.head
  }
}
