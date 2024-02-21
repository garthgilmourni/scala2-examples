package traits.on.objects

trait Aviator {
  def takeFlight() {
    println("Engage...")
  }
}

class Toy(val name: String)

class Elephant(val name: String)

class Penguin(val name: String)

object Program {
  def main(args: Array[String]) {
    val elephant1 = new Elephant("Nelly")
    val elephant2 = new Elephant("Dumbo") with Aviator

    val toy1 = new Toy("Woody")
    val toy2 = new Toy("Buzz") with Aviator {
      override def takeFlight() {
        println("To infinity and beyond!!")
      }
    }

    val penguin1 = new Penguin("Pingu")
    val penguin2 = new Penguin("Skipper") with Aviator {
      override def takeFlight() {
        println("Lets light this candle!!")
      }
    }

    //takeToTheSky(elephant1) //will not compile
    takeToTheSky(elephant2)
    //takeToTheSky(toy1) //will not compile
    takeToTheSky(toy2)
    //takeToTheSky(penguin1)  //will not compile
    takeToTheSky(penguin2)
  }

  def takeToTheSky(thing: Aviator) {
    thing.takeFlight()
  }
}
