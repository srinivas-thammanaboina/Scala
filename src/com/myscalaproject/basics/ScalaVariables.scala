package com.myscalaproject.basics

object ScalaVariables extends App{
  
  val `this is my val with spaces`="Hi Sravy"
  
  println(`this is my val with spaces`)
  
  //scala allows to use reserved keywords as variable names with back tick
  
  val `import`=100
  
  println(`import`+10)
  
  //lazy evaluation
  
  lazy val a = {println("hi rahul");5}
  
  println(a)
  
}