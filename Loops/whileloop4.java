package ControlStructure.Loops;
import java.util.Scanner;
public class whileloop4 {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        while(n>=1){
        System.out.println(n);   
        n--; 
        }
    }
}
