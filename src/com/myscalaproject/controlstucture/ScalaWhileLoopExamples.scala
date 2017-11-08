package com.myscalaproject.controlstucture

class ScalaWhileLoop{
  
  def gcdLoop(x:Long,y:Long):Long = {
    
    var a = x
    var b = y
    while(a!=0){
      val temp = a
      a = b%a
      b=temp
    }
    b
  }
  
  def gdcDowhile:Unit = {
    var line=""
    do{
      line = readLine()
      println("Read "+line)
    }while(line!="")
  }
  
}

object ScalaWhileLoopExamples extends App{
  
  val gcd = new ScalaWhileLoop
  
  println(gcd.gcdLoop(84, 24))
  
  println(gcd.gdcDowhile)
}