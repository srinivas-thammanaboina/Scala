package com.myscalaproject.functionsAndmethods

class Foo(x:Int) {
  
  def bar(y:Int => Int) = y(x)
  
}

object Closures extends App{
  
  //val addMore =  (x:Int)=>x+more   // more is not defined. compilation error
  var more=1
  val addMore=(x:Int)=>x+more  //closure
  println(addMore(5))
  
  more=100
  println(addMore(5))
  def makeMoreFun(howMuchMore:Int)=(x:Int)=>x+howMuchMore
  val a1=makeMoreFun(10)
  val a2=makeMoreFun(100)
  println(a1(1))
  println(a2(1))
    
  val m = 500
  val f = (x:Int)=>x+m
  
  val foo = new Foo(100)
  println(foo.bar(f))
  
}