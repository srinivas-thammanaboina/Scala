package com.myscalaproject.collections

object Ranges extends App{
  
  var r = 1 to 10 // 10 inclusive
  
  var r1 = 1 until 10 // 10 exclusive
  
  //we can do same operations as other collectins
  
  println(r.head)
  
  println(r1.tail)
  
  val r3 = 2 to 10 by 2
  var r4 = 10 until 2 by -2
  
  val r5 = ('a' to 'z') ++ ('A' to 'Z')
  
  println(r5)
  
  val r6 = Range(1,10)
  val r7 = Range(1,10,2)
  
  println(r7)
  
  val r8 = Range.inclusive(1, 10)
  
  println(r8)
  
  val r9 = Range.inclusive(2, 10,2)
  
  println(r9)
}