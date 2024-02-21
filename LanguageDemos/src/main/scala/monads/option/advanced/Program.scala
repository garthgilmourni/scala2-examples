package monads.option.advanced

class Postcode(val value: String) {
  def findValue(): Option[String] = if (value eq null) None else Some(value)
}

class Address(val number: Int,
              val street: String,
              val postcode: Postcode) {
  def findPostcode(): Option[Postcode] = if (postcode eq null) None else Some(postcode)
}

class Person(val name: String, val address: Address) {
  def findAddress(): Option[Address] = if (address eq null) None else Some(address)
}

object Program {
  def main(args: Array[String]) {
    val p1 = new Person("Dave", null)
    val p2 = new Person("Jane", new Address(10, "Arcatia Road", null))
    val p3 = new Person("Pete", new Address(11, "Arcatia Road", new Postcode(null)))
    val p4 = new Person("Susan", new Address(12, "Arcatia Road", new Postcode("ABC 123")))

    printPostcodeIfExists(p1)
    printPostcodeIfExists(p2)
    printPostcodeIfExists(p3)
    printPostcodeIfExists(p4)
  }

  def printPostcodeIfExists(person: Person) {
    println("Working with " + person.name)
    for (
      place <- person.findAddress();
      code <- place.findPostcode();
      result <- code.findValue()
    ) println(result)
  }
}
