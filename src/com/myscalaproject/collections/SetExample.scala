package com.myscalaproject.collections


/**
 * Scala sets provides both immutable & mutable types. 
 * 
 * set is a trait and HashSet is concrete class in both scala.collection.{immutable}/{mutable} package. Default is immutable
 * 
 */
object SetExample {
  
  def main(args: Array[String]): Unit = {
    
    
    /**
     * intializinging method 1 
     * 
     * invoking a factory method named apply on a Array companion object
     */
    
    var mySet = Set("item1","item2")
    
    mySet += "item3"  // there is no += method but scala will rewrite as mySet = mySet+"item3"
    
    println(mySet.contains("item3"))
    
    import scala.collection.mutable
    
    val mymutableSet = mutable.Set(1,2,3)
    
    mymutableSet += 4  // mutable set has += method. so it will convert to .+=()
    
    println("my mutable set "+mymutableSet)
    
    import scala.collection.immutable.HashSet
    
    val myHashSet = HashSet(1,2,3)
     
    println(myHashSet+4)
    
  }
}