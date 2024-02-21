package collections.lists

object BasicLists {
  def main(args: Array[String]): Unit = {
    val list1 = List("ab", "cde", "fghi", "jk", "lmn", "opqr")
    printList("First List", list1)

    println(s"First item was: ${list1.head}")

    println(s"Second item was: ${list1(1)}")

    println(s"Final item was: ${list1.last}")

    val list2 = "yy" :: list1
    printList("Second List", list2)

    val list3 = list1 :+ "zz"
    val list4 = "zz" +: list1

    printList("Third List", list3)
    printList("Fourth List", list4)

    println("Possible triples from first list")
    list1.combinations(3)
      .foreach(c => println(s"\t${c.head}, ${c(1)} and ${c(2)}"))
  }

  def printList[T](title: String, items: List[T]): Unit = {
    print(s"$title\n\t")
    items.foreach(item => print(s"$item "))
    println()
  }
}
