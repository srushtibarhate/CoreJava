package ControlStructure;
import java .util.Scanner;
public class simplechar {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String choice;
    int x,y,z;
    System.out.println("Enter your choice(+,-,*,/):");
    choice =sc.next();
    System.out.println("Enter 2 number");
    x=sc.nextInt();
    y=sc.nextInt();
    switch(choice){
        case"+":
        z=x+y;
System.out.println("Addition is"+z);
break;

case"-":
z=x+y;
System.out.println("Substraction is"+z);
break;

case"*":
z=x+y;
System.out.println("Multiplication is"+z);
break;

case"/":
z=x+y;
System.out.println("Division is"+z);
break;

default:
System.out.println("Wrong choice");
}
  }  
}
