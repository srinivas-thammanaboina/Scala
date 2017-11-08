package com.myscalaproject.sampleprograms

import java.io.File

object FilerReading {
  
  def main(args: Array[String]): Unit = {
    
    import scala.io.Source
    
    val src = new File("src/myFile.txt");
      
    for(line <- Source.fromFile(src).getLines())
      println(line.length() +"---" + line)
      
    }
}