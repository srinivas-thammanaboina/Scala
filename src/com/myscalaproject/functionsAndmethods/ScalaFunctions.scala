package com.myscalaproject.functionsAndmethods


object ScalaFunctions extends App {
  
  
  //assigning fun to variables
  /**
   * anonymus methods are first class functions
   */
  var x = (x:Int) => x+100
  
  x(2)  //it will rewrite x.apply(2)
  
  //can pass functions as args to other functions
  
  val someNumers = List(1,2,3,4)
  
  someNumers.foreach((x:Int)=>println(x))
  
  someNumers.filter((x:Int)=>x>2)
  
  println(someNumers.filter(x=>x>1))
  
  println(someNumers.filter(_ >1))
  
  println(someNumers.filter((_:Int) >=3))
  
  val add = (x:Int,y:Int)=>x+y  //we can get rid of params like below
  
  //val addem = _ + _   //compilation error 
  
  val addem = (_:Int) + (_:Int)
  
  println(addem(3,4))
  
  /**
   * function 
   * (x:Int,y:Int)=>x+y  - function literal
   * methods are member function
   * values are object of function values ex:val add = (x:Int,y:Int)=>x+y will create an object having methods apply
   */
  
  /**
   * partially applied functions
   */
  
  val sum = (_:Int)+(_:Int)+(_:Int)

  val add1=(b:Int)=>sum(1,b:Int,2)
  
  println(add1(5))
  
  val add2=sum(1,_:Int,_:Int)
  
  println(add2(5,3))
  

  
  /**
   * repeated parameters(varargs)
   */
  
  def echo(args:String*)=args.foreach { println}
  
  echo("sravy","subba","divay","goutham","parthu","raju","rahul")
  
  val words=Array("sravy","subba","divay","goutham","parthu","raju","rahul")
  
  echo(words:_*)
  
  /**
   * named arguments
   * 
   * when there are more args we can use named args
   * 
   * we can provide default values
   */
  def namedArgs(first:Int,second:Int)=first+second
  
  namedArgs(first=10, second=100)
  
  namedArgs(second=100,first=10)
  
  
  def printTimeOut(out:java.io.PrintStream=Console.out)=out.println(s"time=${System.currentTimeMillis()}")
  
  printTimeOut(out=Console.err)
  
  printTimeOut()
  
  def printTimeOut2(out:java.io.PrintStream=Console.out,divisor:Int=1)=out.println(s"time=${System.currentTimeMillis()/divisor}")
  
  printTimeOut2()
  
  printTimeOut2(divisor=10)
}

class Rational(n:Int,d:Int){
  def this(n:Int)=this(n,1)
  override def toString = s"$n/$d"
}
//get rid of auxilary constructor
class Rational2(n:Int,d:Int=1){
  override def toString = s"$n/$d"
}


object Testparams extends App{
  
  
  println(new Rational(2,4))
  
   println(new Rational(2))
   
    println(new Rational2(n=3))
  
   println(new Rational2(1,d=6))
   
    println(new Rational2(42))
   
}
