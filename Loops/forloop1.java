package ControlStructure.Loops;
import java.util.Scanner;
public class forloop1 {
    public static void main(String[] args) {
        int i,n,sum=1;
        Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      n=sc.nextInt();
      for(i=1;i<=n;i++) {
        sum=sum*i;
      }
      System.out.println("fact is"+sum);
      }
    }

