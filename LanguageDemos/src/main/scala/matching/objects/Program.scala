package matching.objects

object MovieType extends Enumeration {
  val VIDEO: MovieType.Value = Value("Video")
  val DVD: MovieType.Value = Value("DVD")
  val BLUE_RAY: MovieType.Value = Value("BLUE_RAY")
}

abstract sealed class StockItem

case class Book(isbn: String, category: String) extends StockItem

case class Movie(title: String, format: MovieType.Value) extends StockItem

case class CD(name: String, artist: String, numTracks: Int) extends StockItem

object Program {
  def processItem(item: StockItem): Unit = println(item match {
    case Book(_, "Crime") => "Found a crime novel"
    case Movie(_, MovieType.DVD) => "Found a DVD movie"
    case CD(_, _, 12) => "Found a CD with 12 tracks"
    case CD(_, "Soundgarden", _) => "Found a CD by Soundgarden"
    case Book(_, _) => "Found some kind of book"
    case _ => "Found something..."
  })

  def main(args: Array[String]) {
    val b1 = Book("ABC123", "SciFi")
    val b2 = Book("DEF456", "Crime")
    val m1 = Movie("Star Wars", MovieType.DVD)
    val m2 = Movie("Pulp Fiction", MovieType.BLUE_RAY)
    val cd = CD("Superunknown", "Soundgarden", 12)

    processItem(b1)
    processItem(b2)
    processItem(m1)
    processItem(m2)
    processItem(cd)
  }
}
