package com.myscalaproject.functionsAndmethods

class MethodToFunction(x:Int) {
  
 def bar(y:Int) = x+y
 
}

class MyFriends(z:Int){
  
  def play(f:Int=>Int) = f(z)
 
}

object MethodToFunctionRunner extends App{
  
  val mfun = new MethodToFunction(5)
  
  val fun = mfun.bar _    //partially applied functions
  
  println(fun.apply(10))
  println(fun(10))
  
  val z = new MyFriends(100)
  
  println(z.play(fun)) // 105
  println(z.play(mfun.bar _))  // 105
  println(z.play(mfun.bar))   // 105
   /**
    * z.play(bar(100) = 5+100 = 105)
    */
  
}