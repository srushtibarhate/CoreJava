package ControlStructure;
import java.util.Scanner;
public class positive {
   public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
   int n;
    System.out.println("Enter number");
    n=sc.nextInt();
   if(n>0) {
    System.out.println("n is positive");
   }
    else if (n<0){
    System.out.println("n is negative");
   
    }
    else
    {
    System.out.println("n is zero");
   } 
}
   }

