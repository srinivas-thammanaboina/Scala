package com.myscalaproject.sampleprograms

class CheckSumAccumulator {
  
  private var sum=0
  
  def add(c:Byte):Unit={sum+=c}
  
  def checkSum():Int = ~(sum & 0xFF)+1
  
 }

import scala.collection.mutable

object CheckSumAccumulator{
  
  private val cache = mutable.Map[String,Int]()
  
  def calculate(s:String):Int =
  {
    if(cache.contains(s)){
      cache(s)
    }else{
      val acc = new CheckSumAccumulator
      for(a<-s) acc.add(a.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
      
    }
  }
}

object CheckSumAccumulatorTest{
  
  def main(args: Array[String]): Unit = {
    
    println(CheckSumAccumulator.calculate("Sravanthi"))
    
    println(CheckSumAccumulator.calculate("Rahul Reddy"))
    
    println(CheckSumAccumulator.calculate("Rajender"))
    
    println(CheckSumAccumulator.calculate("Goutham"))
    
    println(CheckSumAccumulator.calculate("Subba"))
    
    println(CheckSumAccumulator.calculate("Sravanthi"))
  }
}