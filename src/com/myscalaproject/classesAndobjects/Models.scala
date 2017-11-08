package com.myscalaproject.basics

import scala.beans.BeanProperty

abstract class Person {
    
  def firstName:String
  def lastName:String
}

class Employee(@BeanProperty val firstName:String,@BeanProperty val lastName:String,
                val title:String="Programmer") extends Person{
  
                require(firstName.nonEmpty,"first name should not be empty")
                require(lastName.nonEmpty,"last name should not be empty")
                require(title.nonEmpty,"title should not be empty")
                
                if (title.contains("Senior") || title.contains("Junior")) 
         throw new IllegalArgumentException("Title cannot contain Junior or Senior")

                
          //A typical form with side effects
          /*def this(fname:String,lname:String) {
                  this(fname,lname,"programmer")
                  println("A side effect is found")
                }*/
                
                /* def this(fname:String,lname:String) = {
                  this(fname,lname,"programmer")
                  println("A side effect is found")
                }*/
                
         //A typical form with out equals
      /*   def this(fname:String,lname:String) {
                  this(fname,lname,"programmer")
                 }*/
               /* def this(fname:String,lname:String) = {
                  this(fname,lname,"programmer")
                 }*/
                
              def fullName=s"$firstName $lastName"
              def copy(firstName:String=this.firstName,lastName:String=this.lastName,title:String=this.title) = {
                  new Employee(firstName,lastName,title)
                }
  
                
           override def equals(s:Any):Boolean = {
             
             if (!s.isInstanceOf[Employee]) false
             else{
               val emp = s.asInstanceOf[Employee]
               emp.firstName.equals(this.firstName) && emp.lastName.equals(this.lastName) && emp.title.equals(this.title)
             }
           }
           
           override def hashCode:Int = {
             var result = 19
             result = 31*result*firstName.hashCode
             result = 31*result*lastName.hashCode
             result=31*result*title.hashCode
             result
           }
 }

case class Department(name:String)


class Managers(fName:String,lName:String,titl:String,val department:Department) extends Employee(fName,lName,titl){
  
  override def fullName = s"$fName $lName ${department.name} manager"
  
  /*def copy(firstName:String=this.firstName,lastName:String=this.lastName,title:String=this.title,
          department:Department=this.department)= {
    new Managers(firstName,lastName,title,department)
  }*/
  
   def copyManager(firstName:String = this.fName, lastName:String = this.lName,
             title:String = this.titl, department:Department = this.department) = {
        new Managers(firstName, lastName, title, department)
     }

}

object TestClassExample extends App{
  
  val rahul = new Employee("rahul","pal")
  
  println(rahul.firstName)
  
  val newRahul = rahul.copy(lastName="thumma")
  
 println(newRahul.lastName)
  
 println(newRahul.title)
 
 val dennis = new Employee(lastName="Ritchie", firstName="Dennis")
println(s"The first name is ${dennis.firstName}")
println(s"The last name is ${dennis.lastName}")

println(rahul.fullName)
println(newRahul.fullName)
println(dennis.fullName)

try{
  new Employee("srini","","hero")
}catch{
  case iae:IllegalArgumentException => println(iae.getMessage)
 }finally{
   println("executing finally block")
 }
 
 try {
  new Employee("Linus", "Torvalds", "Senior C Programmer")
} catch {
  case iae:IllegalArgumentException => println(iae.getMessage)
} finally {
  println("Continuing with our program")
}

val mathermatics = new Department("Mathematics")


val alan:Managers = new Managers("Alan","Turing","mathematician",mathermatics)

println(alan.department.name)

val alanEmployee : Employee = alan

println(rahul.firstName)
println(newRahul.firstName)
println(dennis.firstName)
println(alan.firstName)
println(alanEmployee.firstName)

def extractFirstName(e:Employee) = e.firstName

println(extractFirstName(rahul))
println(extractFirstName(dennis))
println(extractFirstName(alan))

println(rahul.fullName)
println(newRahul.fullName)
println(dennis.fullName)
println(alan.fullName)
println(alanEmployee.fullName)

val alanNewJob = alan.copyManager(title="Encryption specialist")

println(alanNewJob.title)

val alanNewDept = alan.copyManager(department=new Department("Science"))

println(alanNewDept.department.name)

val alanPerson: Person = alanEmployee



  val sravy = new Employee("sravy","kunduru")

  val cutiepie = new Employee("sravy","kunduru")

  println(sravy==cutiepie)
  
   println(sravy!=cutiepie)
   
   println(sravy eq cutiepie)  // checking object reference - false
   
   val sravycutie = sravy
   
   println(sravy eq sravycutie) // true

val anotherSravy = new Employee("sravanthi","kunduru")

println(sravy.hashCode() == cutiepie.hashCode())  //true

println(sravy.hashCode() == anotherSravy.hashCode()) // false


}







