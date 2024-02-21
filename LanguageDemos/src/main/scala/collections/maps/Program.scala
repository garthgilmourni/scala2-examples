package collections.maps

import scala.collection.MapView

object Program {
  def buildMap(): MapView[String, Employee] = {
    var tmp = Map("AB12" -> new Employee("Dave", 27, 30000.0),
      "CD34" -> new Employee("Jane", 32, 40000.0))

    tmp += "EF12" -> new Employee("Fred", 37, 50000.0)
    tmp += ("GH34" -> new Employee("Mary", 42, 60000.0), "IJ56" -> new Employee("Pete", 47, 70000.0))

    tmp.view
  }

  def printMap(title: String, data: MapView[String, Employee]) {
    println("\n---" + title + "---")
    data.foreach(entry => println(entry._1 + " indexing " + entry._2.name))
  }

  def main(args: Array[String]) {
    val myMap = buildMap()

    printMap("Original map", myMap)

    val result1 = myMap.view.filterKeys(k => k.startsWith("A") || k.startsWith("E"))
    printMap("After filtering by keys", result1)

    val result2 = myMap.filter(entry => entry._1.contains("12") || entry._2.salary > 65000.0)
    printMap("After filtering by keys and values", result2)

    val result3 = myMap.view.mapValues(emp => new Employee(emp.name + " Jones", emp.age, emp.salary))
    printMap("After creating new map", result3)
  }
}
