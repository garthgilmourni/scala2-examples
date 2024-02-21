package classes.extra

abstract class Employee(val name: String,
                        val age: Int,
                        var salary: Double) {
  println("Primary constructor of employee " + name)

  def this(name : String,  age : Int) {
    this(name,age,30000.0)
    println("Auxiliary constructor of employee " + name)
  }

  override def toString: String = {
    name + " of age " + age + " earning " + salary
  }

  def awardBonus(bonus: Double)
}
