package com.myscalaproject.functionsAndmethods

object ScalaMethods extends App{
    
     /**
     * bending method names your will
     */
    
    def `summation of `(x:Int,y:Int):Int={
      x+y
  }
  val s = `summation of `(2,3)
  println(s)
  
  def decision(b:Boolean,x:Any,y:Any):Any={if(b) x else y}
  
  println(decision(true,"A","B")) //Any - A
  
  println(decision(false,3,10))  //Any - 10
  
  println(decision(true,'c','d'))  //Any - c
  
  def getNextChar(c:Char)= (c+1).toChar
  
 // println(getNextChar(decision(true, 'c', 'd')))  ----- type miss match require any but actual is char
  
  val result = decision(true, 'c', 'd')
  
  if(result.isInstanceOf[Char]){
    val charResult = result.asInstanceOf[Char]
    println(getNextChar(charResult))
  }
  
  /**
   * parameterized types 
   * parameterized types use [] or <>
   * parameterized types nearly equals to Generics in java & Templates in C++
   * prefer to use single letters: A, B, C, D, E, T
   */

   def decisionParameterized[T](b:Boolean,x:T,y:T):T={if(b) x else y}
   
   println(decision(true,"A","B")) //Double - A
  
  println(decision(false,3,"G"))  //Any - 10  (because common parent for string & int is Any)
  
  println(decision(true,5,'d'))  //Int - c  Any operation on int which is 32 bit longer will result in Int same for Long,Double..
  
  println(getNextChar(decisionParameterized(true, 'c', 'd')))
  
}