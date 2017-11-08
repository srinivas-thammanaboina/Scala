package com.myscalaproject.classesAndobjects

class AuxilaryConstructor(val n:Int,val d:Int) {
  
  require(d!=0, "denomintor should not be zero")
  
  def this(num:Int) = this(num,1)  //auxilary constructor
  
  override def toString = s"$n/$d"
  
   def +(that: AuxilaryConstructor)=
     new AuxilaryConstructor(n*that.d+that.n*d,that.d*d)
  
  def +(i:Int):AuxilaryConstructor= new AuxilaryConstructor(i*n,d)
  
  
}


object TestAuxilaryConstructor extends App{
  
  val a = new AuxilaryConstructor(1,3)
  
  val b = new AuxilaryConstructor(2)
  
  println(a+b)
  
  println(a+1)
  
  //println(2+a)  compilation error
  
  /**
   * implicit conversions 
   */
  
  implicit def intToAuxilary(x:Int):AuxilaryConstructor = new AuxilaryConstructor(x)
  
  println(1+a)
}