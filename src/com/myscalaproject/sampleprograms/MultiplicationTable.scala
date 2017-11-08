package com.myscalaproject.sampleprograms

object MultiplicationTable extends App{
  
  //return a row as a sequence
  
  /**'
   * For each iteration of your for loop, yield generates a value which is remembered by the for loop (behind the scenes, like a buffer).
   * When your for loop finishes running, it returns a collection of all these yielded values
   * The type of the collection that is returned is the same type that you were iterating over.
   * 
   */
  def makeRowSeq(row:Int):Seq[String]=
    for(col <- 1 to 10) yield f"${row*col}%4d"
  
  
  // return a row as string
  def makeRow(row:Int)=makeRowSeq(row).mkString
  
  println(makeRowSeq(5))
  
  println(makeRow(5))
  
  //Return table as a string one row per line
  
  def makeLine()={
   val tableSeq =  for(i <- 1 to 10) yield makeRow(i)
   tableSeq.mkString("\n")
  }

  println(makeLine())
 
}