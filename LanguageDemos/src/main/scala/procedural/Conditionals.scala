package procedural

object Conditionals {
   def main(args : Array[String]) {
     val number = Math.random
     var choice1 = ""
     // Java style use of conditional
     if(number < 0.5) {
       choice1 = "ABC"
     } else {
       choice1 = "DEF"
     }
     // Idiomatic use of conditional
     val choice2 = if (number < 0.5) "ABC" else "DEF"
     println(choice1)
     println(choice2)
   }
}
