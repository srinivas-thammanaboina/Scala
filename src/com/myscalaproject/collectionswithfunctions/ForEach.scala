package com.myscalaproject.collectionswithfunctions



/**
 * 
 * foreach is just like map but it returns unit where map function return something
 */

object ForEach extends App{
  
  val a = 0 to 10
  
  a.map(x=>println(x)) // it prints 0 to 10 along with Vector(()....()) because map has to return some collection
 
  a.foreach(x=>println(x))
     
  a.foreach(println)
  
  a foreach println
}

