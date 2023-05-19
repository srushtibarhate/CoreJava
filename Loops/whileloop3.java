package ControlStructure.Loops;
import java.util.Scanner;
public class whileloop3 {
   public static void main(String[] args) {
    int i,n;Object sum;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    i=1;
    while(i<=n){
        sum=sum+i;
        i++;
    }
    System.out.println("addition is"+sum);
    }
   } 

