package ControlStructure;
import java.util.Scanner;
public class Maximun1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is Max");
        }else if( b>a && b>c){
            System.out.println("B is Max");
        } else {
            System.out.println("C is Max");
        }
        }
        }
    

