package com.myscalaproject.options

class OptionsEmployeeTwo(val fname:String,val middlename:Option[String],val lname:String) {
  
  def this(fname:String,mname: String,lname:String) = {
    this(fname,Some(mname),lname)
  }
  
  def this(fname:String,lname:String) = {
    this(fname,None,lname)
  }
  
  def this() = {
    this("unknown","unknown")
  }
}

object OptionsEmployeeTwoRunner extends App{
  
  val e1 = new OptionsEmployeeTwo("sravy",Some("siva"),"kunduru")
    
    val e2 = new OptionsEmployeeTwo("rahul","pal","raddy")
    
    val e3 = new OptionsEmployeeTwo("Meena","manchikatla")
    
    val e4 = new OptionsEmployeeTwo()
  
    println(e1.middlename.get)
    
   // println(e3.middlename.get)  //--> it will throw exceptions because there is no method get in None object
    
    println(e3.middlename.getOrElse("No middle name"))
    
    println(e4.middlename.getOrElse("No middle name"))
    
    def peelMiddleName(x:Option[String])= {
    x match {
      case Some(name) => name
      case None => "No middle name"
    }
  }
  
  println(peelMiddleName(e1.middlename))
  println(peelMiddleName(e2.middlename))
  println(peelMiddleName(e3.middlename))
  println(peelMiddleName(e4.middlename))
  
  
}