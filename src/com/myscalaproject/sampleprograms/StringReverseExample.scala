package src.com.myscalaproject.sampleprograms

object StringReverseExample {
  
  
   def reverse3(s: String): String = {
     println(s)
    val len = s.length
    if (len == 1) {
      s
    } else {
      reverse3(s.substring(1, len)) + s.charAt(0)
    }
  }
   
   def main(args: Array[String]): Unit = {
     StringReverseExample.reverse3("Srinivas");
     
     //The raw string interpolator behaves like s, except it does not recognize character literal escape sequences
     println(raw"No\\\\escape!") // prints: No\\\\escape!
   }
}