

object Lab {
  def main(args: Array[String]):Unit={
    println("Enter the number till which you want to calculate prime numbers: ")
   val n=scala.io.StdIn.readInt()
   val a=List.range(2,n)
   
    
   val p=2
   val sqrt=scala.math.sqrt(n)
   
   val f=filter(a,p,sqrt,n)
   println(f)
}
  
  def filter(a:List[Int], p:Int, sqrt:Double,n:Int): List[Int]={
    
    if(p>sqrt)
    {
    return a
    }
    else
    {
      
      val nlist=a.filter(a => !(a % p == 0 && a != p))
       return filter(nlist,p+1,sqrt,n)
       
    }
    
  }
    
    
    
  
 }