package com.myscalaproject.functionsAndmethods

object FunctionsRefactor extends App{
  
  val f1:Int => Int = new Function1[Int,Int]{
    
      def apply(x:Int):Int = x+1
  }

  
   val f0:()=>Int = new Function0[Int]{
      def apply():Int = 0
  }
   val f2:(Int,Int)=>Int = new Function2[Int,Int,Int]{
      def apply(x:Int,y:Int):Int = if (x>y) x else y
  }
     
  println(f1.apply(4))
  println(f1(4))
  println(f0())
  println(f2(4,3))
  
  val f1_1:Int => Int = (x:Int)=> x+1
    
  val f0_1:()=>Int = ()=> 0
  
  val f2_1:(Int,Int)=>Int = (x:Int,y:Int) => if (x>y) x else y
  
  println(f1_1(4))
  println(f0_1())
  println(f2_1(4,3))
  
  val f1_2 = (x:Int)=> x+1
    
  val f0_2 = ()=> 0
  
  val f2_2 = (x:Int,y:Int) => if (x>y) x else y
  
  println(f1_2(4))
  println(f0_2())
  println(f2_2(4,3))
  
  val f1_3:(String)=>(String,Int) = (x:String) => (x,x.size)
   
  println(f1_3("MeenaGoutham"))
}