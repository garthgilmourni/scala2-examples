package extractors

object Program {
  def main(args: Array[String]) {
    val validAddress1 = "10 \"Arcatia Road\" ABC12 XYZ"
    val validAddress2 = "12 \"Arcatia Road\" ABC12 XYZ"
    val validAddress3 = "12 \"University Street\" FGT57 MNB"
    val validAddress4 = "16 \"University Street\" FGT57 MNB"
    val invalidAddress = "foobar"

    checkUnapplyWorks(validAddress1)
    checkUnapplyWorks(invalidAddress)

    println("-----------------")
    demoExtractorsOne(validAddress1)
    demoExtractorsOne(invalidAddress)

    println("-----------------")
    demoExtractorsTwo(validAddress1)
    demoExtractorsTwo(validAddress2)
    demoExtractorsTwo(validAddress3)
    demoExtractorsTwo(validAddress4)
    demoExtractorsTwo(invalidAddress)

  }

  def checkUnapplyWorks(data: String) {
    val result = Address.unapply(data)
    result match {
      case Some(t) => printf("Found address %d %s (%s)\n", t._1, t._2, t._3)
      case None => println(data + " is NOT a valid address")
    }
  }

  def demoExtractorsOne(data: String) {
    println(data match {
      case Address(a, b, c) => s"Found address $a $b ($c)"
      case _ => s"$data is NOT a valid address"
    })
  }

  def demoExtractorsTwo(data: String) {
    println(data match {
      case Address(a, "\"Arcatia Road\"", _) => s"Found an Arcatia Road address (no $a)"
      case Address(12, a, _) => s"Found a no 12 address on $a"
      case Address(a, b, c) => s"Found address $a $b ($c)"
      case _ => s"$data is NOT a valid address"
    })
  }
}
