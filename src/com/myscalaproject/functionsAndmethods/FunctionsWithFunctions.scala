package com.myscalaproject.functionsAndmethods

object FunctionsWithFunctions extends App{
  
  val f:(Int,(Int=>Int))=>Int = (x:Int,y:(Int=>Int))=> y(x)+x
  
  println(f(3,(m:Int)=> m))
  
  val f1 = (x:Int,y:(Int=>Int))=> y(x)
  
  println(f1(3,(m:Int)=> m+5))
  
  //function can return other function. usefule for applying functions in part
  
  val g = (x:Int)=>(y:Int)=>x+y
  
  println(g(5)(6))
  
  println(g.apply(5).apply(6))
  
}