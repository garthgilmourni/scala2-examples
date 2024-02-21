package partial.invocation.advanced

object Program {
  def findMatchesV1(regex: String): (String) => (Array[String]) = {
    return (data: String) => {
      regex.r.findAllIn(data).toArray
    }
  }

  def findMatchesV2(regex: String): String => Array[String] = {
    (data: String) => {
      regex.r.findAllIn(data).toArray
    }
  }

  def findMatchesV3(regex: String): String => Array[String] = (data: String) => {
    regex.r.findAllIn(data).toArray
  }

  def findMatchesV4(regex: String)(data: String): Array[String] = {
    regex.r.findAllIn(data).toArray
  }

  def demoV1() {
    val data = "ab CD ef GH ij KL mn OP qr ST"
    val matchTwoUppercase = findMatchesV1("[A-Z]{2}")
    val matchTwoLowercase = findMatchesV1("[a-z]{2}")

    println("Version One Results:")
    for (m <- matchTwoUppercase(data)) {
      println("\t" + m)
    }
    println("-------------")
    for (m <- matchTwoLowercase(data)) {
      println("\t" + m)
    }
  }

  def demoV2() {
    val data = "ab CD ef GH ij KL mn OP qr ST"
    val matchTwoUppercase = findMatchesV2("[A-Z]{2}")
    val matchTwoLowercase = findMatchesV2("[a-z]{2}")

    println("Version Two Results:")
    for (m <- matchTwoUppercase(data)) {
      println("\t" + m)
    }
    println("-------------")
    for (m <- matchTwoLowercase(data)) {
      println("\t" + m)
    }
  }

  def demoV3() {
    val data = "ab CD ef GH ij KL mn OP qr ST"
    val matchTwoUppercase = findMatchesV3("[A-Z]{2}")
    val matchTwoLowercase = findMatchesV3("[a-z]{2}")

    println("Version Three Results:")
    for (m <- matchTwoUppercase(data)) {
      println("\t" + m)
    }
    println("-------------")
    for (m <- matchTwoLowercase(data)) {
      println("\t" + m)
    }
  }

  def demoV4() {
    val data = "ab CD ef GH ij KL mn OP qr ST"
    val matchTwoUppercase = findMatchesV4("[A-Z]{2}") _
    val matchTwoLowercase = findMatchesV4("[a-z]{2}") _

    println("Version Four Results:")
    for (m <- matchTwoUppercase(data)) {
      println("\t" + m)
    }
    println("-------------")
    for (m <- matchTwoLowercase(data)) {
      println("\t" + m)
    }
  }

  def main(args: Array[String]) {
    demoV1
    demoV2
    demoV3
    demoV4
  }
}
