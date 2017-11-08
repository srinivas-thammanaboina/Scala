package com.myscalaproject.classesAndobjects

/**
 * setting up java stype getters and setters
 */

import scala.beans.BeanProperty

/**
 * classes are blue prints
 * 	val creates the accessors, access to the inner state
 * var creates mutators, allowing changes to inner state
 * use java -p great tool to see the java bytecode
 */

class Employee0(val fname:String, var lname:String) // its not a good practice to have vars

class Employee1(val fname:String, val lname:String)

class Employee3(@BeanProperty val fname:String, val lname:String)

// java -p Employee3 => getFname()

class Employee4(val fname:String, @BeanProperty val lname:String)

// java -p Employee3 => getLname() , setLname



object ScalaClasses extends App{
  
  val rahul = new Employee0("rahul","pal")
  
  println(rahul.fname)
  
  rahul.lname= "Reddy"
  
  println(rahul.lname)
  
  
}