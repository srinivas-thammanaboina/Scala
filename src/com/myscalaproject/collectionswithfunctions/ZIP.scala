package com.myscalaproject.collectionswithfunctions

/**
 * zip intertwines two collections
 * zip result will be the size of the shorter collection
 * zip can be performed on lists,maps,sets, strings,streams,options etc
 */
object ZIP extends App {
  
  val a = List(1,2,3,4)
  val b= List(5,6,7,8)
  
  println(a zip b)
  //List((1,5), (2,6), (3,7), (4,8))
  
  println((1 to 5) zip (6 to 9))
  //Vector((1,6), (2,7), (3,8), (4,9))
  
    println((1 to 2) zip (6 to 9))
    //Vector((1,6), (2,7))
    
     val team = List("sravy","rahu","goutham","subba","divya","rahul","parthu")
     
     println(team zipWithIndex)
     //List((sravy,0), (rahu,1), (goutham,2), (subba,3), (divya,4), (rahul,5), (parthu,6))
     
     println(team.zipWithIndex.map(x=>(x._1,x._2+1)))
     //List((sravy,1), (rahu,2), (goutham,3), (subba,4), (divya,5), (rahul,6), (parthu,7))
     
     println(team.zipWithIndex.map(x=>(x._1,x._2+1)).map(t=>t.swap))
     //List((1,sravy), (2,rahu), (3,goutham), (4,subba), (5,divya), (6,rahul), (7,parthu))
     
     println(team.zipWithIndex.map(x=>(x._1,x._2+1)).map(t=>t.swap).map(a=>s"${a._1}:${a._2}"))
     //List(1:sravy, 2:rahu, 3:goutham, 4:subba, 5:divya, 6:rahul, 7:parthu)
    
     println(team.zipWithIndex.map(x=>(x._1,x._2+1)).map(t=>t.swap).map(a=>s"${a._1}:${a._2}").mkString("\n"))
     
      /*1:sravy
      2:rahu
      3:goutham
      4:subba
      5:divya
      6:rahul
      7:parthu*/
    
    
}