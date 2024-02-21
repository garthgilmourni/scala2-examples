package classes.basic

class Manager(name: String,
              age: Int,
              salary: Double,
              val deptName: String,
              var budget: Double) extends Employee(name, age, salary) {
  println("Primary constructor of manager " + name)

  override def toString =
    s"${super.toString} managing $deptName with budget $budget"

  override def awardBonus(bonus: Double): Unit = super.awardBonus(bonus * 2)

  def raiseBudget(raise: Double): Unit = budget += raise
}
