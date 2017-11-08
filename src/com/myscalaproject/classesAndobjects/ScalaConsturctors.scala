package com.myscalaproject.classesAndobjects

class ScalaConsturctors(n:Int,d:Int) {
  
  println("this is from primary constructor")
  
  override def toString()= n +"/"+d
 }


class ConstructorCheckpoint(a:Int,b:Int){
  
  require(b==0,"illegal argument exception")
  
   println("this is from checkpoint constructor constructor")
}

object TestScalaConsturctors{
  
  def main(args: Array[String]): Unit = {
    
     var pc = new ScalaConsturctors(2,3)
     
     var cc = new ConstructorCheckpoint(1,3)
  }
}

