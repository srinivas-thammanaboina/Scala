package com.myscalaproject.collectionswithfunctions

object FlatMap extends App{
  
  val a = List(1,2,3,4,5)
  
  println(a.map(x=>List(-x,0,x)))
  
  //List(List(-1, 0, 1), List(-2, 0, 2), List(-3, 0, 3), List(-4, 0, 4), List(-5, 0, 5))
  
   println(a.map(x=>List(-x,0,x)).flatten)
   
   //List(-1, 0, 1, -2, 0, 2, -3, 0, 3, -4, 0, 4, -5, 0, 5)
   
   println(a.flatMap(x=>List(-x,0,x)))
   
   //List(-1, 0, 1, -2, 0, 2, -3, 0, 3, -4, 0, 4, -5, 0, 5)
   
  val b:(List[List[List[Int]]]) = List(List(List(1,2,3),List(4,5,6),List(7,8,9),List(10,11,12)))
  
  println(b.flatMap(c=>c))
  
  //List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9), List(10, 11, 12))
  
  println(b.flatMap(c=>c.flatMap(c=>c)))
  
  //List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
  
   println(b.flatMap(c=>c.flatMap(c=>c.flatMap(c=>List(-c,0,c)))))
   
   //List(-1, 0, 1, -2, 0, 2, -3, 0, 3, -4, 0, 4, -5, 0, 5, -6, 0, 6, -7, 0, 7, -8, 0, 8, -9, 0, 9, -10, 0, 10, -11, 0, 11, -12, 0, 12)
   
    val team = Map('sravy->1,'rahu->2,'goutham->3,'subba->4,'divya->5,'rahul->6,'parthu->7)
    
    println(team.map(t=>Map(t._1->t._2, t._1+ " friend of mine" -> t._2*100)))
    
//    List(Map('rahul -> 6, 'rahul friend of mine -> 600), Map('divya -> 5, 'divya friend of mine -> 500), Map('subba -> 4, 'subba friend of mine -> 400), Map('goutham -> 3, 'goutham friend of mine -> 300), Map('parthu -> 7, 'parthu friend of mine -> 700), Map('rahu -> 2, 'rahu friend of mine -> 200), Map('sravy -> 1, 'sravy friend of mine -> 100))

    println(team.flatMap(t=>Map(t._1->t._2, t._1+ " friend of mine" -> t._2*100)))
    
    //Map('rahul -> 6, 'divya -> 5, 'subba -> 4, 'rahul friend of mine -> 600, 'rahu friend of mine -> 200, 'sravy friend of mine -> 100, 'parthu friend of mine -> 700, 'divya friend of mine -> 500, 'goutham -> 3, 'parthu -> 7, 'rahu -> 2, 'sravy -> 1, 'goutham friend of mine -> 300, 'subba friend of mine -> 400)

    println(Some(4).map(x=>Some(x+4)))
    
    //Some(Some(8))
    
    println(Some(4).flatMap(x=>Some(x+4)))
    //Some(8)
    
    println(None.asInstanceOf[Option[Int]].flatMap(x=>Some(4)))
    //None
    
    println(Some(4).flatMap(x=>None))
    //None
    
    println(List(Some(4),None,Some(5),None,None,Some(10)).flatMap(x=>x))
    //List(4, 5, 10)
    
}