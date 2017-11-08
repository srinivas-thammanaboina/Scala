package com.myscalaproject.collectionswithfunctions

/**
 * 
 * Forcomprehension is just like map,flatmap,filter and foreach behind the scenes
 * 
 * they look like for but they are not , for one they can be assigned to a value
 * 
 * they return collections like Lists,Sets,Options etc.
 * 
 * Any object with map,flatmap,withFilter and foreach can be used in a for comprehension
 */

object ForComprehensive extends App{
  
  /*for(i <- 1 to 10){
    println(i)
  }*/
  
  val result = for(i <-1 to 10) yield i+1
  
  println(result)
  //Vector(2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
  
  val result1 = (1 to 10).map(_+1)
  
  println(result1)
  //Vector(2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
 
  val result2 = for(i <- Some(4)) yield i+2
  
  println(result2)
  //Some(6)
  
  val result3 = for(i <- List(1,2,3,4);
                     j <- List(5,6,7,8)) yield (i,j)
                     
   println(result3)
   //List((1,5), (1,6), (1,7), (1,8), (2,5), (2,6), (2,7), (2,8), (3,5), (3,6), (3,7), (3,8), (4,5), (4,6), (4,7), (4,8))
   
   val result4 = List(1,2,3,4).map(x=>List(5,6,7,8).map(y=>(x,y)))
   
   println(result4)
  //List(List((1,5), (1,6), (1,7), (1,8)), List((2,5), (2,6), (2,7), (2,8)), List((3,5), (3,6), (3,7), (3,8)), List((4,5), (4,6), (4,7), (4,8)))

   val result5 = List(1,2,3,4).flatMap(x=>List(5,6,7,8).map(y=>(x,y)))
   
   println(result5)
   //List((1,5), (1,6), (1,7), (1,8), (2,5), (2,6), (2,7), (2,8), (3,5), (3,6), (3,7), (3,8), (4,5), (4,6), (4,7), (4,8))
   
   val result6 = for(i <- List(1,2,3,4) if(i%2)==0;
                      j<- List(5,6,7,8)) yield (i,j)
     
    println(result6) 
    //List((2,5), (2,6), (2,7), (2,8), (4,5), (4,6), (4,7), (4,8)) 
     
   val result7 = for(i <- List(1,2,3,4);
                      j<- List(5,6,7,8) if(j%2)==0) yield (i,j)
     
    println(result7) 
    //List((1,6), (1,8), (2,6), (2,8), (3,6), (3,8), (4,6), (4,8))
    
   val result8 = for(i <- List(1,2,3,4)
                     if(i%2)==0;
                     j<- List(5,6,7,8)) yield (i,j)
      
   val result9 = for(i <- List(1,2,3,4);
                      j<- List(5,6,7,8)
                      if(j%2)==0) yield (i,j)
      
    val result10 = List(1,2,3,4).filter(_%2==0).flatMap(x=>List(5,6,7,8).map(y=>(x,y))) 
    
    println(result10)
    //List((2,5), (2,6), (2,7), (2,8), (4,5), (4,6), (4,7), (4,8))
    
    val result11 = List(1,2,3,4).flatMap(x=>List(4,5,6,7).filter(_%2==0).map(y=>(x,y)))
    
    println(result11)
    //List((1,4), (1,6), (2,4), (2,6), (3,4), (3,6), (4,4), (4,6))
}