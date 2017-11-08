package com.myscalaproject.options


/**
 * 							option[T]
 * 									|			
 *      |======================= |
 * 			||											||
 * 			||											||	
 * 		Some[T]									None
 */
class OptionsEmployee(fname:String,mname:Option[String],lname:String) {
  
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

object OptionsEmployeeRunner extends App{
  
    val middileName = Some("kunduru")
    val middileName1 : Option[String] = middileName
    val middileName2 : Some[String] = middileName
    
    val noMiddleName = None
    val noMiddleName1:Option[String] = noMiddleName
    val noMiddleName2:Option[Nothing] = noMiddleName    // just like AnyRef is super type of all clases Nothing is subtype of all classes
    val noMiddleName3:None.type = noMiddleName   //None is a object and type of all objects is objectname.type
 
    val e1 = new OptionsEmployee("sravy",Some("siva"),"kunduru")
    
    val e2 = new OptionsEmployee("rahul","pal","raddy")
    
    val e3 = new OptionsEmployee("Meena","manchikatla")
    
    val e4 = new OptionsEmployee()
    
    val e5 = new OptionsEmployee("sravy",Option("siva"),"kunduru")
    
    val e6 = new OptionsEmployee("Subba",None,"raghupathrini")
}