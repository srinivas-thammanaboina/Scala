package com.myscalaproject.collections

/**
 * Arrays in scala are mutable though you can't change the size of array but you can change the elements inside array
 */

object ScalaArray {
  
  
  def main(args: Array[String]): Unit = {
    
    /**
     * first way
     */
    var myArray = new Array[String](3)
    
    myArray(0)="item1" // internally it is calling update method  --> myArray.update(0,"item1)
    
    myArray(1)="item2"
    
    myArray(2)="item3"
    
    for(i <- 0 to myArray.length-1){
      println(myArray(i))  // internally it will call apply() method --> myArray.apply(i)
    }
    
    /**
     * second way
     * 
     * invoking a factory method named apply on a Array companion object
     */
    val myArray2 = Array("A","B","C")  // this another way of intializing array   --> Array.apply("A","B","C")
    
    myArray2.foreach(x=>println(x))
    
    /**
     * repeated parameters are uses array to hold extra parameters
     * 
     */
    
    def repeatedParameterMethod(x:Int,y:String,z:Any*)={
      
      println(z)
      
      "%d %ss give you %s".format(x,y,z.mkString(","))
    }
    
    println(repeatedParameterMethod(1, "Sravy", "siva","sravantthi","kunduru","papa"))
    
    println(repeatedParameterMethod(2, "Rahul", List("RAhul","pal","reddy","hero")))
    
  }
}