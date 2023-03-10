package ControlStructure;

import java.util.Scanner;
 public class Even {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter a number");
        a=sc.nextInt();
        b=a%2;
        if (b==0) {
             System.out.println("Even"); 
        }
        else{
            System.out.println("Odd"); 
        }
        }
    } 
     

