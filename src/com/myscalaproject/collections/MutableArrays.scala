package com.myscalaproject.collections

object MutableArrays extends App{
  
  /**
   * 
   * need to use the Scala ArrayBuffer class instead of the Array class, which can’t grow
   */
   
  import scala.collection.mutable.ArrayBuffer
  
  val fruits = ArrayBuffer[String]()
  
  fruits+="Apple"
  fruits+="banana"
  fruits+="cutie pie"
  
  println(fruits(0))
  
}