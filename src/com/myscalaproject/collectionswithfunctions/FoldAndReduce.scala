package com.myscalaproject.collectionswithfunctions


/**
 * 
 * 
 * foldLeft and foldRight will perform a reduction operation with a seed values
 * 
 * reduceLeft and reduceRight will performa a reduction without seed value
 * 
 * fold and reduce can be applied to lists, maps, streams, strings, even options
 * 
 */
object FoldAndReduce extends App{
  
  
  /**
   * 
   * def foldLeft[B](z: B)(op: (B, A) ⇒ B): B
   * 
   * total being the result and next is item in traversable collection
   */
  val foldLeftResult = (1 to 10).foldLeft(0){(total:Int,next:Int)=>
    
    println(s"Total: $total, Next: $next")
    
     next+total
  }
  

     /* Total: 0, Next: 1
        Total: 1, Next: 2
        Total: 3, Next: 3
        Total: 6, Next: 4
        Total: 10, Next: 5
        Total: 15, Next: 6
        Total: 21, Next: 7
        Total: 28, Next: 8
        Total: 36, Next: 9
        Total: 45, Next: 10*/
  
    println(foldLeftResult) //55
    
    val reduceLeftResult = (1 to 10).reduceLeft{(next:Int,total:Int)=>
    
    println(s"Total: $total, Next: $next")
    
    total+next
    
  }
    
 /* Total: 2, Next: 1
    Total: 3, Next: 3
    Total: 4, Next: 6
    Total: 5, Next: 10
    Total: 6, Next: 15
    Total: 7, Next: 21
    Total: 8, Next: 28
    Total: 9, Next: 36
    Total: 10, Next: 45*/

  println(reduceLeftResult)
  
  println("------------------------------------")
  
  val foldRightResult = (1 to 10).foldRight(0){(total:Int,next:Int)=>
    
    println(s"Total: $total, Next: $next")
    
    total+next
  }
  
  println(foldRightResult)
  
     /* Total: 10, Next: 0
        Total: 9, Next: 10
        Total: 8, Next: 19
        Total: 7, Next: 27
        Total: 6, Next: 34
        Total: 5, Next: 40
        Total: 4, Next: 45
        Total: 3, Next: 49
        Total: 2, Next: 52
        Total: 1, Next: 54
        55*/
  
  val reduceRightResult = (1 to 10).reduceRight {(next:Int,total:Int)=>
    
    println(s"Total: $total, Next: $next")
    
    total+next
  }
  
  println(reduceRightResult)
  
     /*Total: 10, Next: 9
        Total: 19, Next: 8
        Total: 27, Next: 7
        Total: 34, Next: 6
        Total: 40, Next: 5
        Total: 45, Next: 4
        Total: 49, Next: 3
        Total: 52, Next: 2
        Total: 54, Next: 1
        55	*/
}