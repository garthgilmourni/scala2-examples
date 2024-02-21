package classes.basic

object Program {
  def main(args: Array[String]) {
    val emp1 = new Employee("Dave", 27, 30000.0)
    val emp2 = new Employee("Jane", 30, 40000.0)

    println(emp1)
    println(emp2)

    emp1.awardBonus(500)
    emp2.awardBonus(750)

    println(emp1)
    println(emp2)

    val mgr = new Manager("Pete", 33, 50000.0, "HR", 250000.0)
    println(mgr)

    mgr.raiseBudget(2500.0)
    println(mgr)

    mgr.awardBonus(325.0)
    println(mgr)
  }
}
