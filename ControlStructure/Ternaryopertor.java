package ControlStructure;
import java.util.Scanner;
public class Ternaryopertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,max;
        System.out.println("Enter 2 number");
        a=sc.nextInt();
        b=sc.nextInt();
        max=a>b?a:b;
        if(a>b){
       max=a;
        }else {
            max=b;
        }
        System.out.println("max value is"+max);
        }
        }
        
    

