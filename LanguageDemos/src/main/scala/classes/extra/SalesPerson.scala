package classes.extra

class SalesPerson(_name: String,
                  _age: Int,
                  _salary: Double,
                  var target: Double) extends Employee(_name, _age, _salary) {
  println("Primary constructor of manager " + name)

  override def toString: String = {
    super.toString + " with a sales target of " + target
  }

  override def awardBonus(bonus: Double) {
    salary += bonus * 3
  }

  def raiseTarget(increase: Double) {
    target += increase
  }
}
