package ControlStructure.Loops;
import java.util.Scanner;
public class dowhileloop {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int a,b,c;
String choice;
do {
   System.out.println("enter 2 no");
   a=sc.nextInt();
   b=sc.nextInt();
   c=a+b;
   System.out.println("Addtion is"+c);
   System.out.println("do you want to continue?(yes/no");
   choice=sc.next();
}
while(choice.equals("yes"));
}
   } 

