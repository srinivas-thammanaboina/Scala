package com.myscalaproject.classesAndobjects

class SecretAgent(val name:String) {
  
  var totBulletesUsed=0;
  
  def shoot(n:Int){
   import SecretAgent._
   decrementBullets(n)
   totBulletesUsed = totBulletesUsed+n
  }
  
}

object SecretAgent{
  
  private var b:Int=3000
  
  private def decrementBullets(count:Int) {
    if(b-count <=0) b=0
    else b = b-count
  }
  
  def bullets = b
}

class Candidate(val name:String,private val superheroName:String)

object Candidate{
  
  def showSuperHero(s:Candidate)=s.superheroName
}

object TestCompanion extends App{
  
  val sravy = new SecretAgent("sravy")
   val rahul = new SecretAgent("rahul")
   val raju = new SecretAgent("raju")
   val goutham = new SecretAgent("bond")
   val subba = new SecretAgent("subba")
   val divya = new SecretAgent("divya")
   val parthu = new SecretAgent("parthu")
  
  sravy.shoot(400)
  rahul.shoot(300)
  raju.shoot(150)
  goutham.shoot(10)
  subba.shoot(5)
  divya.shoot(5)
  parthu.shoot(200)
  
  println(sravy.totBulletesUsed)
  println(rahul.totBulletesUsed)
  println(raju.totBulletesUsed)
  println(SecretAgent.bullets)
  
  println(Candidate.showSuperHero(new Candidate("rahul pal","Bat Man")))
  
}