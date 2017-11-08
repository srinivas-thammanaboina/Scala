package com.myscalaproject.patternmatching

object ScalaMatching extends App{
  
  def matchThis(s:String):Unit= {
    s match{
    case "sravy" => println("papa")
    case "divya" => println("auty")
    case "Subba" => println("grandpa")
    case "goutham" => println("bigfather")
    case "raju" => println("bacha")
    case "parthu" => println("teen")
    case "rahul" => println("hero")
    case _ =>println("its me default")
  }
  }
  
  matchThis("sravy")
  matchThis("its me") 
  
  val temp = Array("sravy","raju","goutham")
  val a = if(!temp.isEmpty) temp(0) else ""
    
    
    a match{
    case "sravy" => println("papa2")
    case "divya" => println("auty2")
    case "Subba" => println("grandpa2")
    case "goutham" => println("bigfather2")
    case "raju" => println("bacha2")
    case "parthu" => println("teen2")
    case "rahul" => println("hero2")
    case _ =>println("its me default always")
  }
  
  
}