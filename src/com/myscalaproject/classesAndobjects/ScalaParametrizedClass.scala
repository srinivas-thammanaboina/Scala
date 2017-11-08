package com.myscalaproject.classesAndobjects

case class Bos[T](t:T)

case class Couple[A, B](first:A,second:B){
  
  def swap() = new Couple(second:B,first:A)
}

case class Box[S](s:S){
  
  def couplewithBox[U](u:U):Box[Couple[S,U]] = Box(Couple(s,u))
 
}

object testBox extends App{
  
  val b1=new Bos(1) //b1[Int]=Box(1)
  
  println(b1.t)
  
  val b2 = Bos("hi") // b2[String]=Bos("hi")
  
  val b3 = Bos[String]("Hellow") // b3[String]=Box(Hellow)
  
  val b4 = Bos("my bos"):Bos[String]
 
  println(b4.t)
  
  val b5 = Bos(Bos(4.0))
  
  println(b5.t.t)  //4.0
  
  val c1 = Couple(4,6) //c1: couple[Int,Int] = couple(4,6)
  
   val c2 = Couple(4,"hi") //  val c2 = couple(4,"hi")
   
   val c3:Couple[String,String]=Couple("1","2")  //case class Couple[A, B](first:A,second:B)
   
   val c4 = Couple(1,Couple("first","second"))
   
   println(c4.second.first)
   
   val box = Box(7)
   
   val cbox = box.couplewithBox(4)
   
   println(box.s)
   
   println(cbox.s.first)
   
   val swap1 = Couple(2,3).swap
   
   println(swap1)
   
}