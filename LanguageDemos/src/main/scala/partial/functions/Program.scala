package partial.functions

object Person {
  def apply(name: String, age: Int, home: String, interests: String*) = new Person(name, age, home, interests)
}

class Person(val name: String, val age: Int, val home: String, val interests: Seq[String]) {
  override def toString: String = s"$name of age $age living in $home with interests ${interests.mkString(" ")}"
}

object Program {

  def main(args: Array[String]): Unit = {
    val people = buildPeople

    showMap(people)
    showPartition(people)
    showPermutations(people)
    showFinders(people)
    showGrouping(people)
  }

  private def showMap(people: List[Person]): Unit = {
    printTitle("Show Map")
    people.map(person => (person.name, person.age))
      .foreach {
        case (name, age) => println(s"$name aged $age")
      }
  }

  private def showPartition(people: List[Person]): Unit = {
    printTitle("Show Partition")
    val results = people.partition(_.age > 23)
    results match {
      case (oldPeople, youngPeople) =>
        printTabbed("Old People")
        oldPeople.foreach(printTabbed)
        printTabbed("Young People")
        youngPeople.foreach(printTabbed)
    }
  }

  private def showPermutations(people: List[Person]): Unit = {
    printTitle("Show Permutations")
    people.take(3)
      .map(_.name)
      .permutations
      .foreach {
        case List(a, b, c) => println(s"$a, $b and $c")
      }
  }

  private def showFinders(people: List[Person]): Unit = {
    printTitle("Show Finders")
    val result1 = people.find(_.age > 23).map(_.name)
    result1 match {
      case None => println("No people over 23")
      case Some(name) => println(s"$name is over 23")
    }

    val result2 = people.find(_.age > 50).map(_.name)
    result2 match {
      case None => println("No people over 50")
      case Some(name) => println(s"$name is over 50")
    }
  }

  private def showGrouping(people: List[Person]): Unit = {
    printTitle("Show Grouping")
    val result: Map[String, List[Person]] = people.groupBy(_.home)

    result.foreach {
      case (city, occupants) =>
        printTabbed(s"People living in $city")
        occupants.map(_.name)
          .map(name => s"\t$name")
          .foreach(printTabbed)
    }
  }

  private def printTabbed(input: Any): Unit = println(s"\t$input")

  private def printTitle(title: String): Unit = println(s"-----$title-----")

  private def buildPeople = {
    List(
      Person("Dave", 20, "Belfast", "judo", "chess"),
      Person("Jane", 21, "Dublin", "coding", "travel"),
      Person("Pete", 22, "Belfast", "math"),
      Person("Mary", 23, "Dublin", "cycling", "mma", "reading", "poker"),
      Person("Bert", 24, "Belfast", "cooking", "bird watching"),
      Person("Lucy", 25, "Dublin", "zen", "painting"),
      Person("Neil", 26, "Belfast", "hiking"),
    )
  }
}
