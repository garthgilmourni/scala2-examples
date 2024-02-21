package classes.basic

class Employee(val name : String,
               val age : Int,
               var salary : Double) {
  println("Primary constructor of employee " + name)

  override def toString: String = s"$name of age $age earning $salary"

  def awardBonus(bonus : Double): Unit = salary += bonus
}
