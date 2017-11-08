package com.myscalaproject.collections


/**
 * like lists tuples are immutable but tuples can have different data types
 * 
 * Tuples retains the data type of each element in it. we have a limit of 22 upto which no of elements can have. Tuple1[Int] --- Tuple22[..]
 * 
 * Tuple start with index 1 unlike other collections
 */

object Tuples {
  def main(args: Array[String]): Unit = {
    
    val type1 = 1:: Nil  // type1 => List[Int] = List(1)
    
    val type2 = 1:: true:: Nil  // type1 => List[AnyVal] = List(1, true)
    
    val type3 = "myString" :: 1 :: true :: Nil  // type1 => List[Any] = List(1)
    
    var myTuple = ("myString", 1, true)  //  myTuple: (String, Int, Boolean) = ("myString", 1, true)
    
    println(myTuple._1.charAt(2) + "--" +myTuple._2.+(2))
    
    if(myTuple._3) println("it is true")
    
    
    val a : Tuple2[Int,String] = (1,"a")
    
    println(a._2)
    
    
    
    
    
  }
}