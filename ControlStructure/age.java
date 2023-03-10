package ControlStructure;
import java.util.Scanner;
public class age {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int age;
        System.out.println("Enter your age");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("you can cost a vote");
        }else
        System.out.println("you can not cost a vote");
        }
        
    }


