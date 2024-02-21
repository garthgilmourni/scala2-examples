package extractors

class Address(val num: Int, val street: String, val postcode: String) {
}

object Address {
  def apply(num: Int, street: String, postcode: String): Address = {
    new Address(num, street, postcode)
  }

  def unapply(theAddress: String): Option[(Int, String, String)] = {
    val addressRegex = """([0-9]+) ("[a-zA-Z ]+") ([A-Z]{3}[0-9]{2} [A-Z]{3})""".r
    theAddress match {
      case addressRegex(m1, m2, m3) => Some(m1.toInt, m2, m3)
      case _ => None
    }
  }
}
