package com.myscalaproject.exceptions

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

/**
 * in Scala all are run time exceptions
 */
object ScalaExceptionsExample extends App{
  
  
  def half(n:Int): Int=
  if(n%2==0)
    return n/2
  else
    throw new IllegalArgumentException("not Even")
  
 // println(half(4))
  
 // println(half(3))
  
    def even(n:Int): Int={
      require(n%2==0,"Not Even")  //when condition not satisfied it will throw exception
     n/2
  }
  
  println(even(4))
  
     val file = new FileReader("input.txt")
 
  try{
    file.read()
  }catch{
    case ex:FileNotFoundException=> println("no file found")
    case ex:IOException=>println("can't read file")
  }finally{
    file.close()
  }
 
  
  /**
   * try is an expression rather than a statement it can have a return type in scala
   */
  
  import java.net.URL
  import java.net.MalformedURLException
  def urlFor(path:String):URL=
    try new URL(path)
  catch{
    case e:MalformedURLException => new URL("http:myurl.com")
  }
  
  println(urlFor("MyWebsite"))
}