package com.myscalaproject.functionsAndmethods

object ByNameParameters extends App{
  
  def byValue(x:Int)(y:Int)={println("by value");x+y}
  
  def byFunction(x:Int)(y:()=>Int) = {println("by funcation"); x+y()}
  
  def byName(x:Int)(y: =>Int)= {println("by name");x+y}
  
  val a = byValue(5){println("In call");9}  //lazy invocation
  //In call
  //by value
  
    val b = byFunction(5)(()=>{println("In call");9})  //eager invocation
    
//    by funcation
//    In call
    
    val c = byName(5){println("In call");9}    //eager invocation
    
//    by name
//    In call
    
    /**
     * By Name parameters are parameters that can be called by block and lazily evaluated
     * 
     * By Name parameters are outstanding for catching exceptions and cleaning up resources after things done
     */
    
    def divideSafely(f: =>Int):Option[Int] = {
      try{
        Some(f)
      }catch{
        case ae:ArithmeticException => None
      }
    }
    
    val d = divideSafely(
     {
      val x = 200;
      val y = 100
      x/y;
    }
    )
 
    println(d)
    
     val e = divideSafely(
     {
      val x = 200;
      val y = 0
      x/y;
    }
    )
 
    println(e)
    
    
}