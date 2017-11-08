package com.myscalaproject.basics

/**
 * by defulat case clasees will have tostring, equals, hashcode,copy methods
 */
case class Apartment(val name:String)  //val is not needed it is bydefault val
{
  override def toString() = {s"Apartments => $name"}
}
object testCase extends App{
  
  val apt1 = new Apartment("horizons")
  
  println(apt1)
  
   val apt2 = Apartment("horizons")
  
  println(apt1==apt2)
  
   println(apt1 eq apt2)
   
   val apt3=apt1
   
   println(apt1 eq apt3)
  
  val copyApt = apt1.copy(name="desert horizon")
  
  println(copyApt)
  
}