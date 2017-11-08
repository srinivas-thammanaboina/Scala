package com.myscalaproject.collections

/**
 * Map is availble in two forms Mutable & immutable
 */
object MapExample {
  
  def main(args: Array[String]): Unit = {
      
  /**
   * intializing Map
   * ny default it intialzes immutable Map
   */
  
  val numToWordMap = Map(1->"one",2->"two",3->"three")
   println(numToWordMap)
   
   import scala.collection.mutable
   
   val roolNums = mutable.Map[Int,String]()

   roolNums+= (1->"parthu")
   roolNums+= (2->"chinni")
   roolNums+= (3->"sravy")
   roolNums+= (4->"rahul")
   
   println(roolNums(2))
  
   
   val roomNums = Map((1,"I"),(2,"II"),(3,"III"))
   
   println(roomNums(3))
   
   println(roomNums.get(4))  // None
   
  // println(roomNums(4))  // Error
   
   println(roolNums.toList)  // List((2,chinni), (4,rahul), (1,parthu), (3,sravy))
   
   println(roolNums.keys)  //Set(2, 4, 1, 3)
   
   println(roolNums.values)  //HashMap(chinni, rahul, parthu, sravy)
   
   println(roolNums.values.toList)  //List(chinni, rahul, parthu, sravy)
   

      }
 }