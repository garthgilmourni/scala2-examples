package equality

class Employee(val id : Int,  val name : String, val dept : String) {
  override def equals(other : Any) : Boolean = {
    println("Employee equals called")
    if(other.asInstanceOf[AnyRef] eq this) {
      println("Object compared with itself")
      true
    } else {
      other match {
        case otherEmp : Employee =>
          (id == otherEmp.id && name == otherEmp.name)
        case _ => false
      }
    }
  }
}
