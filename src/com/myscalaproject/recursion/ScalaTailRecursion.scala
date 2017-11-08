package com.myscalaproject.recursion

import scala.annotation.tailrec
import scala.math.BigInt.int2bigInt

object ScalaTailRecursion extends App{
  
  /**
   * recursive methods require return type
   * recursive methods have limited stack space
   */
  def factorial(n:BigInt):BigInt={
    
    if (n==0 ||n==1) 1
    else n*factorial(n-1)
  }
  
//  println(factorial(5))
 // println(factorial(10000))   //overflow exception as it exceeds the bigInt size
  
  /**
   * tail recursion way
   * 
   * That difference in the rewriting rules actually translates directly to a difference in the actual execution on a computer. In fact, it turns out that if you have a recursive function that calls itself as its last action, then you can reuse the stack frame of that function. This is called tail recursion.
   */
  
  import scala.annotation.tailrec
  
  @tailrec
  def factorialtail(n:BigInt,acc:BigInt):BigInt={
    
    if(n==0 || n==1) acc
    
    else factorialtail(n-1, n*acc)
    
  }
  
  println(factorialtail(5, 1))
  
  println(factorialtail(10000, 1))
    @tailrec
  def fact(n:BigInt,acc:BigInt):BigInt={
    
    if(n==0 || n==1) acc
    
    else fact(n-1, n*acc)
    
  }
  
  def factorialTail(n:BigInt)=fact(n,1)
  
  println(factorialTail(5))
  
  println(factorialTail(10000))
  
  
 
  def factorialMethod(n:BigInt):BigInt={
    
    @tailrec
    def fact(n:BigInt,acc:BigInt):BigInt={
      
      if(n==0 || n==1) acc
      else fact(n-1,acc*n)
      
    }
    fact(n,1)
  }
  
  println(factorialMethod(5))
  /*def summer(nums:List[Int]):Int={
    
    var sum=0
    for(n <- nums)
      sum +=n
     sum
  }
  
  //  println(summer(List(1,2,3,4)))
    
    
    def summerRecr1(nums:List[Int]):Int={
      if(nums.isEmpty) 0
      else nums.head+summerRecr1(nums.tail)
    }
    
  //  println(summerRecr1(List(1,2,3,4,5)))
    
    
    *//**
     * A tail-recursive function will not build a new stack frame for each call; all calls will execute in a single
			*	frame. This may surprise a programmer inspecting a stack trace of a program that failed
			* 
			* 
			* 
     *//*
    
    
    *//**
     * This function is not tail recursive, because it performs an increment operation after the recursive call.You'll get what you expect
     *//*
//    def boom(x: Int): Int =
//      if (x == 0) throw new Exception("boom!")
//      else boom(x - 1) + 1
//      
//      boom(5)
    
    *//**
     * java.lang.Exception: boom!
at .boom(<console>:5)
at .boom(<console>:6)
at .boom(<console>:6)
at .boom(<console>:6)
at .<init>(<console>:6)
     *//*
    
    def boom1(x: Int): Int =
      if (x == 0) throw new Exception("boom!")
      else boom1(x - 1)
      
      boom1(5)
    *//**
     * This time, you see only a single stack frame
     * java.lang.Exception: bang!
        at .bang(<console>:5)
        at .<init>(<console>:6)
         You might think that bang crashed before it
        called itself, but this is not the case. If you think you might be confused by tail-call optimizations when
        looking at a stack trace, you can turn them off by giving the following argument to the scala shell or to
        the scalac compiler:
        -g:notailcalls
     *//*
      
      
      */
}