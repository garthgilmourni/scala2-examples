package collections.parallel

import scala.collection.parallel.CollectionConverters._

class Result(val value: String, val id: Long) {}

object Program {

  def main(args: Array[String]) {
    val originalData = List("ab", "cd", "ef", "gh", "ij", "kl")
    val threadId = () => Thread.currentThread.getId
    val action = (str: String) => new Result(str + "yy", threadId())

    val newData1 = originalData.map(action)
    val newData2 = originalData.par.map(action)

    for (r <- newData1) {
      printf("%s from thread %d\n", r.value, r.id)
    }

    println("----------------------------")

    for (r <- newData2) {
      printf("%s from thread %d\n", r.value, r.id)
    }
  }
}
