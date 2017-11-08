package com.myscalaproject.magicalmethds

class InfixOperators(x:Int) {
  
  def sravy(y:Int) = x+y
  
  def rahul(a:Int,b:Int):Int = x+a+b
  
  def parthu(a:Int)=new InfixOperators(a)
}

object InfixOperatorRunner extends App{
  
    val ino = new InfixOperators(10)
    
    println(ino.sravy(4))
    
    println(ino sravy 4)
    
    println(ino.rahul(10,12))
    
    println(ino rahul (10,12))
    
    println(1.+(2))
    
    println(ino sravy 4+5)
    
    println(ino.rahul(3,4)+5)
    
    println(ino parthu 7 parthu 8 parthu 5 sravy 4)
}
