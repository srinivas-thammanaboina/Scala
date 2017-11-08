package com.myscalaproject.basics

object ScalaStrings extends App {
  
  var lyrics = """bali bali bari ra bali
                  @sahore bahubali
                  @ne dash ki nene kattali
                  @hey sa orni sa""".stripMargin('@')
                  
    println(lyrics)
    
    val message = "we are meeting on oct 24 of this year, and having fun at 12:40PM"
    
    val regex1 = "(\\s|[0-9])?[0-9]:[0-5][0-9]\\s*(AM|PM)".r  // //s space -- //s* zero more spaces
    
    println(regex1.findAllIn(message).toList)
    
    val regex = """(\s|[0-9])?[0-9]:[0-5][0-9]\s*(AM|PM)""".r
    
    println(regex.findAllIn(message).toList)
  
  println(String.format("This is a %s","Test" ))
  
  println("This is a %s".format("Test"))
  
    println("This is a %3$s,%2$s,%1$s times value".format("one","Two","Three"))
    
    import java.time._
    
    println("we will do lunch on %1$tB the %1$te in the year %1tY.".format(LocalDate.now))
  
  printf("we will do lunch on %1$tB the %1$te in the year %1tY.",LocalDate.now)
  
  val tickePrice = 50
  var brand = "Levis"
 // printf(f"The $brand%s tickets are probably $$$tickePrice%1.2f")
  
  val percentageincrease = 10
  var brand1 = "Levis"
   printf(f"The $brand%s tickets are probably $$$tickePrice%1.2f%nThat's $percentageincrease%% bump bcz all likes it ")
   
   
   
  
  
}