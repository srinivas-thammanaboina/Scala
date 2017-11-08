package com.myscalaproject.functionsAndmethods

/**
 * Currying is taking a set of arguments and convert them into sequence of functions returning functions
 * 
 * can convert uncurried fun to curried by calling curried on that function
 * 
 * use Function.uncurried to uncurry a function
 */
object Curried extends App{
  
  val g = (x:Int)=>(y:Int)=>x+y
  
  val f =(x:Int,y:Int)=>x+y
  
  val fc=f.curried   // it is same as function g
  
  println(g(5)(6))
  
  println(fc(3)(4))
  
  val fuc =Function.uncurried(fc)
  
  println(fuc(4,5))
}