package classes.extra

object Program {
  def main(args: Array[String]) {

    val emp1 = new Manager("Dave", 27, 30000.0, "IT", 500000.0)
    val emp2 = new SalesPerson("Jane", 30, 40000.0, 90000.0)

    println(emp1)
    println(emp2)

    emp1.awardBonus(500)
    emp2.awardBonus(500)

    println(emp1)
    println(emp2)

    emp1.raiseBudget(20000.0)
    emp2.raiseTarget(3000.0)

    println(emp1)
    println(emp2)
  }
}
