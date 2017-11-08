package com.myscalaproject.collectionswithfunctions

/**
 * map takes a function that applies on every element in a collection
 * 
 * map can be applied to Lists, sets, Maps, Streams,Strings and even options
 * 
 */
object MapFunctionExample extends App {
  
  val a = List(1,2,3,4,5)
  
  val f:(Int)=>Int = (x:Int)=> x+1
  
  println(a.map(f))
  
  println(a.map((x:Int)=>x+1))
  
  println(a.map((x)=>x+1))
    
  println(a.map(_+1))
  
  println(a.map(1+_))
  
  import scala.language.postfixOps
  
  println(a.map(1+))
  
  // map function on sets will create new set
  
  val b = Set("sravy","rahulpal","goutham","rajuu","subba")
  
  println(b.map((x:String)=>x.size))  // no duplicate size
  
  println(b.map(_.size))
  
  println(b.map((x:String)=>(x,x.size)))
  
  // map function on Map
  
  val team = Map('sravy->1,'rahu->2,'goutham->3,'subba->4,'divya->5,'rahul->6,'parthu->7)
  
  println(team.map(m => (Symbol.apply("Team@")+m._1.name,m._2)))
  
  println("Hello".map(c=>(c+1).toChar))
  
  println(Some(4).map(_+1))
  
  println(None.asInstanceOf[Option[Int]].map(_+1))  // none will return instead of error
}