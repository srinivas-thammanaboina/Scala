package com.myscalaproject.functionsAndmethods

/**
 * functions are traits (pure abstaract methods) can be instatiated anonymously
 * 
 * funcations can only return one item that one item can be tuple if need to return mutliple items
 * 
 * scala has a trait called Function1[-T1,+R] extends AnyRef
 * 
 * it has below method
 * 
 * abstract def apply(v1:T1):R
 * 
 * we have Function[0-22] to use and define implementation however we want
 */
object Functions extends App{
  
  val f1:Function1[Int,Int] = new Function1[Int,Int]{
    
      def apply(x:Int):Int = x+1
  }
  
  println(f1.apply(4))
  println(f1(4))
  
   val f0:Function0[Int] = new Function0[Int]{
      def apply():Int = 0
  }
   val f2:Function2[Int,Int,Int] = new Function2[Int,Int,Int]{
      def apply(x:Int,y:Int):Int = if (x>y) x else y
  }
   
   println(f0())
   println(f2(4,3))
}