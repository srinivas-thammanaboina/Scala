package com.myscalaproject.collections

/**
 * Lists in Scala are always immutable unlike in java it is mutable.
 * Scala list class is availbe in scala.collection.immutable package
 * 
 */
object ScalaList {
  
  def main(args: Array[String]): Unit = {
    
    
    /**
     * intializinging method 1 
     * 
     * invoking a factory method named apply on a Array companion object
     */
    val list1 = List(1,2,3)
    
    val list2 = List(4,5,6)
    
    val list3 = list1 ::: list2  // ':::' is used to list concatenation it will create a new list 
    
    println(list3)
    
    val list4 = List("ABC","DEF","GHIX","DFGGS")
    
    println(list4.head)
    
    println(list4.tail)
    
    println("No of 3 digit elements are "+ list4.count { x => x.length()==3 })  // count the elements which are having length 3
    
    println("elemets from list4 with out first 2 elements "+ list4.drop(2))
    
    println("elemets from list4 with out first 2 elements from right side "+ list4.dropRight(2))
    
    println("check for 'ABC' existence in list4 "+ list4.exists { x => x=="ABC" })
    
    println("filter  elements which are having length >=4 in list4 "+ list4.filter { x => x.length()>=4})
     
    println("append  '_1' to each elements in list4 "+ list4.map { x => x+"_1" })
     
    println("load into string from list4 "+ list4.mkString(","))
      
    println("append  '_1' to each elements in list4 "+ list4.map { x => x+"_1" })
    
    val addToList = "x"::list4  /** to prepend a new element we use '::' operator 
    																	if the method name ends in colon the method invoked on the right operand
    																	* so this method looks like 
    																	* list4.::("x")
    																	*/
                                 
    println(addToList)
    
     //intializinging method 2
    val list5 = 1 :: 2 :: 3 :: Nil   // Nil is an empty list
    
    list3.count { x => x==3 }
    
    list5.foreach { x => println(s"list5 is ${x}") }
    
    /**
     * Scala List class offers append method but it is not recommended because time it takes append elements grows linearly with size ot the list
     * where as :: takes constant time. if want to build list effectively use :: operator to append and when calling list use reverse method
     * 
     * ListBuffer which is a mutable list offer an append operation at the can call toList method
     */
    
    
    
    
  }
}