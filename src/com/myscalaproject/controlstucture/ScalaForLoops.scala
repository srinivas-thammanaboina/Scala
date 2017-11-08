package com.myscalaproject.controlstucture

object ScalaForLoops extends App{
  
  
  val files = (new java.io.File("C:\\Users\\srini\\Desktop\\scalaworspace\\ScalaBasics\\src\\com\\myscalaproject\\basics").listFiles())
  
  for(file <- files)  println(file)
  
  for(i <- 0 to 4) println("to "+i)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
   for(i <- 1 until 4) println("until "+i)  //exclusive of ending num
   
   for(i <- 1 to 20 by 4) println("to by "+i)
   
   for(i <- 0 to files.length) println(i) // not common is scala
   
   /**
    * For is more than just looping
    */

   for(file <- files if file.getName.startsWith(".")) println("for with one funrction "+file)
   
   for(file <- files if file.isFile() if file.getName.contains("classpath")) yield file.getName//println("for with second function "+file)

   
   /**
    * Nested iterations
    */
   
   def fileLines(file : java.io.File) =
  
   scala.io.Source.fromFile(file).getLines().toList
   
   def grep(pattern : String)=
     
     for(file <- files 
         if file.getName.endsWith(".scala");
         line  <- fileLines(file)
         if line.trim().matches(pattern)        
     )println(file +".."+pattern)
     
     
     grep(".*for*.")
     
     val x = for(i <- 0 to 10) yield {  //yield will return through the iteration
       println("calculating " +i )
       i
     }
  
  val y = for(i <- 0 to 10) yield i
  
  println(y)
  
  
  /**
   * transforming array[file] to array[Int]
   * 
   */
  val forLinelengths = 
    for{   //can use { for multiple lines to get rid of semicolons between seperation of lines
      
      file <- files
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches("*.for")
    }yield trimmed.length()
  
}
