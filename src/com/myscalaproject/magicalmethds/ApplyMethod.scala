package com.myscalaproject.magicalmethds

class Rahul(x:Int) {
  
  def apply(y:Int)= x+y 
}


case class ApplyMethodClass(name:String)

/**
 * case internally having companion object with same name and have a apply method to create instance
 * so that case class we can instantiate just like objects
 * 
 * class ApplyMethodClass(name:String)
 * 
 * object ApplyMethodClass{
 *
 * 	def apply(name:String) = new ApplyMethodClass(name) 
 * 
 * }
 */

object MagicalApply extends App{
  
  val foo = new Rahul(3)
  println(foo.apply(4))
  println(foo(5))
  
  val applymethod = ApplyMethodClass("sravy")
  
  val applymethod1 = ApplyMethodClass.apply("sravy")
}