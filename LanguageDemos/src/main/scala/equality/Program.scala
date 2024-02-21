package equality

object Program {
  def main(args : Array[String]) {
   val emp1 = new Employee(123, "Dave", "IT") //Dave works in IT
   val emp2 = new Employee(456, "Pete", "IT") //Pete works in IT                    
   val emp3 = new Employee(123, "Dave", "HR") //Dave also works in HR
  
   println(emp1 == emp2)
   println(emp2 == emp3)
   println(emp1 == emp3)

   val emp4 = emp3
   println(emp3 == emp4)
  }
}
