package ControlStructure.Loops;
import java.util.Scanner;
public class whileloop1 {
    public static void main(String[] args) {
        int i,n;
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter no.");
       n=sc.nextInt();
       i=1;
       while(i<=n){
        System.out.println(i);
        i++;
       }
    }
}
