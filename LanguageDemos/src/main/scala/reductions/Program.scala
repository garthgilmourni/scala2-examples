package reductions

object Program {
  def main(args: Array[String]): Unit = {
    val data = Array("super", "cala", "fragil", "istic", "expy", "ali", "dotious")

    val result1 = data.reduce((s1, s2) => s1 + s2)
    val result2 = data.reduce(_ + _)
    val result3 = data.foldLeft(new StringBuilder())((sb, s) => sb.append(s))
    val result4 = data.foldLeft(new StringBuilder())(_.append(_))

    println(result1)
    println(result2)
    println(result3.toString)
    println(result4.toString)
  }
}
