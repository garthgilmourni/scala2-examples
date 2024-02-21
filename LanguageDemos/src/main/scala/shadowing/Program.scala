package shadowing

class Vehicle(var mileage : Int) {
  override def toString = s"A vehicle which has travelled $mileage miles"
}

class Car(mileage : Int) extends Vehicle(mileage)

class Motorbike(mileage : Int) extends Vehicle(mileage) {
  def travel(distance : Int) {
    //WILL NOT COMPILE - gives 'error reassignment to val'
    //mileage += distance
    this.asInstanceOf[Motorbike].mileage += distance
  }
}

class Truck(_mileage : Int) extends Vehicle(_mileage) {
  def travel(distance : Int) {
    //fine because of underscore in constructor parameter
    mileage += distance
  }
}

object Program {
   def main(args : Array[String]) {
     val mb = new Motorbike(500)
     val tk = new Truck(700)
     
     mb.travel(40)
     tk.travel(60)
     
     println(mb)
     println(tk)
   }
}
