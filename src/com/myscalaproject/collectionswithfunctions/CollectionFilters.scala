package com.myscalaproject.collectionswithfunctions

/**
 * 
 * Filter - filter out the elements in collection which meets the predicate criteria
 * filterNot opposite to filter
 * exists
 * methods are available for lists, sets, ranges, maps,options etc
 * 
 */
object CollectionFilters extends App{
  
  val a = 0 to 10
  
  println(a.filter(x=> x%2==0)) // Vector(0, 2, 4, 6, 8, 10)
  
   println(a.filterNot(x=> x%2==0)) //Vector(1, 3, 5, 7, 9)
  
  println(a.filter(_%2!=0))   //Vector(1, 3, 5, 7, 9)
  
  println(a.exists(_%2==0))  // Does it has even number
  
  val mySet = Set("Sravy","parthu","R@hul","raju","Divya","subba","goutham","meena")
  
  println(mySet.filter(x=>x.contains('a') && x.size>4))
  
  val team = Map('srvy->1,'rhl->2,'goutham->3,'meena->4,'subba->5,'divya->6,'raaz->7,'parthu->8)
  
  println(team.filterKeys(x=> x.name.size>5))
  
  val vowels = Set('a','e','i','o','u')

  val filterVowels =(s:String)=>s.toLowerCase().filter(x=>vowels.contains(x))
  
 println(team.filterKeys(x=>filterVowels(x.name).size>0))
     
     
}