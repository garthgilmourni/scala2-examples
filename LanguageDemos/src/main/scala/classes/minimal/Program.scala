package classes.minimal

object Program {
  def main(args: Array[String]) {
    val emp1 = new Employee("Dave", 27, 30000.0)
    val emp2 = new Employee("Jane", 30, 40000.0)

    printEmployee(emp1)
    printEmployee(emp2)
  }

  def printEmployee(input: Employee) {
    println(input)
    println("Named " + input.name)
    println("Aged " + input.age)
    println("Earning " + input.salary)
    println("-----")
  }
}
