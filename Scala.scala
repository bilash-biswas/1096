import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    for(i <- 1 to 9 by 2)
    {
        for(j <- 7 to 5 by -1)
        {
         printf("I=%d J=%d\n",i,j)
        }
    }

}
}
 
