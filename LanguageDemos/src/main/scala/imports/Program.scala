package imports

import java.lang.Math._
import java.util.regex._
import java.util.stream.{IntStream, DoubleStream}
import java.util.{Map => IMap} //import with an alias

object Program {
  def main(args: Array[String]) {
    printf("The square root of 16 is %.1f\n", sqrt(16));

    val m = Pattern.compile("[A-Z]{3,5}").matcher("HELLO")
    if (m.matches()) {
      println("Patten matches data!")
    }

    val intStream = IntStream.of(12, 34, 56)
    printf("The int stream has size %d\n", intStream.count())

    val doubleStream = DoubleStream.of(1.2, 3.4, 5.6, 7.8)
    printf("The double stream has size %d\n", doubleStream.count())

    var map: IMap[Int, String] = null //note use of alias here
    map = IMap.of(
      12, "foo",
      34, "bar",
      56, "zed"
    )
    printf("A new map has size %d\n", map.size())
  }
}
