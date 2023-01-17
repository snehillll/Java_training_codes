import java.util.*;

public class Cube {
   
   public static double cubes(int a){
      return Math.pow(a,3);
   }
   
   
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      System.out.println("Cube of the given number is "+ cubes(num));
      
   }
}
