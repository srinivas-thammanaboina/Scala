package com.myscalaproject.functionsAndmethods

/**
 * Functions are their own objects
 * methods are not functions
 * methods belongs to a context
 * 
 */
class MethodOrFunction {
  
  val f = (x:Int) => x+1
  
  def g(x:Int):Int = {
    x+1
  }
}

object MethodOrFunction extends App{
  
  val obj = new MethodOrFunction
  
  println(obj.f.apply(4))
  println(obj.f(4))
  println(obj.g(4))
  
}