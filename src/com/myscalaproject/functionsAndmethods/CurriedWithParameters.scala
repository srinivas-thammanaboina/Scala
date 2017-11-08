package com.myscalaproject.functionsAndmethods

object CurriedWithParameters extends App{
  
  def sravy(x:Int,y:Int,z:Int)=x+y+z
  //sravy: (x: Int, y: Int, z: Int)Int
  
  def rahul(x:Int)(y:Int)(z:Int)=x+y+z
  //rahul: (x: Int)(y: Int)(z: Int)Int
  
  def parthu(x:Int,y:Int)(z:Int)=x+y+z
  //parthu: (x: Int, y: Int)(z: Int)Int
  
  val s=sravy _
  //s: (Int, Int, Int) => Int = <function3>
  
  val r = rahul _
  //r: Int => (Int => (Int => Int)) = <function1>
  
  val p = parthu _
  //p: (Int, Int) => Int => Int = <function2>
 
  
 val sr = sravy(5,_:Int,_:Int)
 
 val ra = rahul(5)_
 
 val pa = parthu(5,_:Int)_
 
 println(sr(3,4))
 println(ra(5)(4))
 println(ra.apply(5).apply(4))
 println(pa(10)(20))
  
 
}