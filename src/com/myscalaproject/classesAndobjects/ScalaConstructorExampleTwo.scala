package com.myscalaproject.classesAndobjects

class ScalaConstructor2(n:Int,d:Int) {
  
  require(d!=0,"denominator should not be zero")
 
  override def toString = n+"/"+d
  
  
  //Compilation error
//  def add(that:ScalaConstructor2):ScalaConstructor2=
//    new ScalaConstructor2(n*that.d +that.n*d,d*that.d)
  
  /**
   * when we pass primary constructor it will create private final variable which are strict that instace only.
   * 
   * when we are trying from other instace code will not compile as it is not allowed
   */
  
}

class ScalaConstructor3(n:Int,d:Int) {
  
  require(d!=0,"denominator should not be zero")   
 
  override def toString = n+"/"+d
  
  var numer = n
  var denom = d
  
   def add(that:ScalaConstructor3)=
    new ScalaConstructor3(that.numer*denom+that.denom*numer,that.denom*denom)
  
}

class ScalaConstructor4(val n:Int,val d:Int) {
  
  require(d!=0,"denominator should not be zero")   
 
  override def toString = n+"/"+d
  
    def add(that:ScalaConstructor4)=
    new ScalaConstructor4(that.n*d+that.d*n,that.d*d)
  
}

object Test{
  
  def main(args: Array[String]): Unit = {
  
  var oneThird = new ScalaConstructor3(1,3)
  
  var twoThird = new ScalaConstructor3(2,3)
  
  println(oneThird)
  
  println(twoThird)
  
  println(oneThird.add(twoThird))
  
  
  //************
  var oneThird2 = new ScalaConstructor4(1,3)
  
  var twoThird2 = new ScalaConstructor4(2,3)
  
  println(oneThird2)
  
  println(twoThird2)
  
  println(oneThird2.add(twoThird2))
  
      
   
  }
}