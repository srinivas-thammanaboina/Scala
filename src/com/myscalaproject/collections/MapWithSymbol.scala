package com.myscalaproject.collections

object MapWithSymbol extends App{
  
  val s = new String("co")
  val s1 = "co"
  
  println(s == s1)  // true
  println(s eq s1)  // false
  
  val c0 = Symbol("co")
  val c1 = 'co
  
  println(c0==c1)  // true
  
  println(c0 eq c1)  // true
  
  val elements:Map[Symbol,String]= Map('a -> "A", 'b->"B", 'c->"C")
  
  println(elements.get('a))
  
  
}