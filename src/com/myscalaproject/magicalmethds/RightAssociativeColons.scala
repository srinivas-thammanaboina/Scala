package com.myscalaproject.magicalmethds

/**
 * if method ends with colon we can invoke in right associative way
 * 
 * in order to invoke in a right associative way we must be invoked in a infix way
 * 
 * right associativity is primarily used for list and stream operators  
 */
object RightAssociativeColons extends App{
  
  class Foo(x:Int){
    
    def ~:(y:Int)=x+y
  }
  
  val foo = new Foo(6)
  
  println(foo.~:(6))
  
  // println(foo ~: 6)   == compilation error
    
  println(6 ~: foo)   //Right associative way
  
  
}