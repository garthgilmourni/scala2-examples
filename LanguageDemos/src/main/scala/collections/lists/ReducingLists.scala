package collections.lists

object ReducingLists {
  def main(args : Array[String]) {
    val myList = List(1,2,3,4,5)

    val result1 = myList.reduceLeft((no1, no2) => no1 + no2)
    println(result1)

    val result2 = myList.reduceLeft((_+_))
    println(result2)

    val result3 = myList.reduceLeft((no1, no2) => no1 * no2)
    println(result3)

    val result4 = myList.reduceLeft((_*_))
    println(result4)

    val result5 = myList.foldLeft(8)((no1, no2) => no1 + no2)
    println(result5)

    val result6 = myList.foldLeft(8)(_+_)
    println(result6)

    val result7 = myList.foldLeft(10)((no1, no2) => no1 * no2)
    println(result7)

    val result8 = myList.foldLeft(10)(_*_)
    println(result8)
  }
}
