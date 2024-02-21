package higher.order.functions

import java.io.File

object BasicHOF {
  def buildTaskWrappedWithTags[T](tagName: String, job: (T) => String): T => String = {
    val openingTag = "<" + tagName + ">"
    val closingTag = "</" + tagName + ">"

    (input: T) => openingTag + job(input) + closingTag
  }

  def main(args: Array[String]): Unit = {
    def testFuncOne(s: String) = s.toUpperCase

    def testFuncTwo(f: File) = f.getAbsolutePath

    val f1 = buildTaskWrappedWithTags("h1", testFuncOne)
    val f2 = buildTaskWrappedWithTags("h2", testFuncTwo)

    println(f1("wibble"))
    println(f2(new File(".")))
  }
}
