package ControlStructure;
import java.util.Scanner;
public class Mark {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double m1,m2,m3,m4,m5,p;
    System.out.println("Enter 5 subject mark");
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    m4=sc.nextInt();
    m5=sc.nextInt();
    p=(m1+m2+m3+m4+m5)/5;
    if(p>=90) {
        System.out.println("Grade A");
     } else  if(p>=80) {
        System.out.println("Grade B");
      } else  if  (p>=70) {
        System.out.println("Grade C");
    } else   if(p>=60) {
        System.out.println("Grade D");
    }  else  if(p>=40) {
        System.out.println("Grade E");
     }else {
        System.out.println("Grade F");
        }
    }

}
    









    
    

